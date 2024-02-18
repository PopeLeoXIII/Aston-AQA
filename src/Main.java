import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // задание 1
        System.out.println(isSumBetween10And20(11, 10));
        // задание 2
        System.out.println(isPositive(-1));
        // задание 3
        System.out.println(isNegative(0));

        // задание 4
        printer("something", 1);

        // задание 5
        int year = 2000;
        System.out.println(year + " год это " + (isLeap(year)? "високосный":"не високосный ") + " год");

        // задание 6
        int[] arrTask6 = fillArray(20, 0, 1); // создаем массив и заполняем его нулями и единицами
        printArray(arrTask6); // выведем в консоль для наглядности

        for (int i = 0; i < arrTask6.length; i++) { // цикл по всему массиву
            //воспользуемся xor (xor с единицей поменяет наши нули на единицы и наоборот по свойствам битовой операции)
            arrTask6[i] = arrTask6[i] ^ 1;
        }
        printArray(arrTask6); // выыедем в консоль получившийся результат

        // задание 7
        int[] arrTask7 = new int[100]; // создаем массив 100 элементов
        for (int i = 0; i < 100; i++) {
            arrTask7[i] = i + 1; // заполним числами от 1 до 100
        }
        printArray(arrTask7); // выыедем в консоль получившийся результат

        // задание 8
        int[] arrTask8 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // создаем указанный массив
        for (int i = 0; i < arrTask8.length; i++) { // пройдем по массиву
            if (arrTask8[i] < 6) { // если элемент меньше 6
                arrTask8[i] = arrTask8[i] * 2; // умножаем его на 2
            }
        }
        printArray(arrTask8); // выыедем в консоль получившийся результат

        // задание 9
        int n = 5; // выберем размер двумерного массива
        int[][] arrTask9 = new int[n][n];
        for (int i = 0; i < arrTask9.length; i++) {
            for (int j = 0; j < arrTask9[i].length; j++) { // пройдем по всем элементам в подмассивах
                // если индексы равны, значит элемент на главной диагонали
                // есди сумма индексов равна размерности массива, значит элемент на побочной диагонали
                if (i == j || i + j == n - 1)
                    arrTask9[i][j] = 1;
            }
        }

        for (int[] arrays : arrTask9) { // выыедем в консоль получившийся результат
            printArray(arrays);
        }

        // задание 10
        int[] arrTask10 = fillArray(10, 5);
        printArray(arrTask10);

    }
    // isSumBetween10And20 - метод проверяющий что сумма двух целых чисел лежит в пределах от 10 до 20 включительно
    public static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // isPositive - метод проверяющий положительное ли число
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // isNegative - метод проверяющий отрицательное ли число
    public static boolean isNegative(int num) {
        return num < 0;
    }

    // printer - метод печатающий строку, переданную в него превым параметром, указанное
    // вторым параметром количество раз
    public static void printer(String s, int n) {
        if (n <= 0) return; //если печатаем меньше одного раза, то выходим из метода

        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    // isLeap - метод определяющий является ли год високосным
    public static boolean isLeap(int year) {
        if (year < 0) return false; // не рассматриваем отрицательные года
        if (year % 400 == 0) return true; // каждый 400 год високосный
        if (year % 100 == 0) return false; // каждый 100 год не високосный
        if (year % 4 == 0) return true; // каждый 4 год високосный
        return false;
    }

    // fillArray - метод возвращает заполненный случайными элементами массив
    // len - длина масива
    // min - минимальный элемент включая
    // max - максимальный элемент включая
    public static int[] fillArray(int len, int min, int max){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            // Math.random() для получения случайного числа от 0 до 1 и периводим его к нужным пределам min max
            arr[i] = ((int)(Math.random() * (max - min + 1)) + min);
        }
        return arr;
    }

    // fillArray - метод возвращает заполненный начальными элементами массив
    // len - длина масива
    // initialValue - начальный элемент
    public static int[] fillArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) { // можно было бы использовать Arrays.fill()
            arr[i] = initialValue;
        }
        return arr;
    }

    // printArray - метод печатающий массив в консоль
    public static void printArray(int[] arr){
        // можно было бы написать свой, кривоватый, через for, но я подумал что можно воспользоваться этим
        System.out.println((Arrays.toString(arr)));
    }

}