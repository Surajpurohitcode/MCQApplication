package com.example.mcq;

import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Result implements Initializable {

    @FXML
    private Label rightans;

    @FXML
    private ProgressIndicator rightprogress;

    @FXML
    private Label wrongans;

    @FXML
    private ProgressIndicator wrongprogress;

    @FXML
    private AnchorPane rootpane;


    @FXML
    private MFXButton homebtn;

    McqQa qa = new McqQa();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String right = String.valueOf(qa.currect);
        rightans.setText(right);
        String wrong = String.valueOf(qa.wrong);
        wrongans.setText(wrong);
        wrongprogress.setProgress(Double.parseDouble(wrong));
        rightprogress.setProgress(Double.parseDouble(right));

    }

    public void goHome() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("GameScreen.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setMaximized(true);
        stage.getIcons().add(new Image("logo.png"));
        rootpane.getScene().getWindow().hide();
    }
}
