module com.example.mcq {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires MaterialFX;
    requires com.opencsv;

    opens com.example.mcq to javafx.fxml;
    exports com.example.mcq;
}