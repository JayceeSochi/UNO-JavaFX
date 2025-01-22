module org.example.unoapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.example.unoapp to javafx.fxml;
    exports org.example.unoapp;
}