package sample.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControllerMain {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button mainList_newLens;

    @FXML
    private Button mainList_openDetail;

    @FXML
    private Button mainList_dataBase;

    @FXML
    private Button mainList_exit;

    @FXML
    void initialize() {
        mainList_newLens.setOnAction(event -> {

        });

        mainList_openDetail.setOnAction(event -> {

        });

        mainList_dataBase.setOnAction(event -> {

        });

        mainList_exit.setOnAction(event -> {
            System.exit(1);
        });
    }
}
