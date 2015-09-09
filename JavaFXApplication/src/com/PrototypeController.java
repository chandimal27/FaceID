/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javax.swing.JFrame;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class PrototypeController extends JFrame  implements Initializable {
    
    
    @FXML
    private ComboBox<String> WeightCombo ;
    @FXML
    private ComboBox<String> Age;
    @FXML
    private ComboBox<String> GenderCombo;
    @FXML
    private ComboBox<String> FromCombo;
    @FXML
    private ComboBox<String> ToCombo;
    @FXML
    private ComboBox<String> Age1Combo;
    @FXML
    private ComboBox<String> Gender1Combo;
    @FXML
    private ComboBox<String> Weight1Combo;
    

    //Age group list
    ObservableList<String> ageGroupList = FXCollections.observableArrayList(
            "0-5",
            "5-10",
            "10-15",
            "15-20",
            "20-25",
            "25-30",
            "30-35",
            "35-40",
            "40-45",
            "45-50",
            "50-55",
            "55-60",
            "60-65",
            "65-70",
            "70-75",
            "75-80",
            "80-85",
            "85-90",
            "90-95",
            "95-100"
    );
    //Male / Female list
    ObservableList<String> genderList = FXCollections.observableArrayList(
            "Male",
            "Female"   
    );
    
    //Weight list
    ObservableList<String> WeightList = FXCollections.observableArrayList(
            "Low",
            "Medium",
            "High"
    );
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //AgeCombo.setItems(ageGroupList);
        //GenderCombo.setItems(genderList);
        //WeightCombo.setItems(WeightList);
        
    }
    
    @FXML
    public void initialize(){
        Age.setItems(ageGroupList);
        GenderCombo.setItems(genderList);
        WeightCombo.setItems(WeightList);
        
    }
    
}
