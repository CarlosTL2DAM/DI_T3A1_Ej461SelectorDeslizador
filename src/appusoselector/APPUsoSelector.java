/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusoselector;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import selectordeslizamiento.SelectorDeslizamiento;

/**
 *
 * @author usuario
 */
public class APPUsoSelector extends Application {

    
    
    @Override
    public void start(Stage primaryStage) {
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("APPUsoSelectorView.fxml"));
        try{
        Parent root = fxmlLoader.load();
        
        
        Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("Selectores ");
        primaryStage.show();
        }catch(IOException error){System.out.println("ERROR");}
        
        
    }

       

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
