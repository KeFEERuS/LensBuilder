package sample.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ControllerLensDocument {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lensDocList_nameLens;

    @FXML
    private Button lensDocList_done;

    @FXML
    private Label lensDocList_thickness;

    @FXML
    private Label lensDocList_complexityClass;

    @FXML
    private Label lensDocList_price;

    @FXML
    private Label lensDocList_weight;

    @FXML
    private Button lensDocList_print;

    @FXML
    private Label lensDocList_diameter;

    @FXML
    void initialize() {
    }
}
