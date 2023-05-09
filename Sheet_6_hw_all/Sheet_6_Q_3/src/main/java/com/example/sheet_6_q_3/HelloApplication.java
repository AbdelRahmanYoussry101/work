package com.example.sheet_6_q_3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class HelloApplication extends Application {

    private final int TEXT_SIZE = 22;
    private final int OPACITY_RANGE = 6;

    @Override
    public void start(Stage primaryStage) {

        VBox vBox = new VBox();
        vBox.setSpacing(10);

        for (int i = 0; i < 5; i++) {
            Text text = new Text("Text " + (i+1));
            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, TEXT_SIZE));
            text.setFill(getRandomColor());
            text.setOpacity(getRandomOpacity());
            vBox.getChildren().add(text);
        }

        Scene scene = new Scene(vBox, 200, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Color getRandomColor() {
        Random random = new Random();
        return Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

    private double getRandomOpacity() {
        Random random = new Random();
        return random.nextInt(OPACITY_RANGE) / 10.0;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
