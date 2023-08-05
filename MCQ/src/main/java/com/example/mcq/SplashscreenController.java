package com.example.mcq;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SplashscreenController implements Initializable {

    @FXML
    BorderPane rootpane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        splash();
    }

    public void splash() {
        new Thread()
        {
            @Override
            public void run() {
               try {
                   Thread.sleep(3000);
                   Platform.runLater(new Runnable() {
                       @Override
                       public void run() {
                           Parent root;
                           try {
                               FXMLLoader loader = new FXMLLoader(getClass().getResource("HomeScreen.fxml"));
                               root = loader.load();
                           } catch (IOException e) {
                               throw new RuntimeException(e);
                           }
                           Scene scene = new Scene(root);
                           Stage stage = new Stage();
                           stage.setScene(scene);
                           stage.getIcons().add(new Image("logo.png"));
                           stage.show();
                           rootpane.getScene().getWindow().hide();
                       }
                   });
               }catch (Exception e)
               {
                   e.printStackTrace();
               }
            }
        }.start();
    }

}
