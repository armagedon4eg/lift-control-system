package com.relevator.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.relevator.elevator.ElevatorService;

/**
 * The LiftUI class provides a graphical interface for the lift system using JavaFX.
 */
public class LiftUI extends Application {

    private ElevatorService elevatorService;

    @Override
    public void start(Stage primaryStage) {
        elevatorService = new ElevatorService();

        VBox root = new VBox();
        Button callButton = new Button("Call Lift to 1st Floor");
        callButton.setOnAction(event -> elevatorService.callLift(1));

        root.getChildren().add(callButton);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Lift Control System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
