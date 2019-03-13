package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import logic.DBLogic;
import resources.MaterialDB;
import resources.OpenLens;

import java.io.File;
import java.io.IOException;

public class Main extends Application {
    private static File workDir = new File(System.getProperty("user.dir") + "/DataBase");
    private static File dataBaseF = new File(System.getProperty("user.dir") + "/DataBase/LensesDB.txt");
    private static DBLogic logic = new DBLogic();

    /**
     * Метод заполнения и оповещения объектами для TableView
     */
    public ObservableList<OpenLens> getLensList() {
        OpenLens lens1 = new OpenLens(1, "БУ6.897-258.005-001", "К8", "129.06", "12.08.2018");
        OpenLens lens2 = new OpenLens(2, "УФ.587698.025", "ТК21", "348.5", "18.08.2018");
        OpenLens lens3 = new OpenLens(3, "ГРОМ-01.598.001", "ТФ105", "83.67", "20.08.2018");
        OpenLens lens4 = new OpenLens(4, "АС7-002", "СТК12", "1580.5", "26.08.2018");

        ObservableList<OpenLens> list = FXCollections.observableArrayList(lens1, lens2, lens3, lens4);
        return list;
    }

    public ObservableList<MaterialDB> getMaterialList() {
        MaterialDB mat1 = new MaterialDB("К8", "2.52", "10985.65");
        MaterialDB mat2 = new MaterialDB("ТК21", "3.98", "6278.8");
        MaterialDB mat3 = new MaterialDB("ТФ105", "4.77", "15345.5");
        MaterialDB mat4 = new MaterialDB("СТК12", "3.46", "9245.95");

        ObservableList<MaterialDB> list = FXCollections.observableArrayList(mat1, mat2, mat3, mat4);
        return list;
    }

    /**
     * Запуск графического интерфейса пользователя.
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("samples/sampleMain.fxml"));
        primaryStage.setTitle("Lens Engineer");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * Проверка и создание(если нужно) каталога и файла Базы Данных,
     * Отправка файла БД в логику БД.
     * @throws IOException
     */
    public static void databaseSearch() throws IOException {
        if (!workDir.exists()) {
            workDir.mkdir();
            boolean create = dataBaseF.createNewFile();
        } else {
            if (!dataBaseF.isFile()) {
                boolean create = dataBaseF.createNewFile();
            }
        }

        logic.generateDB(dataBaseF);
    }

    /**
     * Стартовый метод приложения.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        databaseSearch();
        launch(args);
    }
}