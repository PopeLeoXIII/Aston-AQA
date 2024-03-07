import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
// StreamHelper - класс содержащий статические методы для работы с коллекциями с помощью стримов
public class StreamHelper {

    // evenCount - метод для подсчета количества четных элементов в коллекции интов coll
    public static long evenCount(Collection<Integer> coll) {
        return coll.stream()
                .filter(el -> (el % 2 == 0))
                .count();
    }

    // wordCount - метод для подсчета количества вхождений элементов word в коллекции строк coll
    public static long wordCount(Collection<String> coll, String word) {
        return coll.stream()
                .filter(el -> (el.equals(word)))
                .count();
    }
    // firstElement - метод для получения первого элемента из коллекции строк coll
    public static String firstElement(Collection<String> coll) {
        return coll.stream()
                .findFirst()
                .orElse("0");
    }

    // lastElement - метод для получения последнего элемента из коллекции строк coll
    public static String lastElement(Collection<String> coll) {
        return coll.stream()
                .reduce((prev, next) -> next)
                .orElse("0");
    }

    // sort - метод для сортировки коллекции строк coll в алфавитном порядке
    public static List<String> sort(Collection<String> coll) {
        return coll.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    // studentMaleMidlAge - метод для получения среднего возраста мужчин из списка студентов coll
    public static double studentMaleMidlAge(Collection<Student> coll) {
        return coll.stream()
                .filter(el -> el.getGender() == Gender.MAN) // оставим в потоке только студентов мужчин
                .mapToInt(Student::getAge) // преобразуем в стрим интов, взяв геттером возраст
                .average() // получим среднее
                .orElse(0.0); // обработаем null
    }

    // studentConscription - метод возвращает список студентов подпадающих под воинский призыв
    public static List<Student> studentConscription(Collection<Student> coll) {
        return coll.stream()
                .filter(el -> el.getGender() == Gender.MAN && el.getAge() > 17 && el.getAge() < 28)
                .collect(Collectors.toList());
    }

    // filterByFirstChar - фильтрует коллекцию строк coll, возвращая список из тех строк, первым символ в которых ch
    public static List<String> filterByFirstChar(Collection<String> coll, char ch) {
        return coll.stream()
                .filter(s -> s.charAt(0) == ch)
                .collect(Collectors.toList());
    }
}