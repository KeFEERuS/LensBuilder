package sample.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

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
        lensDocList_done.setOnAction(event -> {
            lensDocList_done.getScene().getWindow().hide();

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

    public void setLensDocList_diameter(double diam) {
        lensDocList_diameter.setText(String.valueOf(diam));
    }
}