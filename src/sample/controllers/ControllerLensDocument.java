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

    public void setLensDocList_nameLens(String lensDocList_nameLens) {
        this.lensDocList_nameLens.setText(lensDocList_nameLens);
    }

    public void setLensDocList_thickness(Label lensDocList_thickness) {
        this.lensDocList_thickness = lensDocList_thickness;
    }

    public void setLensDocList_complexityClass(Label lensDocList_complexityClass) {
        this.lensDocList_complexityClass = lensDocList_complexityClass;
    }

    public void setLensDocList_price(Label lensDocList_price) {
        this.lensDocList_price = lensDocList_price;
    }

    public void setLensDocList_weight(double weight) {
        lensDocList_weight.setText(String.valueOf(weight));
    }

    public void setLensDocList_diameter(double diametr) {
        lensDocList_diameter.setText(String.valueOf(diametr));
    }

    @FXML
    void initialize() {
        lensDocList_price.setText("129.06 руб.");                                //!!!!!!!!!!
        lensDocList_weight.setText("0.012 кг.");                                 //!!!!!!!!!!
        lensDocList_thickness.setText("4.6 мм");                                 //!!!!!!!!!!
        lensDocList_diameter.setText("40 мм");                                   //!!!!!!!!!!
        lensDocList_complexityClass.setText("8й класс");                         //!!!!!!!!!!
        lensDocList_nameLens.setText("БУ6.897-258.005-001");                     //!!!!!!!!!!
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
}