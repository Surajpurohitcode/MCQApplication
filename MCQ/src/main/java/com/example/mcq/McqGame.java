package com.example.mcq;
import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class McqGame implements Initializable {

    @FXML
    private MFXButton playbtn;
    @FXML
    private MenuButton subjects;

    @FXML
    private Label mysubject;

    static String subjectdata;

    @FXML
    private BorderPane rootpane;

    public void playGame() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Mcq_Qa.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(fxmlLoader.load());
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.getIcons().add(new Image("logo.png"));
        stage.show();
        rootpane.getScene().getWindow().hide();
    }

    public void subjects()
    {
        MenuItem item1 = new MenuItem("HTML");
        MenuItem item2 = new MenuItem("JAVA");
        MenuItem item3 = new MenuItem("PYTHON");
        MenuItem item4 = new MenuItem("ANDROID");

        subjects.getItems().addAll(item1,item2,item3,item4);
        item1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                subjectdata = item1.getText();
                mysubject.setText(subjectdata);
                playbtn.setDisable(false);
            }
        });

        item2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                subjectdata = item2.getText();
                mysubject.setText(subjectdata);
            }
        });

        item3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                subjectdata = item3.getText();
                mysubject.setText(subjectdata);
            }
        });

        item4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                subjectdata = item4.getText();
                mysubject.setText(subjectdata);
            }
        });

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        playbtn.setDisable(true);
        subjects();
    }
}
