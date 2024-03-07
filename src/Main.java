import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        StreamHelper helper = new StreamHelper();

        // создадим лист случайных интов от 1 до 10
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intList.add((int)(Math.random() * 10) + 1);
        }

        // выведем лист и количество четных элементов в нем
        System.out.printf("В коллекции %s %d четных элементов\n\n", intList, StreamHelper.evenCount(intList));


        // чтобы получить коллекцию, состоящую из строк: «Highload», «High», «Load», «Highload»
        // создадим лист из 10 элементов, которые выбираются случайно из строк в задании
        String[] words = {"Highload", "High", "Load"};
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            stringList.add(words[((int)(Math.random() * words.length))]);
        }

        System.out.println("В коллекции " + stringList);
        String high = words[1]; // "High"
        System.out.printf("Элемент %s встречается %d раз\n", high, StreamHelper.wordCount(stringList, high));
        System.out.printf("Первый элемент: %s \n", StreamHelper.firstElement(stringList));
        System.out.printf("Последний элемент: %s \n", StreamHelper.lastElement(stringList));

        // из задания не очень понятно какой 0 надо возвращать для пустой коллекции, я оставил строку "0" а не null
        System.out.println("Для пустой коллекции первый элемент: " + StreamHelper.firstElement(new ArrayList<>()));
        System.out.println("Для пустой коллекции последний элемент: " + StreamHelper.lastElement(new ArrayList<>()));


        // Чтобы получить коллекцию, содержащую элементы "f10", "a15", "f2", "f4", "f5", “b54”, “a16” создадим сет из 5
        // элементов, выбранных случайно (т.к. сет содержит только уникальные элементы не будем брать 10, чтобы коллекции отличались)
        String[] words2 = {"f10", "a15", "f2", "f4", "f5", "b54", "a16"};
        Set<String> stringSet = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            stringSet.add(words2[((int)(Math.random() * words2.length))]);
        }
        // можно также как в прошлом примере использовать лист
        // List<String> stringSet = new ArrayList<>();
        // for (int i = 0; i < 20; i++) {
        //     stringSet.add(words2[((int)(Math.random() * words2.length))]);
        // }

        System.out.println("\nКоллекцию " + stringSet);
        System.out.println("Отсортируем в алфавитном порядке " + StreamHelper.sort(stringSet));

        // создадим коллекцию студентов из задания
        Collection<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Gender.MAN),
                new Student("Максим", 20, Gender.MAN),
                new Student("Екатерина", 20, Gender.WOMAN),
                new Student("Михаил", 28, Gender.MAN)
        );

        System.out.println("\nСредний возраст студентов мужского пола: " + StreamHelper.studentMaleMidlAge(students));
        System.out.println("Список студентов подпадающих под воинский призыв\n"
                + StreamHelper.studentConscription(students));

        // создадим список куда будем считывать логины
        List<String> logins = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите логин: \n");
        while (in.hasNextLine()){
            String str = in.nextLine(); // считаем строку из консоли
            if (str.isEmpty()) { // прекратим ввод когда будет введена пустая строка
                System.out.println("Пустая строка. Конец ввода.");
                break;
            }

            logins.add(str);
        }

        char firstChar = 'f'; // символ с которого должен начинаться логин
        System.out.println("\nСписок логинов в которых первый символ: " + firstChar);
        System.out.println(StreamHelper.filterByFirstChar(logins, firstChar));
    }
}