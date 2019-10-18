package eSPIMdeskew;

import org.micromanager.PropertyMap;
import org.micromanager.Studio;
import org.micromanager.data.ProcessorConfigurator;
import org.micromanager.acquisition.SequenceSettings;
/**
 *
 * @author Yina
 */
public class DeskewConfigurator extends javax.swing.JFrame implements ProcessorConfigurator{
    
    private Studio studio_;
    /**
     * Creates new form NewJFrame
     */
    public DeskewConfigurator() {
        initComponents();
    }
    
    public DeskewConfigurator(Studio studio, PropertyMap settings) {
        initComponents();
        studio_=studio;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField_zstep = new javax.swing.JTextField();
        jLabel_zstep = new javax.swing.JLabel();
        jLabel_zstepunit = new javax.swing.JLabel();
        jLabel_Pixelsize = new javax.swing.JLabel();
        jTextField_Pixelsize = new javax.swing.JTextField();
        jLabel_Pixelsizeunit = new javax.swing.JLabel();
        jLabel_Angle = new javax.swing.JLabel();
        jTextField_Angle = new javax.swing.JTextField();
        jLabel_angleunit = new javax.swing.JLabel();
        jLabel_timepoint = new javax.swing.JLabel();
        jTextField_interval = new javax.swing.JTextField();
        jCheckBox_saveDeskewFile = new javax.swing.JCheckBox();
        jCheckBox_saveLogFile = new javax.swing.JCheckBox();
        jCheckBox_wideFieldCorrection = new javax.swing.JCheckBox();
        jTextField_posGroupNum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_zStageName = new javax.swing.JTextField();
        jCheckBox_posAdj = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField_zstep.setText("0.8");
        jTextField_zstep.setToolTipText("");
        jTextField_zstep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField_zstepMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField_zstepMouseExited(evt);
            }
        });

        jLabel_zstep.setText("z_step");

        jLabel_zstepunit.setText("(um)");

        jLabel_Pixelsize.setText("Pixelsize");

        jTextField_Pixelsize.setText("133");
        jTextField_Pixelsize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField_PixelsizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField_PixelsizeMouseExited(evt);
            }
        });

        jLabel_Pixelsizeunit.setText("(nm)");

        jLabel_Angle.setText("Lightsheet angle");

        jTextField_Angle.setText("30");
        jTextField_Angle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField_AngleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField_AngleMouseExited(evt);
            }
        });

        jLabel_angleunit.setText("(degree)");

        jLabel_timepoint.setText("Volume interval to deskew:");

        jTextField_interval.setText("1");

        jCheckBox_saveDeskewFile.setSelected(true);
        jCheckBox_saveDeskewFile.setText("Save deskew file");

        jCheckBox_saveLogFile.setSelected(true);
        jCheckBox_saveLogFile.setText("Save log file");

        jCheckBox_wideFieldCorrection.setText("Wide field correction");

        jTextField_posGroupNum.setText("1");

        jLabel1.setText("Position Group Number");

        jLabel2.setText("stage");

        jTextField_zStageName.setText("TIZDrive");
        jTextField_zStageName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_zStageNameActionPerformed(evt);
            }
        });

        jCheckBox_posAdj.setText("Position adjusting");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel_zstep, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_zstep, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jTextField_Angle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel_Pixelsize)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField_Pixelsize, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox_saveDeskewFile)
                            .addComponent(jLabel_Angle, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_timepoint)
                            .addComponent(jLabel1)
                            .addComponent(jCheckBox_wideFieldCorrection)
                            .addComponent(jCheckBox_saveLogFile)
                            .addComponent(jLabel2)
                            .addComponent(jCheckBox_posAdj))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_zstepunit)
                    .addComponent(jLabel_Pixelsizeunit)
                    .addComponent(jLabel_angleunit)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField_posGroupNum, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField_interval, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                    .addComponent(jTextField_zStageName, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_zstep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_zstep, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Pixelsize)
                            .addComponent(jTextField_Pixelsize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Pixelsizeunit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Angle, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Angle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_angleunit)))
                    .addComponent(jLabel_zstepunit))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox_saveDeskewFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_timepoint)
                    .addComponent(jTextField_interval, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox_saveLogFile)
                .addGap(23, 23, 23)
                .addComponent(jCheckBox_wideFieldCorrection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_posGroupNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_zStageName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox_posAdj)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_zstepMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_zstepMouseEntered
        if(studio_.acquisitions().isAcquisitionRunning()){
            jTextField_zstep.disable();
        }
    }//GEN-LAST:event_jTextField_zstepMouseEntered

    private void jTextField_zstepMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_zstepMouseExited
        jTextField_zstep.enable();
    }//GEN-LAST:event_jTextField_zstepMouseExited

    private void jTextField_PixelsizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_PixelsizeMouseEntered
        if(studio_.acquisitions().isAcquisitionRunning()){
            jTextField_Pixelsize.disable();
        }
    }//GEN-LAST:event_jTextField_PixelsizeMouseEntered

    private void jTextField_PixelsizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_PixelsizeMouseExited
        jTextField_Pixelsize.enable();
    }//GEN-LAST:event_jTextField_PixelsizeMouseExited

    private void jTextField_AngleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_AngleMouseEntered
        if(studio_.acquisitions().isAcquisitionRunning()){
            jTextField_Angle.disable();
            jTextField_Angle.setToolTipText("Editting disabled during acquisition!");
        }
    }//GEN-LAST:event_jTextField_AngleMouseEntered

    private void jTextField_AngleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_AngleMouseExited
        jTextField_Angle.enable();
    }//GEN-LAST:event_jTextField_AngleMouseExited

    private void jTextField_zStageNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_zStageNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_zStageNameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DeskewConfigurator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeskewConfigurator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeskewConfigurator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeskewConfigurator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeskewConfigurator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox_posAdj;
    private javax.swing.JCheckBox jCheckBox_saveDeskewFile;
    private javax.swing.JCheckBox jCheckBox_saveLogFile;
    private javax.swing.JCheckBox jCheckBox_wideFieldCorrection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Angle;
    private javax.swing.JLabel jLabel_Pixelsize;
    private javax.swing.JLabel jLabel_Pixelsizeunit;
    private javax.swing.JLabel jLabel_angleunit;
    private javax.swing.JLabel jLabel_timepoint;
    private javax.swing.JLabel jLabel_zstep;
    private javax.swing.JLabel jLabel_zstepunit;
    private javax.swing.JTextField jTextField_Angle;
    private javax.swing.JTextField jTextField_Pixelsize;
    private javax.swing.JTextField jTextField_interval;
    private javax.swing.JTextField jTextField_posGroupNum;
    private javax.swing.JTextField jTextField_zStageName;
    private javax.swing.JTextField jTextField_zstep;
    // End of variables declaration//GEN-END:variables
    
    public double getZstep() {
      return (double) Double.parseDouble(jTextField_zstep.getText());
    }
    
    public double getAngle() {
      return (double) Double.parseDouble(jTextField_Angle.getText());
    }
    
    public int getPixelsize() {
      return (int) Integer.parseInt(jTextField_Pixelsize.getText());
    }
    
    public int getVolumeinterval() {
      return (int) Integer.parseInt(jTextField_interval.getText());
    }
    
    public boolean getSaveFileCheckbox(){
        return (boolean) jCheckBox_saveDeskewFile.isSelected();
    }
    public boolean getSaveLogFileCheckbox(){
        return (boolean) jCheckBox_saveLogFile.isSelected();
    }
    
    public boolean getWideFieldCorrectionCheckBox(){
        return (boolean) jCheckBox_wideFieldCorrection.isSelected();
    }
    
    public int getPositionGroupNum() {
      return (int) Integer.parseInt(jTextField_posGroupNum.getText());
    }
    
    public String getzStageName() {
      return (String) jTextField_zStageName.getText();
    }
    
    public boolean getPosAdjCheckBox(){
        return (boolean) jCheckBox_posAdj.isSelected();
    }
    
    @Override
    public void showGUI() {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("eSPIM deskew");
        
        setVisible(true);
    }

    @Override
    public void cleanup() {   
    }

    @Override
    public PropertyMap getSettings() { 
        PropertyMap.PropertyMapBuilder builder = studio_.data().getPropertyMapBuilder();
        return builder.build();
    }
}
