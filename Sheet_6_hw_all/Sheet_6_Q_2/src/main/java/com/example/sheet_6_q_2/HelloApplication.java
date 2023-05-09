package com.example.sheet_6_q_2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.Random;

public class HelloApplication extends Application {

    private final int BOARD_SIZE = 3;
    private final int CELL_SIZE = 100;

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane gridPane = new GridPane();
        gridPane.setPrefSize(CELL_SIZE * BOARD_SIZE, CELL_SIZE * BOARD_SIZE);
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        Random rand = new Random();
        Image xImage = new Image(getClass().getResourceAsStream("x.gif"));
        Image oImage = new Image(getClass().getResourceAsStream("o.gif"));

        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {

                int randomNum = rand.nextInt(3);
                ImageView imageView = new ImageView();

                switch (randomNum) {
                    case 0:

                        break;
                    case 1:

                        imageView.setImage(xImage);
                        break;
                    case 2:
                        imageView.setImage(oImage);
                        break;
                }

                gridPane.add(imageView, col, row);
            }
        }

        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
