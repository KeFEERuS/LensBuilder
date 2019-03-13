package sample.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import resources.OpenLens;
import sample.Main;

public class ControllerOpenLensModal {
    Main mainApp = new Main();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<OpenLens, String> openLensModalList_columnNumberLens;

    @FXML
    private TableColumn<OpenLens, String> openLensModalList_date;

    @FXML
    private TableView<OpenLens> openLensModalList_tableLensOpen;

    @FXML
    private Button openLensModalList_cancelAndBackToMain;

    @FXML
    private Button openLensModalList_openSelectedLens;


    @FXML
    void initialize() {
        openLensModalList_columnNumberLens.setCellValueFactory(new PropertyValueFactory<OpenLens, String>("nameLens"));
        openLensModalList_date.setCellValueFactory(new PropertyValueFactory<OpenLens, String>("creationDate"));

        openLensModalList_columnNumberLens.setSortType(TableColumn.SortType.DESCENDING);

        ObservableList<OpenLens> list = mainApp.getLensList();
        openLensModalList_tableLensOpen.setItems(list);

        openLensModalList_cancelAndBackToMain.setOnAction(event -> {
            openLensModalList_cancelAndBackToMain.getScene().getWindow().hide();
        });

        openLensModalList_openSelectedLens.setOnAction(event -> {
        });
    }
}