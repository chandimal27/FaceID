
package com;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Rasika
 */
public class Show extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/NewPrototype.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Integrated Interface for Project FaceID_UCSC");
        stage.show();
        
        
    }
    
    public static void main(String args[]){
        launch(args);
    }
    
}
