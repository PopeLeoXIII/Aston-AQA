package task2;

// Triangle - класс для прямоугольного треугольника, возьмем именно его для удобства формул
public class Triangle extends ColoredFigure implements IGeometricFigure {
    public double a, b; // катеты прямоугольного треугольника

    public Triangle(double a, double b, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.a = a;
        this.b = b;
    }

    @Override
    // периметр треугольника получим сложив длины всех сторон
    public double perimeter() {
        // найдем гипотенузу треугольника по формуле пифагора
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return this.a + this.b + c;
    }

    @Override
    // площадь треугольника считаем по формуле a * b / 2
    public double area() {
        return this.a * this.b / 2.0;
    }

    @Override
    public String toString() {
        return "Треугольник{" +
                "катет a=" + a +
                ", катет b=" + b +
                ' ' + this.getColors() +
                '}';
    }
}
