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
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class NewPrototypeController implements Initializable {
    
    @FXML
    private ComboBox<String> WeightCombo ;
    @FXML
    private ComboBox<String> AgeCombo;
    @FXML
    private ComboBox<String> GenderCombo;
    @FXML
    private ComboBox<String> FromCombo;
    @FXML
    private ComboBox<String> ToCombo;
    @FXML
    private ComboBox<String> From1Combo;
    @FXML
    private ComboBox<String> To1Combo;
    @FXML
    private ComboBox<String> Weight1Combo;
    @FXML
    private ComboBox<String> Age1Combo;
    @FXML
    private ComboBox<String> Gender1Combo;
    @FXML
    private Label CaseIDLabel;
    @FXML 
    private Label RangeLabel;
    @FXML
    private Label Range1Label;
    @FXML
    private Label SelectLabel;
    @FXML
    private Label Select1Label;
    @FXML
    private Label Select2Label;
    @FXML
    private TextField CaseIDTextField;
    @FXML
    private Button SearchButton;
    @FXML
    private Button Search1Button;
    @FXML
    private Button Search2Button;
    @FXML
    private TableView TissueThicknessTable;
    @FXML
    private TableView NoseIndexTable;
    @FXML
    private TableView EyeIndexTable;
    @FXML
    private TableColumn FeaturePoint;
    @FXML
    private TableColumn Distance;
    @FXML
    private TableColumn NoseIndex;
    @FXML
    private TableColumn NoseHeight;
    @FXML
    private TableColumn NoseWidth;
    @FXML
    private TableColumn EyeIndex;
    @FXML
    private TableColumn EyeHeight;
    @FXML
    private TableColumn EyeWidth;
    @FXML
    private CheckBox NoseCheckBox;
    @FXML
    private CheckBox EyeCheckBox;
    
    
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
    
    //Range list
    ObservableList<String> RangeList = FXCollections.observableArrayList(
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12",
            "13",
            "14",
            "15",
            "16",
            "17",
            "18",
            "19",
            "20",
            "21",
            "22",
            "23",
            "24",
            "25",
            "26",
            "27",
            "28",
            "29",
            "30"
            );
    
    
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        AgeCombo.setItems(ageGroupList);
        GenderCombo.setItems(genderList);
        WeightCombo.setItems(WeightList);
        Age1Combo.setItems(ageGroupList);
        Gender1Combo.setItems(genderList);
        Weight1Combo.setItems(WeightList);
        FromCombo.setItems(RangeList);
        ToCombo.setItems(RangeList);
        From1Combo.setItems(RangeList);
        To1Combo.setItems(RangeList);
        
        
        
    }    
    
}
