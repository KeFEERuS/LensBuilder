package sample.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControllerNewLens {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button mainList_backToMain1;

    @FXML
    private Button newLensList_backToMain;

    @FXML
    void initialize() {
        newLensList_backToMain.setOnAction(event -> {
            newLensList_backToMain.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/samples/sampleMain.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setTitle("Lens Engineer");
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.show();
        });
    }
}