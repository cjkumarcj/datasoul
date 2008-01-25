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
 * SongsSearchPanel.java
 *
 * Created on 22 de Dezembro de 2005, 21:32
 */

package datasoul.song;

import datasoul.*;
import datasoul.util.*;
import datasoul.datashow.*;
import datasoul.song.*;
import datasoul.util.ObjectManager;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.plaf.basic.BasicDirectoryModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/**
 *
 * @author  Administrador
 */
public class SongsSearchPanel extends javax.swing.JPanel implements javax.swing.event.TableModelListener{

    private AllSongsListTable allSongsListTable;
    private JFrame frameParent;
    private int songColumn;
    /**
     * Creates new form SongsSearchPanel
     */
    public SongsSearchPanel() {
        initComponents();

        tableSongList.setDroppable(false);
        
        comboField.removeAllItems();
        comboField.addItem("All");
        comboField.addItem("FileName");
        comboField.addItem("Title");
        comboField.addItem("SongAuthor");
        comboField.addItem("Text");
        comboField.setSelectedIndex(0);
        
        allSongsListTable = AllSongsListTable.getInstance();

        tableSongList.setModel(allSongsListTable);

        this.btnClose.setVisible(false);
        
        songColumn = allSongsListTable.getSongColumn();

        tableSongList.setShowVerticalLines(false);
        
        TableColumn col1 = tableSongList.getColumnModel().getColumn(0);
        col1.setMaxWidth(30);
        col1.setMinWidth(30);
//        tableSongList.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dnDTable1 = new datasoul.util.DnDTable();
        fileMenu = new javax.swing.JPopupMenu();
        actImportSongsToDatabase = new javax.swing.JMenuItem();
        fieldString = new javax.swing.JTextField();
        comboField = new javax.swing.JComboBox();
        labelString = new javax.swing.JLabel();
        labelField = new javax.swing.JLabel();
        toolBar = new javax.swing.JToolBar();
        btnNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAddToList = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        scroolSongList = new javax.swing.JScrollPane();
        tableSongList = new datasoul.util.DnDTable();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnFile = new javax.swing.JButton();

        dnDTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(dnDTable1);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("datasoul/internationalize"); // NOI18N
        fileMenu.setLabel(bundle.getString("File")); // NOI18N

        actImportSongsToDatabase.setText(bundle.getString("Import_Songs_To_Database")); // NOI18N
        actImportSongsToDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actImportSongsToDatabaseActionPerformed(evt);
            }
        });
        fileMenu.add(actImportSongsToDatabase);

        fieldString.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldStringKeyPressed(evt);
            }
        });

        comboField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelString.setText(bundle.getString("Search")); // NOI18N

        labelField.setText(bundle.getString("FIELD")); // NOI18N

        toolBar.setBorder(null);
        toolBar.setOpaque(false);

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasoul/icons/filenew.png"))); // NOI18N
        btnNew.setText(bundle.getString("New")); // NOI18N
        btnNew.setToolTipText(bundle.getString("Create_a_new_song_...")); // NOI18N
        btnNew.setAlignmentY(0.0F);
        btnNew.setBorderPainted(false);
        btnNew.setFocusPainted(false);
        btnNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewMouseClicked(evt);
            }
        });
        toolBar.add(btnNew);

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasoul/icons/edit.png"))); // NOI18N
        btnEdit.setText(bundle.getString("Edit")); // NOI18N
        btnEdit.setToolTipText(bundle.getString("Edit_song_...")); // NOI18N
        btnEdit.setAlignmentY(0.0F);
        btnEdit.setBorderPainted(false);
        btnEdit.setFocusPainted(false);
        btnEdit.setName(""); // NOI18N
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });
        toolBar.add(btnEdit);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasoul/icons/edittrash.png"))); // NOI18N
        btnDelete.setText(bundle.getString("Delete")); // NOI18N
        btnDelete.setToolTipText(bundle.getString("Delete_song")); // NOI18N
        btnDelete.setAlignmentY(0.0F);
        btnDelete.setBorderPainted(false);
        btnDelete.setFocusPainted(false);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeletebtnRemoveMouseClicked(evt);
            }
        });
        toolBar.add(btnDelete);

        btnAddToList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasoul/icons/additem.png"))); // NOI18N
        btnAddToList.setText(bundle.getString("Add")); // NOI18N
        btnAddToList.setToolTipText(bundle.getString("Add_song_to_the_service_list")); // NOI18N
        btnAddToList.setAlignmentY(0.0F);
        btnAddToList.setBorderPainted(false);
        btnAddToList.setFocusPainted(false);
        btnAddToList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToListActionPerformed(evt);
            }
        });
        toolBar.add(btnAddToList);

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasoul/icons/fileclose.png"))); // NOI18N
        btnClose.setText(bundle.getString("Close")); // NOI18N
        btnClose.setToolTipText(bundle.getString("Close_window")); // NOI18N
        btnClose.setAlignmentY(0.0F);
        btnClose.setBorderPainted(false);
        btnClose.setFocusPainted(false);
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        toolBar.add(btnClose);

        tableSongList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableSongList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableSongListKeyPressed(evt);
            }
        });
        tableSongList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSongListMouseClicked(evt);
            }
        });
        scroolSongList.setViewportView(tableSongList);

        jToolBar1.setComponentPopupMenu(fileMenu);
        jToolBar1.setFloatable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasoul/icons/songsearch.png"))); // NOI18N
        jLabel1.setText(bundle.getString("Song_Search")); // NOI18N
        jToolBar1.add(jLabel1);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar1.add(jSeparator1);

        btnFile.setText(bundle.getString("File")); // NOI18N
        btnFile.setBorderPainted(false);
        btnFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileActionPerformed(evt);
            }
        });
        jToolBar1.add(btnFile);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(labelString)
                    .add(labelField))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(fieldString, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .add(comboField, 0, 296, Short.MAX_VALUE))
                .addContainerGap())
            .add(toolBar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, scroolSongList, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
            .add(jToolBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jToolBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(labelString)
                    .add(fieldString, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(comboField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(labelField))
                .add(10, 10, 10)
                .add(scroolSongList, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(toolBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileActionPerformed
        fileMenu.show(btnFile, 0 /*btnFile.getWidth()-ppmFile.getWidth()*/, btnFile.getHeight());
    }//GEN-LAST:event_btnFileActionPerformed

    private void actImportSongsToDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actImportSongsToDatabaseActionPerformed
        SongsImport importSongs = new SongsImport();
        importSongs.setVisible(true);
    }//GEN-LAST:event_actImportSongsToDatabaseActionPerformed

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        if(frameParent!=null)
            frameParent.dispose();
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseClicked
        SongEditorForm songEditor = new SongEditorForm();
        
        songEditor.setVisible(true);
    }//GEN-LAST:event_btnNewMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        SongEditorForm songEditor = new SongEditorForm((Song)tableSongList.getModel().getValueAt(tableSongList.getSelectedRow(),songColumn));
        songEditor.setVisible(true);
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnDeletebtnRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletebtnRemoveMouseClicked
        Song song = (Song)tableSongList.getModel().getValueAt(tableSongList.getSelectedRow(),songColumn);
        String filePath = song.getFilePath();
        
        File file = new File(filePath);
        if(JOptionPane.showConfirmDialog(this,java.util.ResourceBundle.getBundle("datasoul/internationalize").getString("Are_you_shure_that_you_want_to_delete_the_file_")+filePath+" ?",java.util.ResourceBundle.getBundle("datasoul/internationalize").getString("Confirm"),JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            if(file.delete()){
                tableSongList.removeItem();
            }
        }
        this.repaint();
    }//GEN-LAST:event_btnDeletebtnRemoveMouseClicked

    private void btnAddToListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToListActionPerformed
        for(int item:tableSongList.getSelectedRows())
            ServiceListTable.getActiveInstance().addItem(tableSongList.getModel().getValueAt(item,songColumn));        
    }//GEN-LAST:event_btnAddToListActionPerformed

    public void usingInAddSongItemPanel(JFrame frameParent){
        this.btnClose.setVisible(true);
        this.frameParent = frameParent;
        this.btnDelete.setVisible(false);
        this.btnEdit.setVisible(false);
        this.btnNew.setVisible(false);
        this.btnAddToList.setText(java.util.ResourceBundle.getBundle("datasoul/internationalize").getString("Add"));
    }
    public void addItem(java.awt.event.ActionEvent evt) {                                          
        btnAddToListActionPerformed(evt);
    }
    
    private void tableSongListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSongListMouseClicked
        showItem();
    }//GEN-LAST:event_tableSongListMouseClicked

    private void tableSongListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableSongListKeyPressed
        showItem();
    }//GEN-LAST:event_tableSongListKeyPressed

    private void showItem(){
        
        if(ObjectManager.getInstance().getViewActive()==ObjectManager.VIEW_PROJECTOR){
            if(ObjectManager.getInstance().getPreviewPanel()!=null)
                ObjectManager.getInstance().getPreviewPanel().previewItem((ServiceItem)tableSongList.getModel().getValueAt(tableSongList.getSelectedRow(),songColumn));
        }
        if(ObjectManager.getInstance().getViewActive()==ObjectManager.VIEW_SONGS){
            if(ObjectManager.getInstance().getSongViewerPanel()!=null)
                ObjectManager.getInstance().getSongViewerPanel().viewSong((Song)tableSongList.getModel().getValueAt(tableSongList.getSelectedRow(),songColumn));
        }
        if(ObjectManager.getInstance().getViewActive()==ObjectManager.VIEW_ADD_SONGS){        
            if(ObjectManager.getInstance().getAddSongForm()!=null)
                ObjectManager.getInstance().getAddSongForm().viewSong((Song)tableSongList.getModel().getValueAt(tableSongList.getSelectedRow(),songColumn));
        }
    }    
    
    private void fieldStringKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldStringKeyPressed
        
        SongListTable foundSongTable = new SongListTable();
        
        for(int i=0; i<allSongsListTable.getRowCount();i++){
            try {
                if(fieldString.getText().length()==0){
                    foundSongTable.addItem(allSongsListTable.getValueAt(i,songColumn));
                }else{
                    String searchStr;
                    if(String.valueOf(evt.getKeyChar()).equals("\b")){
                        searchStr = fieldString.getText().substring(0,fieldString.getText().length()-1);
                    }else{
                        searchStr = fieldString.getText()+evt.getKeyChar();
                    }
                    if(comboField.getSelectedItem().toString().equals("All")){
                        for(int j=1; j<comboField.getItemCount();j++){
                            if(((Song)allSongsListTable.getValueAt(i,songColumn)).containsStringInField(comboField.getItemAt(j).toString(),searchStr)){
                                foundSongTable.addItem(allSongsListTable.getValueAt(i,songColumn));
                                break;
                            }                        
                        }
                    }else if(((Song)allSongsListTable.getValueAt(i,songColumn)).containsStringInField(comboField.getSelectedItem().toString(),searchStr)){
                        foundSongTable.addItem(allSongsListTable.getValueAt(i,songColumn));
                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,java.util.ResourceBundle.getBundle("datasoul/internationalize").getString("Error_searching.Error:_")+ex.getMessage(),java.util.ResourceBundle.getBundle("datasoul/internationalize").getString("Datasoul_Error"),0);    
                ex.printStackTrace();
            }
        }
        foundSongTable.addTableModelListener(this);        

        tableSongList.setModel(foundSongTable);

        TableColumn col1 = tableSongList.getColumnModel().getColumn(0);
        col1.setMaxWidth(30);
        col1.setMinWidth(30);
       
    }//GEN-LAST:event_fieldStringKeyPressed

    public void tableChanged(TableModelEvent e) {
        this.repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem actImportSongsToDatabase;
    private javax.swing.JButton btnAddToList;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFile;
    private javax.swing.JButton btnNew;
    private javax.swing.JComboBox comboField;
    private datasoul.util.DnDTable dnDTable1;
    private javax.swing.JTextField fieldString;
    private javax.swing.JPopupMenu fileMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel labelField;
    private javax.swing.JLabel labelString;
    private javax.swing.JScrollPane scroolSongList;
    private datasoul.util.DnDTable tableSongList;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
    
}
