/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusoselector;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import selectordeslizamiento.SelectorDeslizamiento;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class APPUsoSelectorController implements Initializable {

    @FXML
    private SelectorDeslizamiento selector1;
    @FXML
    private SelectorDeslizamiento selector2;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Creamos la lista de numero para el selector1
        List<String> lista = new ArrayList<>();
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");
        lista.add("Cuatro");
        lista.add("Cinco");
        
        //Creamos la lista de numero para el selector2
        List<String> lista2 = new ArrayList<>();
        lista2.add("Seis");
        lista2.add("Siete");
        lista2.add("Ocho");
        lista2.add("Nueve");
        lista2.add("Diez");
        
        
        selector1.setItems((ArrayList<String>) lista);
        //Permitimos que el primer selector sea ciclico
        selector1.setRepetitive(true);
        
        selector2.setItems((ArrayList<String>) lista2);
    }    

    @FXML
    private void pulsadoSelector1(ActionEvent event) {
        label.setText("Pulsado el selector de arriba");
    }

    @FXML
    private void pulsadoSelector2(ActionEvent event) {
        label.setText("Pulsado el selector de abajo");
    }
    
}
