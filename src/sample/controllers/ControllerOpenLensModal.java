package sample.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ControllerOpenLensModal {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> openLensModalList_columnNumberLens;

    @FXML
    private TableColumn<?, ?> openLensModalList_date;

    @FXML
    private TableView<?> openLensModalList_tableLensOpen;

    @FXML
    private Button openLensModalList_cancelAndBackToMain;

    @FXML
    private Button openLensModalList_openSelectedLens;


    @FXML
    void initialize() {
        openLensModalList_columnNumberLens
        openLensModalList_cancelAndBackToMain.setOnAction(event -> {
            openLensModalList_cancelAndBackToMain.getScene().getWindow().hide();
        });

        openLensModalList_openSelectedLens.setOnAction(event -> {
        });
    }
}