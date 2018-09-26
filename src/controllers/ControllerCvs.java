/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import views.ViewCvs;
import models.ModelCvs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author Diego
 */
public class ControllerCvs {
    ViewCvs viewCvs;
    ModelCvs modelCvs;
    ActionListener ac = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewCvs.jb_limpiar)
                    limpiar();
            else if(e.getSource() == viewCvs.jb_guardar){
                
            }
        }
    };
    public ControllerCvs(ViewCvs viewCvs, ModelCvs modelCvs) {
        this.viewCvs = viewCvs;
        this.modelCvs = modelCvs;
        this.viewCvs.jb_guardar.addActionListener(ac);
        this.viewCvs.jb_limpiar.addActionListener(ac);
    }
    
    public void limpiar(){
        viewCvs.jtf_nombre.setText("");
        viewCvs.jtf_email.setText("");
    }
    
    private void initComponents(){
        viewCvs.setVisible(true);
        modelCvs.readFile();
        viewCvs.jtf_nombre.setText(modelCvs.getNombre());
        viewCvs.jtf_email.setText(modelCvs.getEmail());
        
    }
    
}
