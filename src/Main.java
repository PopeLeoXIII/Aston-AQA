public class Main {
    public static void main(String[] args) {
        // создадим массив из 5 сотрудников для 2 задания
        // вначале объявляем массив объектов
        Person[] persArray = new Person[5];
        // потом для каждой ячейки массива задаем объект
        persArray[0] = new Person("Ivanov Ivan", "Engineer",
                "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Smirnov Roman", "Managers",
                "smirnov@mailbox.com", "+799399322", 20000, 31);
        persArray[2] = new Person("Popov Vlad", "Managers",
                "popov@yandex.com", "823423434", 101000, 52);
        persArray[3] = new Person("Kolosov Maksim", "Designer",
                "kolosov@gmail.com", "890912315", 32000, 33);
        persArray[4] = new Person("Novikov Oleg", "Artist",
                "novikov@gmail.com", "892342332", 20500, 21);

    }
}