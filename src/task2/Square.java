package task2;

// Square - класс для квадрата
public class Square extends ColoredFigure implements IGeometricFigure {
    public double a; // сторона квадрата

    public Square(double a, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.a = a;
    }

    @Override
    // периметр квадрата считаем по формуле 4 * a
    public double perimeter() {
        return 4.0 * this.a;
    }

    @Override
    // площадь квадрата считаем по формуле a^2
    public double area() {
        return this.a * this.a;
    }

    @Override
    public String toString() {
        return "Квадрат{" +
                "сторона=" + a +
                ' ' + this.getColors() +
                '}';
    }
}
