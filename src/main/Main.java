/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import views.ViewCvs;
import models.ModelCvs;
import controllers.ControllerCvs;
import extras.DataValidation;
/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ViewCvs viewCvs = new ViewCvs();
        ModelCvs modelCvs = new ModelCvs();
        DataValidation dataValidation = new DataValidation();
        ControllerCvs controllerCvs = new ControllerCvs(viewCvs,modelCvs,dataValidation);
    }
    
}
