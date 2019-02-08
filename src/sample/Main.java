package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("samples/sampleMain.fxml"));
        primaryStage.setTitle("Lens Engineer");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void databaseSearch() {
        File workDir = new File(System.getProperty("user.dir") + "/DataBase");
        if (!workDir.exists()) {
            workDir.mkdir();
        }
    }

    public static void main(String[] args) {
        databaseSearch();
        launch(args);
    }
}