public class Main {
    public static void main(String[] args) {
        // в качестве текста взял набор предложений, в которых будут повторяться слова, без привязки к их смыслу
        String text = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy."
                + "But good morning! Good morning to ye and thou! I’d say to all my patients, because I was the worse of the hypocrites, of all the hypocrites, the cruel and phony hypocrites, I was the very worst."
                + "Hatred was spreading everywhere, blood was being spilled everywhere, wars were breaking out everywhere."
                + "Paranoids are not paranoid because they’re paranoid, but because they keep putting themselves, fucking idiots, deliberately into paranoid situations.";

        // создадим наш обработчик текстов
        TextHandler handler = new TextHandler(text);

        // получим список слов и выведем его в консоль
        handler.listOfUniqueWordsWithMap().forEach(System.out::println);

        // создадим телефонный справочник и заполним его данными
        PhoneBook pb = new PhoneBook();

        pb.add("Иванов", "27-41-27");
        pb.add("Петров", "25-06-28");
        pb.add("Сидоров", "07-21-78");
        pb.add("Смирнов", "87-11-98");
        pb.add("Иванов", "10-41-21");
        pb.add("Иванов", "20-42-20");
        pb.add("Петров", "55-43-01");

        // получим номера из справочника
        System.out.println("Иванов: " + pb.get("Иванов"));
        System.out.println("Петров: " + pb.get("Петров"));
        System.out.println("Сидоров: " + pb.get("Сидоров"));
        System.out.println("Смирнов: " + pb.get("Смирнов"));
        System.out.println("Кузьмин: " + pb.get("Кузьмин"));

    }
}