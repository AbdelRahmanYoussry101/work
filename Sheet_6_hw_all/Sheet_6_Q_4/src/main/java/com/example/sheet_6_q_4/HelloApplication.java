package com.example.sheet_6_q_4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class HelloApplication extends Application {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private static final int RADIUS = 200;
    private static final String MESSAGE = "Welcome to Java";
    private static final int FONT_SIZE = 24;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();

        Arc circle = new Arc(WIDTH / 2, HEIGHT / 2, RADIUS, RADIUS, 0, 360);
        circle.setType(ArcType.OPEN);
        circle.setFill(null);
        circle.setStroke(Color.BLACK);
        pane.getChildren().add(circle);


        double angle = 360.0 / MESSAGE.length();


        for (int i = 0; i < MESSAGE.length(); i++) {
            char c = MESSAGE.charAt(i);


            Text text = new Text(Character.toString(c));
            text.setFont(Font.font("Times New Roman", FontPosture.ITALIC, FONT_SIZE));
            text.setFill(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));

            double x = WIDTH / 2 + RADIUS * Math.cos(Math.toRadians(angle * i));
            double y = HEIGHT / 2 + RADIUS * Math.sin(Math.toRadians(angle * i));
            text.setX(x);
            text.setY(y);
            text.setRotate(angle * i + 90);


            pane.getChildren().add(text);
        }


        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
