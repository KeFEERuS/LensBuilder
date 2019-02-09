package logic;

import java.io.*;
import java.util.StringTokenizer;

/**
 * В этом блоке будет описание структуры базы данных.
 */

public class DBLogic {
    private String dataBase[][];
    private String strLine;

    /** Создать массив X на Y */
    public DBLogic(int x, int y) {
        dataBase = new String[x][y];
    }

    /** Определить размер массива по шаблону */
    public DBLogic(File file, String separator) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(String.valueOf(file)));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        int row = 0, collumn = 0;

        while ((strLine = bufferedReader.readLine()) != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(strLine, separator);
            row++;
            if (collumn < stringTokenizer.countTokens()) {
                collumn = stringTokenizer.countTokens();
            }
        }
        dataBase = new String[row][collumn];
    }

    /** Печать всего массива в консоль */
    public void printDB() {
        for (int x = 0; x < dataBase.length; x++) {
            for (int y = 0; y < dataBase[x].length; y++) {
                System.out.print(dataBase[x][y] + " ");
            }
            System.out.println();
        }
    }

    /** Метод проверяет и передаёт файл в createDB для перезаписи в массив */
    public void generateDB(File file) throws IOException {
        try {
            createDB(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** Переписывает базу данных из файла в массив */
    private void createDB(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(String.valueOf(file)));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        int x = 0, y = 0;

        while ((strLine = bufferedReader.readLine()) != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(strLine, "|");
            while (stringTokenizer.hasMoreTokens()) {
                dataBase[x][y] = stringTokenizer.nextToken();
                y++;
            }
            y = 0;
            x++;
        }
    }
}