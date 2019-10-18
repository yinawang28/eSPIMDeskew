package eSPIMdeskew;

import org.micromanager.PropertyMap;
import org.micromanager.Studio;
import org.micromanager.data.ProcessorConfigurator;
import org.micromanager.data.ProcessorFactory;
import org.micromanager.data.ProcessorPlugin;
import org.scijava.plugin.Plugin;
import org.scijava.plugin.SciJavaPlugin;

/**
 * MM2 on-the-fly plug-in for eSPIM deskew 
 * This plug-in use MM2 PRocessorPlugin interface
 * 
 * @author Yina
 */

@Plugin(type = ProcessorPlugin.class)
public class Deskew implements ProcessorPlugin, SciJavaPlugin{
    private Studio studio_;
    DeskewConfigurator myConfigurator;
    
    @Override
    public ProcessorConfigurator createConfigurator(PropertyMap settings) {      
        myConfigurator = new DeskewConfigurator(studio_, settings);
        
        return myConfigurator;
    }

    @Override
    public ProcessorFactory createFactory(PropertyMap settings) {
        return new DeskewFactory(myConfigurator, studio_);
    }

    @Override
    public void setContext(Studio studio) {
        studio_=studio;
    }

    @Override
    public String getName() {
        return "eSPIM deskew";
    }

    @Override
    public String getHelpText() {
        return "Deskew eSPIM data during acquisition";
    }

    @Override
    public String getVersion() {
        return "1";
        
        }

    @Override
    public String getCopyright() {
        return "UCSF, 2019";

    }
    
}
