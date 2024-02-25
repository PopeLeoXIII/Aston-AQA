import task1.Cat;
import task2.Circle;
import task2.IGeometricFigure;
import task2.Square;
import task2.Triangle;

public class Main {
    public static void main(String[] args) {
        // задание 1
        // Создадим и заполним массив из 5 котов
        Cat[] cats = new Cat[5];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
        }

        System.out.println("Создаем миску в которой 20 еды.");
        Cat.Feeder feeder = new Cat.Feeder(20);

        // попробуем накормить всех котов
        for (Cat cat : cats) {
            cat.feedCat(feeder);
        }

        // выведем информацию о котах в консоль
        for (Cat cat : cats) {
            System.out.println(cat);
        }

        // задание 2
        System.out.println();

        // создадим массив разных геометрических фигур
        IGeometricFigure[] figures = new IGeometricFigure[3];
        figures[0] = new Circle(5.0, ":Черный", "Желтый");
        figures[1] = new Square(5.0, "Красный", "Зеленый");
        figures[2] = new Triangle(5.0, 5.0, "Синий", "Белый");

        // выведем информацию о фигурах, их периметр и площадь
        for (IGeometricFigure figure: figures) {
            System.out.println(figure + " Периметр= " + figure.perimeter() +  " Площадь= " + figure.area());
        }
    }
}