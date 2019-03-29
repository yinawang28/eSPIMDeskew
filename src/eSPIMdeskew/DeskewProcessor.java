/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eSPIMdeskew;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import mmcorej.CMMCore;
import org.micromanager.Studio;
import org.micromanager.data.Image;
import org.micromanager.data.Processor;
import org.micromanager.data.ProcessorContext;
import org.micromanager.acquisition.SequenceSettings;
import org.micromanager.data.Datastore;
import org.micromanager.data.Coords;
import org.micromanager.data.Metadata;
import javax.swing.JOptionPane;
/**
 *
 * @author Yina
 */
public class DeskewProcessor extends Processor{
    Studio studio_;
    CMMCore mmc;
    SequenceSettings seqSettings_;
    Datastore deskew;
    DeskewConfigurator Configurator_;
    
    volatile int deskewVolumeid = 0;
    
    public int imageWidth,imageHight, newDeskewSize;
    public int framePerVolume;
    public double deskewfactor;
    static boolean startDeskewDisplay = false;
    
    public static int interval_;
    
    public DeskewProcessor(Studio studio, DeskewConfigurator MyConfigurator)
    {
        studio_=studio;
        mmc=studio_.getCMMCore();
        Configurator_ = MyConfigurator;
        seqSettings_ = studio_.acquisitions().getAcquisitionSettings();
        interval_ = Configurator_.getVolumeinterval();
        
        double zstep = Configurator_.getZstep();
        double angle = Configurator_.getAngle();
        int pixelsize = Configurator_.getPixelsize();
        
        imageWidth = (int) mmc.getImageWidth();
        imageHight = (int) mmc.getImageHeight();
        framePerVolume = (int) seqSettings_.slices.size();
        deskewfactor = (float)  Math.cos(angle * Math.PI / 180) * zstep / (pixelsize / 1000.0);
        //TODO: should consider the input from imageflipper
        newDeskewSize = (int) Math.ceil(imageWidth + deskewfactor * framePerVolume); 
    }
    
    @Override
    public void processImage(Image image, ProcessorContext pc) {
        //get the coords of the image
        int timeIndex = image.getCoords().getTimePoint();
        int zIndex = image.getCoords().getZ();
        
        //check interval_ updating at the beginning of each volume
        if (zIndex == 0){
            interval_ = Configurator_.getVolumeinterval();
        }
        
        if(timeIndex % interval_ == 0){
            //initialize deskew datastore at the beginning
            if(timeIndex == 0 && zIndex == 0){
                Image deskewed = deskewSingleImage(image, framePerVolume, newDeskewSize, (float) deskewfactor);
                deskew = studio_.displays().show(deskewed);
            }else{
                //add new images to deskew datastore
                Image deskewed = deskewSingleImage(image, framePerVolume, newDeskewSize, (float) deskewfactor);
                try {
                    deskew.putImage(deskewed);
                } catch (IOException ex) {
                    Logger.getLogger(DeskewProcessor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (zIndex == (framePerVolume - 1)){
                deskewVolumeid++;
            }
        }
                   
        pc.outputImage(image);  
    }
    
    private Image deskewSingleImage(Image image, int framePerVolume, int newDeskewSize, float deskewFactor){
        Image newimage; 
        short[] deskewpixels = new short[imageHight * newDeskewSize];
        short rawpixels[] =(short[]) image.getRawPixels();        //reference to rawpixels of image
        //Object deskewpixels = image.getRawPixelsCopy();
        
        Coords.CoordsBuilder coordsBuilder = image.getCoords().copy();               //get coords builder
        Metadata.MetadataBuilder metadataBuilder = image.getMetadata().copy();        //get metadata builder
        coordsBuilder.time(deskewVolumeid);
        Coords coords = coordsBuilder.build();
        Metadata metadata = metadataBuilder.build();
        
        //image pixel translation
        int zout = image.getCoords().getZ();
        int nz = framePerVolume;
        short zeropad = 0;
        
        //TODO: Bottom-up flip; rotate 270degree
        for(int yout=0; yout < imageHight; yout++){
            for(int xout=0; xout < newDeskewSize; xout++){
                float xin = (float) ((xout - newDeskewSize/2.) - deskewFactor*(zout-nz/2.) + imageWidth/2.);
                if (xin >= 0 && xin < imageWidth - 1){
                    int index = yout*imageWidth + (int)Math.floor(xin);
                    float offset = (float) (xin - Math.floor(xin));
                    short weighted = (short)((1-offset)*rawpixels[index] + offset*rawpixels[index+1]);
                    deskewpixels[yout*newDeskewSize+xout] = weighted;
                }else{
                    deskewpixels[yout*newDeskewSize+xout]=zeropad;
                }
            }
        }
        newimage = studio_.data().createImage(deskewpixels, newDeskewSize, imageHight, 2, 1, coords, metadata);
        return newimage;
    }
}
