package task2;

// Circle - класс для круга
public class Circle extends ColoredFigure implements IGeometricFigure {
    public double r; // радиус круга

    public Circle(double r, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.r = r;
    }

    @Override
    // периметр круга считаем по формуле 2 * pi * r
    public double perimeter() {
        return 2.0 * this.r * Math.PI;
    }

    @Override
    // площадь круга считаем по формуле pi * r^2
    public double area() {
        return Math.PI * this.r * this.r;
    }

    @Override
    public String toString() {
        return "Окружность{" +
                "радиус=" + r +
                ' ' + this.getColors() +
                '}';
    }
}
