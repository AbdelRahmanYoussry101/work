module com.example.sheet_6_hw {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sheet_6_hw to javafx.fxml;
    exports com.example.sheet_6_hw;
}