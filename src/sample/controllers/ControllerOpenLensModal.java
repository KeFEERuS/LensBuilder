package sample.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControllerOpenLensModal {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button openLensModalList_cancelAndBackToMain;

    @FXML
    private Button openLensModalList_openSelectedLens;

    @FXML
    void initialize() {
        openLensModalList_cancelAndBackToMain.setOnAction(event -> {
            openLensModalList_cancelAndBackToMain.getScene().getWindow().hide();
        });

        openLensModalList_openSelectedLens.setOnAction(event -> {
        });
    }
}