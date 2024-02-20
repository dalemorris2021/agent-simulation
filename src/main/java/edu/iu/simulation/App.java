package edu.iu.simulation;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    Agent[] agents;
    Obstacle[] obstacles;
    Goal goal;
    
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage s) {
        // set title for the stage
        s.setTitle("creating TextField");
 
        // create a textfield
        TextField b = new TextField();
 
        // create a stack pane
        StackPane r = new StackPane();
 
        // add textfield
        r.getChildren().add(b);
 
        // create a scene
        Scene sc = new Scene(r, 200, 200);
 
        // set the scene
        s.setScene(sc);
 
        s.show();
    }
}