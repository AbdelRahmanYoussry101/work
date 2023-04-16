package com.example.javafx1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root =new Group();
        Scene scene =new Scene(root);



        Button Circil = new Button("ShowCircle");
        root.getChildren().add(Circil);

        Circil.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                Circle circil = new Circle();
                circil.setRadius(100);
                circil.centerXProperty().bind(scene.widthProperty().divide(2));
                circil.centerYProperty().bind(scene.heightProperty().divide(2));
                root.getChildren().add(circil);
            }
        });

        stage.setTitle("woot woot");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}