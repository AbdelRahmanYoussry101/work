package com.example.sheet_6_q5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        double projectsPercentage = 20.0;
        double quizzesPercentage = 10.0;
        double midtermPercentage = 30.0;
        double finalPercentage = 40.0;
        Color projectsColor = Color.RED;
        Color quizzesColor = Color.BLUE;
        Color midtermColor = Color.GREEN;
        Color finalColor = Color.ORANGE;


        Rectangle projectsRect = new Rectangle(0, 0, projectsPercentage * 4, 50);
        projectsRect.setFill(projectsColor);
        Rectangle quizzesRect = new Rectangle(projectsRect.getWidth(), 0, quizzesPercentage * 4, 50);
        quizzesRect.setFill(quizzesColor);
        Rectangle midtermRect = new Rectangle(quizzesRect.getX() + quizzesRect.getWidth(), 0, midtermPercentage * 4, 50);
        midtermRect.setFill(midtermColor);
        Rectangle finalRect = new Rectangle(midtermRect.getX() + midtermRect.getWidth(), 0, finalPercentage * 4, 50);
        finalRect.setFill(finalColor);


        Text projectsLabel = new Text(projectsRect.getWidth() / 2, 40, "Projects");
        projectsLabel.setFont(Font.font("Arial", 16));
        projectsLabel.setFill(Color.WHITE);
        Text quizzesLabel = new Text(projectsRect.getWidth() + quizzesRect.getWidth() / 2, 40, "Quizzes");
        quizzesLabel.setFont(Font.font("Arial", 16));
        quizzesLabel.setFill(Color.WHITE);
        Text midtermLabel = new Text(quizzesRect.getX() + quizzesRect.getWidth() + midtermRect.getWidth() / 2, 40, "Midterm Exams");
        midtermLabel.setFont(Font.font("Arial", 16));
        midtermLabel.setFill(Color.WHITE);
        Text finalLabel = new Text(midtermRect.getX() + midtermRect.getWidth() + finalRect.getWidth() / 2, 40, "Final Exam");
        finalLabel.setFont(Font.font("Arial", 16));
        finalLabel.setFill(Color.WHITE);

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().addAll(projectsRect, quizzesRect, midtermRect, finalRect,
                projectsLabel, quizzesLabel, midtermLabel, finalLabel);

        Scene scene = new Scene(anchorPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
