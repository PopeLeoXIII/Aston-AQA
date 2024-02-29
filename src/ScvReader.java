import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// ScvReader - класс для записи и чтения scv файлов
public class ScvReader {
    private final String fileName; // имя файла

    public ScvReader(String fileName) {
        this.fileName = fileName;
    }

    // save - метод для записи AppData в файл
    public void save(AppData data) {
        // открываем блок try с ресурсами
        try (FileWriter fileWriter = new FileWriter(this.fileName)) {
            // представляем AppData в необходимом для записи виде и по строчкам записываем в файл
            for (String line : data.toScvContent()) {
                fileWriter.write(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // read - метод для чтения AppData из файла
    public AppData read() {
        // создаем коллекцию куда будем записывать содержимое файла
        ArrayList<String> content = new ArrayList<>();
        // открываем блок try с ресурсами
        try (Scanner scanner = new Scanner(new File(this.fileName))) {
            // пока в файле еще что-то есть считываем новые строки
            while (scanner.hasNextLine()) {
                content.add(scanner.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // превращаем коллекцию строк в AppData и возвращаем
        return new AppData(content);
    }
}
