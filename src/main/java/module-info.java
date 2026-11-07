module com.example.gitconnect {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gitconnect to javafx.fxml;
    exports com.example.gitconnect;
}