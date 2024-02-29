import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// AppData - класс данных для таблицы с целыми числами, предназначенными для записи в scv файл
public class AppData {
    private String[] header; // список столбцов таблицы
    private int[][] data; // строки таблицы
    private static final String delimiter = ";"; // разделитель, необходимый для записи в файл

    // конструктор принимающий данные таблицы
    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    // конструктор принимающий коллекцию строк, где первой строкой идет список столбцов
    public AppData(List<String> content) {
        // разделяем список столбцов по разделителю
        header = content.get(0).split(delimiter);
        // создаем массив нужного размера
        data = new int[content.size() - 1][];

        // первая строка содержит названия столбцов, поэтому индексы с 1
        for (int i = 1; i < content.size(); i++) {
            // разделяем строку таблицы
            String[] lineOfString = content.get(i).split(delimiter);
            // превращаем String[] в int[]
            data[i - 1] = Arrays.stream(lineOfString).mapToInt(Integer::parseInt).toArray();
        }
    }

    // toScvContent - метод который приводит AppData к формату удобному для записи в scv
    public List<String> toScvContent() {
        // создаем коллекцию строк
        List<String> scvContent = new ArrayList<>();
        // объединяем список столбцов в одну строчку для записи в таблицу и кладем ее в коллекцию
        scvContent.add(toScvLine(header));

        for (int[] lineOfInt: data) {
            // превращаем строку данных из int[] в String[]
            String[] lineOfString = Arrays.stream(lineOfInt).mapToObj(String::valueOf).toArray(String[]::new);
            // объединяем строку данных в одну строчку для записи в таблицу и кладем ее в коллекцию
            scvContent.add(toScvLine(lineOfString));
        }

        return scvContent;
    }

    // toScvLine - метод объединяющий массив данных в одну строку таблицы, отделяя их разделителем
    public String toScvLine(String[] strings) {

        return String.join(delimiter, strings) + "\n";

//        все то же самое через StringBuilder
//        StringBuilder line = new StringBuilder();
//        for (int i = 0; i < strings.length; i++) {
//            line.append(strings[i]);
//            if (i != strings.length - 1) {
//                line.append(delimiter);
//            }
//        }
//        line.append("\n");
//        return line.toString();
    }

    // переопределим для сравнения с считанным из файла объектом
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // проверим что класс тот же
        if (o == null || getClass() != o.getClass()) return false;
        AppData appData = (AppData) o;

        // сравним длины списка столбцов и количество строк
        if (appData.header.length != this.header.length || appData.data.length != this.data.length )
            return false;

        // сравним столбцы
        for (int i = 0; i < this.header.length; i++) {
            if (!this.header[i].equals(appData.header[i]))
                return false;
        }

        // сравним данные
        for (int i = 0; i < this.data.length; i++) {
            if (appData.data[i].length != this.data[i].length )
                return false;
            for (int j = 0; j < appData.data[i].length; j++) {
                if (this.data[i][j] != appData.data[i][j])
                    return false;
            }
        }

        return true;
    }
}