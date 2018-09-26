/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import views.ViewCvs;
/**
 *
 * @author Diego
 */
public class ModelCvs {
    private String nombre = "";
    private String email = "";
    private String path = "C:\\archivos\\base.csv";
    boolean bandera = true;
    
    ViewCvs viewCvs;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
    
    /**
     *  Lee un archivo según la ruta especificada
     * 
     */
    public void readFile(){
        try{
                String row; 
            try (FileReader file = new FileReader(path); BufferedReader bufferedReader = new BufferedReader(file)){
                while ((row = bufferedReader.readLine()) != null){    
                    String [] campos = row.split(",");
                    nombre = campos[0];
                    email = campos[1]; 
                }
            } 
        }catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(viewCvs,"No se econtró el archivo" + ex.getMessage());
        } catch (IOException ex) {
                JOptionPane.showMessageDialog(viewCvs,"Error en I/O operación" + ex.getMessage());
        }
    }
    /**
     * Escribe un archivo agregando una nueva linea
     */
    public void writeFile(){
        try{
                File file = new File(path);
                FileWriter fileWriter = new FileWriter (file,bandera);
                try (PrintWriter printWriter  = new PrintWriter(fileWriter)){
                        ArrayList<String> nuevo = new ArrayList<>();
                        nuevo.add(nombre);
                        nuevo.add(email);
                        printWriter.println(nuevo);
                        printWriter.close();
                        JOptionPane.showMessageDialog(viewCvs,"Se modificó correctamente");
            }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(viewCvs,"Error en I/O operación" + ex.getMessage());
                }
            }
    }

