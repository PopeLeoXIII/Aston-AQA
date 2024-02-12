public class Main {
    // printTreeWords - метод печатает в консоль Orange, Banana, Apple в столбец
    public static void printTreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    // checkSumSign - метод суммирует два произвально выбранных числа
    // и печатает в консоль сообщение о том положительная или отрицательная их сумма
    public static void checkSumSign() {
        int a = 4, b = -2;
        // определим знак получившейся суммы и запишем в переменную sumSign
        boolean sumSign = a + b >= 0 ? true: false;
        if (sumSign) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // printColor - в зависимости от произвольно выбранного числа метод печатает в консоль
    // один из трех цветов: Красный, Желтый или Зеленый
    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный"); // красный в случае если число меньше или равно 0
        } else if (value > 100) {
            System.out.println("Зеленый"); // зеленый если число строго больше 100
        } else {
            System.out.println("Желтый"); // желтый если 0 < value <= 100
        }
    }

    // compareNumbers - метод сравнивает два произваольно выбранных числа
    // и печатает в консоль "a >= b" или "a < b" в зависимости от значения чисел
    public static void compareNumbers() {
        int a = 4, b = 5;
        System.out.println("a " + (a >= b ? ">=":"<") + " b");
    }

    public static void main(String[] args) {
        printTreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
}