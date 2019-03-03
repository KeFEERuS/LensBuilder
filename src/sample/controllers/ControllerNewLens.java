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
import javafx.scene.control.TextField;
import logic.ProcessingData;

public class ControllerNewLens {
    ProcessingData calc = new ProcessingData();

    private double diam;

    public double getDiam() {
        return diam;
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField radius1;

    @FXML
    private TextField lensMaterial;

    @FXML
    private TextField totalThickness;

    @FXML
    private TextField localErrorDN;

    @FXML
    private Button newLensList_backToMain;

    @FXML
    private TextField clearAperture2;

    @FXML
    private TextField clearAperture1;

    @FXML
    private TextField limitDiameter;

    @FXML
    private TextField errorN;

    @FXML
    private TextField diameter;

    @FXML
    private TextField limitTC;

    @FXML
    private TextField polishingClass;

    @FXML
    private TextField nameLens;

    @FXML
    private TextField axisT;

    @FXML
    private Button newLensList_Calculation;

    @FXML
    private TextField radius2;

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

        newLensList_Calculation.setOnAction(event -> {
            diam = calc.getLimitDiameter(Double.valueOf(diameter.getText()));

            newLensList_Calculation.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/samples/sampleLensDocument.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setTitle("Lens Engineer");
            stage.setScene(new Scene(root));
            ControllerLensDocument controllerLensDocument = loader.getController();
            controllerLensDocument.setLensDocList_diameter(diam);
            stage.setResizable(false);
            stage.show();
        });
    }
}