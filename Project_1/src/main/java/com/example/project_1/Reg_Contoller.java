package com.example.project_1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Reg_Contoller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}