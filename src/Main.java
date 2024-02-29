import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // создадим объект AppData
        String[] header = {"Abc1", "Def2", "Gh3"};
        int[][] arr = {{111, 222, 333}, {40, 50, 60}};
        AppData appData = new AppData(header, arr);

        // сохраним объект в файл "app_data.csv"
        ScvReader reader = new ScvReader("app_data.csv");
        reader.save(appData);

        // прочитаем из этого же файла
        AppData appData1 = reader.read();
        // сравним два объекта
        System.out.println(appData1.equals(appData)?"Объекты идентичны":"Объекты отличаются");
    }

}