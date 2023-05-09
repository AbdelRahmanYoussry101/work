package com.example.hw_javafx;
import javafx.scene.input.MouseButton;
import javafx.scene.shape.Circle;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.shape.Shape;
import javafx.scene.image.Image;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.util.Random;

public class CheckerboardApp extends Application {

    private final int BOARD_SIZE = 8;
    private final int CELL_SIZE = 50;
    private int clickCount = 0;

    public void start(Stage primaryStage) throws Exception {

        GridPane gridPane = new GridPane();
        gridPane.setPrefSize(CELL_SIZE * BOARD_SIZE, CELL_SIZE * BOARD_SIZE);

        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                Rectangle rect = new Rectangle(CELL_SIZE, CELL_SIZE);
                rect.setStroke(Color.BLACK);

                if ((row + col) % 2 == 0) {
                    rect.setFill(Color.WHITE);
                    rect.setOnMouseClicked(new EventHandler<MouseEvent>() {
                        public void handle(MouseEvent event) {
                            if(event.getClickCount()==2 && rect.getFill() != Color.WHITE) {
                                rect.setFill(Color.WHITE);
                            }else {
                                Random random = new Random();
                                rect.setFill(Color.rgb(random.nextInt(100), random.nextInt(100), random.nextInt(100)));
                                clickCount++;
                                System.out.println("clicks: " + clickCount);
                            }
                        }
                    });
                } else {
                    rect.setFill(Color.BLACK);
                    rect.setOnMouseClicked(new EventHandler<MouseEvent>() {
                        public void handle(MouseEvent event) {
                            if(event.getClickCount()==2 && rect.getFill() != Color.BLACK){
                                rect.setFill(Color.BLACK);
                            }else {
                                Random random = new Random();
                                rect.setFill(Color.rgb(random.nextInt(100), random.nextInt(100), random.nextInt(100)));
                                clickCount++;
                                System.out.println("clicks: " + clickCount);
                            }
                        }
                    });
                }
                gridPane.add(rect, col, row);
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
