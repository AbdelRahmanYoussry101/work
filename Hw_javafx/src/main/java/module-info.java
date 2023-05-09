module com.example.hw_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hw_javafx to javafx.fxml;
    exports com.example.hw_javafx;
}