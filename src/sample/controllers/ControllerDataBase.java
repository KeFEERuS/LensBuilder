package sample.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import resources.MaterialDB;
import resources.OpenLens;
import sample.Main;

public class ControllerDataBase {
    Main mainApp = new Main();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button dataBaseList_backToMain;

    @FXML
    private TableView<MaterialDB> materialT;

    @FXML
    private TableColumn<MaterialDB, String> markaS;

    @FXML
    private TableColumn<MaterialDB, String> density;

    @FXML
    private TableColumn<MaterialDB, String> priceM;

    @FXML
    private TableView<OpenLens> lensT;

    @FXML
    private TableColumn<OpenLens, String> lensNum;

    @FXML
    private TableColumn<OpenLens, String> materialL;

    @FXML
    private TableColumn<OpenLens, String> priceL;

    @FXML
    void initialize() {
        lensNum.setCellValueFactory(new PropertyValueFactory<OpenLens, String>("nameLens"));
        materialL.setCellValueFactory(new PropertyValueFactory<OpenLens, String>("materialLens"));
        priceL.setCellValueFactory(new PropertyValueFactory<OpenLens, String>("priceLens"));

        lensNum.setSortType(TableColumn.SortType.DESCENDING);

        ObservableList<OpenLens> listL = mainApp.getLensList();
        lensT.setItems(listL);

        markaS.setCellValueFactory(new PropertyValueFactory<MaterialDB, String>("materialName"));
        density.setCellValueFactory(new PropertyValueFactory<MaterialDB, String>("density"));
        priceM.setCellValueFactory(new PropertyValueFactory<MaterialDB, String>("priceKG"));

        markaS.setSortType(TableColumn.SortType.DESCENDING);

        ObservableList<MaterialDB> listM = mainApp.getMaterialList();
        materialT.setItems(listM);

        dataBaseList_backToMain.setOnAction(event -> {
            dataBaseList_backToMain.getScene().getWindow().hide();

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