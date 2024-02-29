import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // создаем массив 4х4 из строк
        String[][] matrix = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3p", "4"}
        };

        try {
            // пробуем просуммировать все элементы массива
            int sum = sumMatrix(matrix);
            System.out.println(sum);
        } catch (MyArraySizeException e) {
            // обработка ошбки размера массива
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            // обработка ошбки в данных массива
            System.out.println(e.getMessage());
        }

    }

    // sumMatrix - метод суммирующий все элементы массива
    public static int sumMatrix(String[][] data) throws MyArraySizeException, MyArrayDataException {
        int n = 4; // размерность массива
        int sum = 0; // переменная для суммы

        // проверяем что в матрице 4 строки
        if (data.length != n) {
            throw new MyArraySizeException("В матрице должно быть " + n + " строки");
        }

        // проверяем что в каждой строке 4 элемента
        for (int i = 0; i < n; i++) {
            if (data[i].length != n) {
                throw new MyArraySizeException("В матрице " + (i + 1) + " строка должна содержать " + n + " элемента");
            }
        }

        // пройдем по всем элементам
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                try {
                    // пробуем преобразовать в int
                    sum += Integer.parseInt(data[i][j]);
                } catch (NumberFormatException e) { // метод parseInt может выбросить NumberFormatException
                    // генерируем свое исключение
                    String errMassage = String.format("Неверные данные в строке %d столбце %d: %s", i + 1, j + 1, e.getMessage());
                    throw new MyArrayDataException(errMassage);
                }
            }
        }
        return sum;
    }
}