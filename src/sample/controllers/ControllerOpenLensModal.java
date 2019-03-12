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

public class ControllerOpenLensModal {

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

        ObservableList<OpenLens> list = getLensList();
        openLensModalList_tableLensOpen.setItems(list);

        openLensModalList_cancelAndBackToMain.setOnAction(event -> {
            openLensModalList_cancelAndBackToMain.getScene().getWindow().hide();
        });

        openLensModalList_openSelectedLens.setOnAction(event -> {
        });
    }

    private ObservableList<OpenLens> getLensList() {
        OpenLens lens1 = new OpenLens(1, "БУ6.897-258.005-001", "К8", "129.06", "12.08.2018");
        OpenLens lens2 = new OpenLens(2, "УФ.587698.025", "ТК21", "348.5", "18.08.2018");
        OpenLens lens3 = new OpenLens(3, "ГРОМ-01.598.001", "ТФ105", "83.67", "20.08.2018");
        OpenLens lens4 = new OpenLens(4, "АС7-002", "СТК12", "1580.5", "26.08.2018");

        ObservableList<OpenLens> list = FXCollections.observableArrayList(lens1, lens2, lens3, lens4);
        return list;
    }
}