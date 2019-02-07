package sample.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.Parent;
import javafx.stage.Modality;
import javafx.stage.Stage;

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
            mainList_newLens.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/samples/smapleNewLens.fxml"));

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
            stage.showAndWait();
        });

        mainList_openDetail.setOnAction(event -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/samples/sampleOpenLensModal.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage openLensModalWindow = new Stage();
            openLensModalWindow.initModality(Modality.APPLICATION_MODAL);
            openLensModalWindow.setTitle("Выбор линзы");
            openLensModalWindow.setScene(new Scene(root));
            openLensModalWindow.setResizable(false);
            openLensModalWindow.show();
        });

        mainList_dataBase.setOnAction(event -> {
            mainList_dataBase.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/samples/sampleDataBase.fxml"));

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
            stage.showAndWait();
        });

        mainList_exit.setOnAction(event -> {
            System.exit(1);
        });
    }
}