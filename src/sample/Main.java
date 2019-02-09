package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Main extends Application {
    private static File workDir = new File(System.getProperty("user.dir") + "/DataBase");
    private static File dataBaseF = new File(System.getProperty("user.dir") + "/DataBase/LensesDB.txt");

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("samples/sampleMain.fxml"));
        primaryStage.setTitle("Lens Engineer");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void databaseSearch() throws IOException {
        if (!workDir.exists()) {
            workDir.mkdir();
            boolean create = dataBaseF.createNewFile();
        } else {
            if (!dataBaseF.isFile()) {
                boolean create = dataBaseF.createNewFile();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        databaseSearch();
        launch(args);
    }
}