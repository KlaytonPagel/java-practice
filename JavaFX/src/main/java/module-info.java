module org.example.learning {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.learning to javafx.fxml;
    exports org.example.learning;
}