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
 * AddSongForm.java
 *
 * Created on 9 de Marco de 2006, 20:41
 */

package datasoul.serviceitems.song;

import datasoul.DatasoulMainForm;
import datasoul.util.ObjectManager;
import javax.swing.event.TableModelEvent;

/**
 *
 * @author  Administrador
 */
public class AddSongForm extends javax.swing.JFrame  implements javax.swing.event.TableModelListener{
    
    /** Creates new form AddSongForm */
    public AddSongForm() {
        initComponents();
        DatasoulMainForm.setDatasoulIcon(this);
        
        this.songsSearchPanel.usingInAddSongItemPanel(this);
        
        ObjectManager.getInstance().setAddSongForm(this);
        
        this.songsSearchPanel.setSourceView(ObjectManager.VIEW_ADD_SONGS);
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        songsSearchPanel = new datasoul.serviceitems.song.SongsSearchPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textSong = new javax.swing.JTextPane();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSongName = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("datasoul/internationalize"); // NOI18N
        setTitle(bundle.getString("Add_Song")); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                onWindowClosed(evt);
            }
        });

        jSplitPane1.setDividerLocation(250);
        jSplitPane1.setLeftComponent(songsSearchPanel);

        jScrollPane1.setViewportView(textSong);

        jToolBar1.setFloatable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasoul/icons/v2/stock_zoom-object.png"))); // NOI18N
        jLabel1.setText(bundle.getString("Preview")); // NOI18N
        jToolBar1.add(jLabel1);

        jLabel2.setText(bundle.getString("Author:")); // NOI18N

        jLabel3.setText(bundle.getString("Song:")); // NOI18N

        lblSongName.setText("     ");

        lblAuthor.setText("     ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSongName)
                    .addComponent(lblAuthor))
                .addContainerGap(301, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblSongName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblAuthor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onWindowClosed
        ObjectManager.getInstance().setAddSongForm(null);
    }//GEN-LAST:event_onWindowClosed

    public void tableChanged(TableModelEvent e) {
        this.repaint();
    }
    
    public void viewSong(Song song) {
        lblSongName.setText(song.getTitle());
        lblAuthor.setText(song.getSongAuthor());
        textSong.setText(song.getText().replace(Song.CHORUS_MARK, "").replace(Song.SLIDE_BREAK, ""));
        textSong.setCaretPosition(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblSongName;
    private datasoul.serviceitems.song.SongsSearchPanel songsSearchPanel;
    private javax.swing.JTextPane textSong;
    // End of variables declaration//GEN-END:variables
    
}