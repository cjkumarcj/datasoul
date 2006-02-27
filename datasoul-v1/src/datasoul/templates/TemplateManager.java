/*
 * TemplateManager.java
 *
 * Created on February 25, 2006, 1:05 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package datasoul.templates;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.event.TableModelEvent;
import javax.swing.table.TableModel;

/**
 *
 * @author samuelm
 */
public class TemplateManager implements TableModel {
    
    private static ArrayList<String> availableTemplates = new ArrayList<String>();
    private static HashMap<String, DisplayTemplate> loadedTemplates = new HashMap<String, DisplayTemplate>();
    private static TemplateManager instance = null;
    private ArrayList<javax.swing.event.TableModelListener> listeners;
   
    
    /** Creates a new instance of TemplateManager */
    private TemplateManager() {
        listeners = new ArrayList<javax.swing.event.TableModelListener>();
    }
    
    public static synchronized TemplateManager getInstance(){
        if (instance == null){
            instance = new TemplateManager();
        }
        return instance;
    }
    

    public int getRowCount() {
        return availableTemplates.size();
    }

    public int getColumnCount() {
        return 1;
    }

    public String getColumnName(int columnIndex) {
        return "Template";
    }

    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        return availableTemplates.get(rowIndex);
    }

    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    public void removeTableModelListener(javax.swing.event.TableModelListener l) {
        this.listeners.remove(l);
    }

    public void addTableModelListener(javax.swing.event.TableModelListener l) {
        this.listeners.add(l);
    }
    
    private void tableModelChanged(){
        TableModelEvent tme = new TableModelEvent(this);
        for(int i=0;i<this.listeners.size();i++){
            this.listeners.get(i).tableChanged(tme);            
        }
    }
    
    
    public void refreshAvailableTemplates(){
        
        availableTemplates.clear();
        String path = System.getProperty("user.dir") + System.getProperty("file.separator") + "templates";
        
        File file = new File(path);
        String[] files = file.list();
        
        // there is at least one file in the directroy?
        if (files!=null){
            int size = files.length;
            
            for(int i=0; i<size;i++){
                if(files[i].contains(".template")){
                    availableTemplates.add( files[i].substring(0, files[i].indexOf(".template"))) ;
                }
            }
        }
        
        tableModelChanged();
        
    }
    
    
    public static DisplayTemplate getDisplayTemplate(String templateName) throws Exception{

        if (loadedTemplates.containsKey(templateName)){
            return loadedTemplates.get(templateName);
        }else{
            
            DisplayTemplate t = new DisplayTemplate(templateName);
            loadedTemplates.put(templateName, t);
            return t;
            
        }
        
    }
    
    public void deleteTemplate(String templateName) throws Exception {

        String path = System.getProperty("user.dir") + System.getProperty("file.separator") + "templates";
        File f = new File(path + System.getProperty("file.separator") + templateName + ".template");
        f.delete();
        loadedTemplates.remove(templateName);
        refreshAvailableTemplates();
        
    }
   
    
}