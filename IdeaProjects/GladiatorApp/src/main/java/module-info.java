module com.example.gladiatorapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gladiatorapp to javafx.fxml;
    exports com.example.gladiatorapp;
}