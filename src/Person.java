// Person - класс сотрудников для 2 задания
public class Person {
    private String fullName; // фио
    private String position; // должность
    private String email; // почта
    private String phoneNumber; // телефонный номер
    private double salary; // зарплата
    private int age; // возраст

    // конструктор принимающий все поля класса
    public Person(String fullName, String position, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
}