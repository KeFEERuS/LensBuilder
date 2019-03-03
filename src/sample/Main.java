package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import logic.DBLogic;

import java.io.File;
import java.io.IOException;

public class Main extends Application {
    private static File workDir = new File(System.getProperty("user.dir") + "/DataBase");
    private static File dataBaseF = new File(System.getProperty("user.dir") + "/DataBase/LensesDB.txt");
    private static DBLogic logic = new DBLogic();

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