/*
 * SongEditorFrame.java
 *
 * Created on 26 de Dezembro de 2005, 21:14
 */

package datasoul.song;

import datasoul.*;
import datasoul.util.*;
import datasoul.datashow.*;
import datasoul.song.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.Keymap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

/**
 *
 * @author  Administrador
 */
public class SongEditorFrame extends javax.swing.JFrame {
    

    private Song song;
    

    /**
     * Creates new form SongEditorFrame
     */
    public SongEditorFrame(File file) {
        initComponents();
        Document dom=null;
        Node node=null;

        
        
        
        try {
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

                //Using factory get an instance of document builder
                DocumentBuilder db = dbf.newDocumentBuilder();

                //parse using builder to get DOM representation of the XML file
                dom = db.parse(file);

                //node = dom.getDocumentElement().getChildNodes().item(0);
                node = dom.getElementsByTagName("Song").item(0);
                
        }catch(Exception e) {
            JOptionPane.showMessageDialog(this,"Error, the file is not well formed\nErro:"+e.getMessage(),"DataSoul Error",0);    
        }        

        song = new Song();
        try {
            song.readObject(node);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Error, the file is not well formed\nErro:"+e.getMessage(),"DataSoul Error",0);    
        }

        this.setTitle(song.getFileName());
        
        //fill object
        fillGuiValues();
    }

    /**
     * Creates new form SongEditorFrame
     */
    public SongEditorFrame(Song songIn) {
        initComponents();

        song = songIn;
        this.setTitle(songIn.getFileName());
        
        //fill object
        fillGuiValues();
    }
    
    public SongEditorFrame() {
        initComponents();

        song = new Song();

        this.setTitle("");
    }
    
    
    private void fillGuiValues(){
        fieldName.setText(song.getSongName());
        fieldAuthor.setText(song.getSongAuthor());
        textLyrics.setText(song.getLyrics());
        textChordsCompleted.setText(song.getChordsComplete());
        textChordsSimplified.setText(song.getChordsSimplified());
    }

    private void actualizeValues(){
        song.setSongName(fieldName.getText());
        song.setSongAuthor(fieldAuthor.getText());
        song.setLyrics(textLyrics.getText());
        song.setChordsComplete(textChordsCompleted.getText());
        song.setChordsSimplified(textChordsSimplified.getText());
    }
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        fieldName = new javax.swing.JTextField();
        labelName = new javax.swing.JLabel();
        labelAuthor = new javax.swing.JLabel();
        fieldAuthor = new javax.swing.JTextField();
        tabSong = new javax.swing.JTabbedPane();
        scroolLyric = new javax.swing.JScrollPane();
        textLyrics = new javax.swing.JTextPane();
        scroolChordsComplete = new javax.swing.JScrollPane();
        textChordsCompleted = new javax.swing.JTextPane();
        scroolChordsSimplified = new javax.swing.JScrollPane();
        textChordsSimplified = new javax.swing.JTextPane();
        toolBar = new javax.swing.JToolBar();
        btnSave = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        fieldName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldNameKeyTyped(evt);
            }
        });

        labelName.setFont(new java.awt.Font("Arial", 1, 11));
        labelName.setText(java.util.ResourceBundle.getBundle("datasoul/internationalize").getString("NAME"));

        labelAuthor.setFont(new java.awt.Font("Arial", 1, 11));
        labelAuthor.setText(java.util.ResourceBundle.getBundle("datasoul/internationalize").getString("AUTHOR"));

        tabSong.setFont(new java.awt.Font("Arial", 1, 11));
        textLyrics.setFont(new java.awt.Font("Courier New", 0, 12));
        scroolLyric.setViewportView(textLyrics);

        tabSong.addTab(java.util.ResourceBundle.getBundle("datasoul/internationalize").getString("LYRICS"), scroolLyric);

        textChordsCompleted.setFont(new java.awt.Font("Courier New", 0, 12));
        scroolChordsComplete.setViewportView(textChordsCompleted);

        tabSong.addTab(java.util.ResourceBundle.getBundle("datasoul/internationalize").getString("CHORDS_COMPLETE"), scroolChordsComplete);

        textChordsSimplified.setFont(new java.awt.Font("Courier New", 0, 12));
        scroolChordsSimplified.setViewportView(textChordsSimplified);

        tabSong.addTab(java.util.ResourceBundle.getBundle("datasoul/internationalize").getString("Chords_Simplified"), scroolChordsSimplified);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasoul/icons/save.gif")));
        btnSave.setText("Save");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });

        toolBar.add(btnSave);

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasoul/icons/delete.gif")));
        btnClose.setText("Close");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        toolBar.add(btnClose);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(tabSong, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                .add(labelName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(fieldName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                .add(labelAuthor)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(fieldAuthor, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))))
                    .add(toolBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                .add(toolBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(17, 17, 17)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(labelName)
                    .add(fieldName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(labelAuthor)
                    .add(fieldAuthor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(16, 16, 16)
                .add(tabSong, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNameKeyTyped
        if(evt.getKeyCode()==16)
            return;
        String allowed="ZXCVBNMASDFGHJKL�QWERTYUIOPzxcvbnmasdfghjkl�qwertyuiop1234567890'����������?";
        if(!allowed.contains(String.valueOf(evt.getKeyChar())))
            evt.consume();
    }//GEN-LAST:event_fieldNameKeyTyped

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        
        if(this.fieldName.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please fill the field \"Song Name\"");
            return;
        }
        
        if(this.fieldName.getText().equals(song.getFilePath())){
            saveFile();
        }else{
            File file = new File(song.getFilePath());
            file.delete();
            String filename = this.fieldName.getText();
            if(!filename.contains(".song"))
                filename = filename + ".song";
            String path = System.getProperty("user.dir") + System.getProperty("file.separator") + 
                    "songs"+ System.getProperty("file.separator")+filename;
            song.setFilePath(path);
            
            saveFile();            
        }
    }//GEN-LAST:event_btnSaveMouseClicked

  private void saveFile(){
        actualizeValues();
        
        try{
            Node node = song.writeObject();
            Document doc = node.getOwnerDocument();
            doc.appendChild( node);                        // Add Root to Document
            FileOutputStream fos = new FileOutputStream(song.getFilePath());
            org.apache.xml.serialize.XMLSerializer xs = new org.apache.xml.serialize.XMLSerializer();
            OutputFormat outFormat = new OutputFormat();
            outFormat.setIndenting(true);
            outFormat.setEncoding("ISO-8859-1");
            xs.setOutputFormat(outFormat);
            xs.setOutputByteStream(fos);
            xs.serialize(doc);

        } catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error writing file.\nErro:"+e.getMessage(),"DataSoul Error",0);    
        }
    }
    
    /**
     * @param args the command line arguments
     */
/*    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SongEditorFrame().setVisible(true);
            }
        });
    }
  */  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField fieldAuthor;
    private javax.swing.JTextField fieldName;
    private javax.swing.JLabel labelAuthor;
    private javax.swing.JLabel labelName;
    private javax.swing.JScrollPane scroolChordsComplete;
    private javax.swing.JScrollPane scroolChordsSimplified;
    private javax.swing.JScrollPane scroolLyric;
    private javax.swing.JTabbedPane tabSong;
    private javax.swing.JTextPane textChordsCompleted;
    private javax.swing.JTextPane textChordsSimplified;
    private javax.swing.JTextPane textLyrics;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
    
}