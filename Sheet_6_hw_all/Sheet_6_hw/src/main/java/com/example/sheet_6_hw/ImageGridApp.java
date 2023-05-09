package com.example.sheet_6_hw;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ImageGridApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Create a GridPane to hold the images
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Load the images
        Image image1 = new Image("");
        Image image2 = new Image("");
        Image image3 = new Image("");
        Image image4 = new Image("");

        // Create ImageViews for each image
        ImageView imageView1 = new ImageView(image1);
        ImageView imageView2 = new ImageView(image2);
        ImageView imageView3 = new ImageView(image3);
        ImageView imageView4 = new ImageView(image4);

        // Add the ImageViews to the GridPane
        gridPane.add(imageView1, 0, 0);
        gridPane.add(imageView2, 1, 0);
        gridPane.add(imageView3, 0, 1);
        gridPane.add(imageView4, 1, 1);

        // Create a Scene and add the GridPane to it
        Scene scene = new Scene(gridPane, 400, 400);

        // Set the Scene on the Stage and show it
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
