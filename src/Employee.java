// Employee - класс сотрудников для 1 задания
public class Employee {
    private String fullName; // фио
    private String position; // должность
    private String email; // почта
    private String phoneNumber; // телефонный номер
    private double salary; // зарплата
    private int age; // возраст

    // конструктор принимающий все поля класса
    public Employee(String fullName, String position, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    // конструктор создающий сотрудника по умолчания
    public Employee() {
        this.fullName = "Ivanov Ivan";
        this.position = "Engineer";
        this.email = "ivivan@mailbox.com";
        this.phoneNumber = "892312312";
        this.salary = 30000;
        this.age = 30;
    }

    @Override
    public String toString() {
        return "Сотрудник {" +
                "ФИО='" + fullName + '\'' +
                ", должность='" + position + '\'' +
                ", email='" + email + '\'' +
                ", телефон='" + phoneNumber + '\'' +
                ", зарплата=" + salary +
                ", возраст=" + age +
                '}';
    }

    // print - метод, который выводит информацию о сотруднике в консоль
    public void print() {
        System.out.println(this.toString());
    }
}
