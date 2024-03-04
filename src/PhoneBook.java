import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Phonebook - класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров
public class PhoneBook {
    private final Map<String, List<String>> book;

    public PhoneBook() {
        book = new HashMap<>();
    }

    // add - добавляет в справочник телефонный номер для указанной фамилии
    public void add(String family, String number) {
        if (!book.containsKey(family)) {
            book.put(family, new ArrayList<>());
        }
        book.get(family).add(number);
    }

    // get - возвращает список номеров для переданной фамилии, или null если для фамилии не указано телефонных номеров
    public List<String> get(String family) {
        if (book.containsKey(family)) {
            return book.get(family);
        }
        return null;
    }
}
