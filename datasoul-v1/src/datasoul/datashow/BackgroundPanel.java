/* 
 * Copyright 2005-2008 Samuel Mello & Eduardo Schnell
 *
 *   This program is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation; version 2 of the License.
 * 
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 * 
 */

/*
 * BackgroundPanel.java
 *
 * Created on 13 July 2006, 00:00
 */

package datasoul.datashow;

import datasoul.config.BackgroundConfig;
import datasoul.config.ConfigObj;
import datasoul.render.ContentManager;
import datasoul.templates.DisplayTemplate;
import datasoul.templates.ImageTemplateItem;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;

/**
 *
 * @author  samuelm
 */
public class BackgroundPanel extends javax.swing.JPanel {
    
    /** Creates new form BackgroundPanel */
    public BackgroundPanel() {
        
        initComponents();

        BufferedImage img1 = BackgroundConfig.getInstance().getMainBackgroundImg();
        BufferedImage img2 = BackgroundConfig.getInstance().getMonitorBackgroundImg();
        
        imageDisplayMain.getImageTemplateItem().setStretchIdx(ImageTemplateItem.STRETCH_NO);
        imageDisplayMain.getImageTemplateItem().setAlignmentIdx(ImageTemplateItem.ALIGN_CENTER);
        imageDisplayMain.getImageTemplateItem().setVerticalAlignmentIdx(ImageTemplateItem.VALIGN_MIDDLE);
        imageDisplayMain.updateSize();
        
        imageDisplayMonitor.getImageTemplateItem().setStretchIdx(ImageTemplateItem.STRETCH_NO);
        imageDisplayMonitor.getImageTemplateItem().setAlignmentIdx(ImageTemplateItem.ALIGN_CENTER);
        imageDisplayMonitor.getImageTemplateItem().setVerticalAlignmentIdx(ImageTemplateItem.VALIGN_MIDDLE);
        imageDisplayMonitor.updateSize();
        
        imageDisplayMain.getImageTemplateItem().setImage(img1);
        imageDisplayMonitor.getImageTemplateItem().setImage(img2);
        
        pnlMonitor.setVisible( ConfigObj.getInstance().getMonitorOutput() );

    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnChangeMain = new javax.swing.JButton();
        btnColorMain = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        imageDisplayMain = new datasoul.util.ImageDisplay();
        pnlMonitor = new javax.swing.JPanel();
        btnMonitorColor = new javax.swing.JButton();
        btnChangeMonitor = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        imageDisplayMonitor = new datasoul.util.ImageDisplay();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Main Output"));

        btnChangeMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasoul/icons/looknfeel_1.png"))); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("datasoul/internationalize"); // NOI18N
        btnChangeMain.setText(bundle.getString("Image")); // NOI18N
        btnChangeMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeMainActionPerformed(evt);
            }
        });

        btnColorMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasoul/icons/colors.png"))); // NOI18N
        btnColorMain.setText(bundle.getString("Color")); // NOI18N
        btnColorMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorMainActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        imageDisplayMain.setPreferredSize(new java.awt.Dimension(160, 120));

        org.jdesktop.layout.GroupLayout imageDisplayMainLayout = new org.jdesktop.layout.GroupLayout(imageDisplayMain);
        imageDisplayMain.setLayout(imageDisplayMainLayout);
        imageDisplayMainLayout.setHorizontalGroup(
            imageDisplayMainLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 160, Short.MAX_VALUE)
        );
        imageDisplayMainLayout.setVerticalGroup(
            imageDisplayMainLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 120, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(imageDisplayMain, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(imageDisplayMain, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(btnColorMain, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(btnChangeMain, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(btnChangeMain)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnColorMain))
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnlMonitor.setBorder(javax.swing.BorderFactory.createTitledBorder("Monitor Output"));

        btnMonitorColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasoul/icons/colors.png"))); // NOI18N
        btnMonitorColor.setText(bundle.getString("Color")); // NOI18N
        btnMonitorColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonitorColorActionPerformed(evt);
            }
        });

        btnChangeMonitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasoul/icons/looknfeel_1.png"))); // NOI18N
        btnChangeMonitor.setText(bundle.getString("Image")); // NOI18N
        btnChangeMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeMonitorActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        org.jdesktop.layout.GroupLayout imageDisplayMonitorLayout = new org.jdesktop.layout.GroupLayout(imageDisplayMonitor);
        imageDisplayMonitor.setLayout(imageDisplayMonitorLayout);
        imageDisplayMonitorLayout.setHorizontalGroup(
            imageDisplayMonitorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 160, Short.MAX_VALUE)
        );
        imageDisplayMonitorLayout.setVerticalGroup(
            imageDisplayMonitorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 120, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(imageDisplayMonitor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(imageDisplayMonitor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        org.jdesktop.layout.GroupLayout pnlMonitorLayout = new org.jdesktop.layout.GroupLayout(pnlMonitor);
        pnlMonitor.setLayout(pnlMonitorLayout);
        pnlMonitorLayout.setHorizontalGroup(
            pnlMonitorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlMonitorLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pnlMonitorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(btnMonitorColor, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(btnChangeMonitor, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMonitorLayout.setVerticalGroup(
            pnlMonitorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlMonitorLayout.createSequentialGroup()
                .add(pnlMonitorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlMonitorLayout.createSequentialGroup()
                        .add(btnChangeMonitor)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnMonitorColor))
                    .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, pnlMonitor, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pnlMonitor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMonitorColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonitorColorActionPerformed

        JColorChooser cc = new JColorChooser();
        Color color =  cc.showDialog(this, java.util.ResourceBundle.getBundle("datasoul/internationalize").getString("Choose_color"), Color.BLACK);
        if (color != null){ // color is null if the user choose cancel.
            BufferedImage img = new BufferedImage(DisplayTemplate.TEMPLATE_WIDTH, DisplayTemplate.TEMPLATE_HEIGHT, BufferedImage.TYPE_4BYTE_ABGR);
            Graphics2D g = img.createGraphics();
            g.setColor(color);
            g.fillRect(0, 0, DisplayTemplate.TEMPLATE_WIDTH, DisplayTemplate.TEMPLATE_HEIGHT);
            imageDisplayMonitor.getImageTemplateItem().setImage(img);
            BackgroundConfig.getInstance().setMonitorBackgroundImg(img);
            imageDisplayMonitor.updateSize();
            imageDisplayMonitor.repaint();
        }
        
    }//GEN-LAST:event_btnMonitorColorActionPerformed

    private void btnColorMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorMainActionPerformed

        JColorChooser cc = new JColorChooser();
        Color color =  cc.showDialog(this, java.util.ResourceBundle.getBundle("datasoul/internationalize").getString("Choose_color"), Color.BLACK);
        if (color != null){ // color is null if the user choose cancel.
            BufferedImage img = new BufferedImage(DisplayTemplate.TEMPLATE_WIDTH, DisplayTemplate.TEMPLATE_HEIGHT, BufferedImage.TYPE_4BYTE_ABGR);
            Graphics2D g = img.createGraphics();
            g.setColor(color);
            g.fillRect(0, 0, DisplayTemplate.TEMPLATE_WIDTH, DisplayTemplate.TEMPLATE_HEIGHT);
            imageDisplayMain.getImageTemplateItem().setImage(img);
            BackgroundConfig.getInstance().setMainBackgroundImg(img);
            imageDisplayMain.updateSize();
            imageDisplayMain.repaint();
        }
        
    }//GEN-LAST:event_btnColorMainActionPerformed

    private void btnChangeMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeMonitorActionPerformed

        JFileChooser fc = new JFileChooser();
        File dir = new File (System.getProperty("user.dir"));
        fc.setCurrentDirectory(dir);
        fc.setDialogType(JFileChooser.OPEN_DIALOG);
        fc.setMultiSelectionEnabled(false);
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fc.setControlButtonsAreShown(true);
        fc.setDialogTitle(java.util.ResourceBundle.getBundle("datasoul/internationalize").getString("Select_Image"));
        if(fc.showOpenDialog(this)==JFileChooser.APPROVE_OPTION && fc.getSelectedFile().exists() ){
            String filename = fc.getSelectedFile().getAbsolutePath();
            imageDisplayMonitor.getImageTemplateItem().loadImage(filename);
            BackgroundConfig.getInstance().setMonitorBackgroundImg( imageDisplayMonitor.getImageTemplateItem().getImage() );
            imageDisplayMonitor.updateSize();
            imageDisplayMonitor.repaint();
        }        
        
    }//GEN-LAST:event_btnChangeMonitorActionPerformed

    private void btnChangeMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeMainActionPerformed

        JFileChooser fc = new JFileChooser();
        File dir = new File (System.getProperty("user.dir"));
        fc.setCurrentDirectory(dir);
        fc.setDialogType(JFileChooser.OPEN_DIALOG);
        fc.setMultiSelectionEnabled(false);
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fc.setControlButtonsAreShown(true);
        fc.setDialogTitle(java.util.ResourceBundle.getBundle("datasoul/internationalize").getString("Select_Image"));
        if(fc.showOpenDialog(this)==JFileChooser.APPROVE_OPTION && fc.getSelectedFile().exists() ){
            String filename = fc.getSelectedFile().getAbsolutePath();
            imageDisplayMain.getImageTemplateItem().loadImage(filename);
            BackgroundConfig.getInstance().setMainBackgroundImg( imageDisplayMain.getImageTemplateItem().getImage() );
            imageDisplayMain.updateSize();
            imageDisplayMain.repaint();
        }        
        
    }//GEN-LAST:event_btnChangeMainActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeMain;
    private javax.swing.JButton btnChangeMonitor;
    private javax.swing.JButton btnColorMain;
    private javax.swing.JButton btnMonitorColor;
    private datasoul.util.ImageDisplay imageDisplayMain;
    private datasoul.util.ImageDisplay imageDisplayMonitor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel pnlMonitor;
    // End of variables declaration//GEN-END:variables
    
}
