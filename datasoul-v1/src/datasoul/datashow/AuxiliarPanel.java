/*
 * AuxiliarPanel.java
 *
 * Created on 26 de Dezembro de 2005, 23:37
 */

package datasoul.datashow;

import datasoul.*;
import datasoul.util.*;
import datasoul.datashow.*;
import datasoul.song.*;

/**
 *
 * @author  Administrador
 */
public class AuxiliarPanel extends javax.swing.JPanel {

    private DatashowPanel objectManager;
    
    /**
     * Creates new form AuxiliarPanel
     */
    public AuxiliarPanel() {
        initComponents();
    }

    public DatashowPanel getObjectManager() {
        return objectManager;
    }

    public void setObjectManager(DatashowPanel objectManager) {
        this.objectManager = objectManager;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        tabAuxiliar = new javax.swing.JTabbedPane();
        panelDisplay = new javax.swing.JPanel();
        btnBlack = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        panelClock = new javax.swing.JPanel();
        panelMessage = new javax.swing.JPanel();

        tabAuxiliar.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        tabAuxiliar.setMaximumSize(new java.awt.Dimension(32767, 250));
        tabAuxiliar.setMinimumSize(new java.awt.Dimension(80, 0));
        btnBlack.setText("Black");

        btnClear.setText("Clear");

        org.jdesktop.layout.GroupLayout panelDisplayLayout = new org.jdesktop.layout.GroupLayout(panelDisplay);
        panelDisplay.setLayout(panelDisplayLayout);
        panelDisplayLayout.setHorizontalGroup(
            panelDisplayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.LEADING, panelDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .add(panelDisplayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, btnClear, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(btnBlack, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        panelDisplayLayout.setVerticalGroup(
            panelDisplayLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.LEADING, panelDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .add(btnBlack)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnClear)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        tabAuxiliar.addTab("Display", panelDisplay);

        org.jdesktop.layout.GroupLayout panelClockLayout = new org.jdesktop.layout.GroupLayout(panelClock);
        panelClock.setLayout(panelClockLayout);
        panelClockLayout.setHorizontalGroup(
            panelClockLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 329, Short.MAX_VALUE)
        );
        panelClockLayout.setVerticalGroup(
            panelClockLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 124, Short.MAX_VALUE)
        );
        tabAuxiliar.addTab(java.util.ResourceBundle.getBundle("datasoul/internationalize").getString("CLOCK"), panelClock);

        org.jdesktop.layout.GroupLayout panelMessageLayout = new org.jdesktop.layout.GroupLayout(panelMessage);
        panelMessage.setLayout(panelMessageLayout);
        panelMessageLayout.setHorizontalGroup(
            panelMessageLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 329, Short.MAX_VALUE)
        );
        panelMessageLayout.setVerticalGroup(
            panelMessageLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 124, Short.MAX_VALUE)
        );
        tabAuxiliar.addTab(java.util.ResourceBundle.getBundle("datasoul/internationalize").getString("MESSAGE"), panelMessage);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tabAuxiliar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tabAuxiliar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBlack;
    private javax.swing.JButton btnClear;
    private javax.swing.JPanel panelClock;
    private javax.swing.JPanel panelDisplay;
    private javax.swing.JPanel panelMessage;
    private javax.swing.JTabbedPane tabAuxiliar;
    // End of variables declaration//GEN-END:variables
    
}
