package task2;

// ColoredFigure - класс цветных фигур
// От этого класса унаследуем поля с цветами во всех геометрических фигурах
// Можно сделать его абстрактным, если не хотим что бы создавались экземпляры геометрических фигур только с цветом
// Можем имплементировать нам интерфейс, тогда периметр и площадь будут использовать деволтные реализации
public abstract class ColoredFigure {
    public String fillColor; // цвет фона фигуры
    public String borderColor; // цвет границы фигуры

    public ColoredFigure(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public String getColors() {
        return "цвет фона=" + fillColor +
                ", цвет границ=" + borderColor;
    }
}
