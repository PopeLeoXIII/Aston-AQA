import java.util.ArrayList;

// Box - класс коробки в которую можно складывать фрукты
public class Box <T extends Fruit> {
    public ArrayList<T> elements; // список фруктов в коробке

    public Box() {
        this.elements = new ArrayList<T>();
    }

    // put - метод помещающий в коробку фрукт
    public void put(T el) {
        elements.add(el);
    }

    // getWeight - метод, который высчитывает вес коробки
    public double getWeight() {
        if (elements.isEmpty())
            return 0; // если элементов в коробке нет, то вес 0
        return elements.size() * elements.get(0).getWeight(); // кол-во фруктов * на вес одного
    }

    // compare - метод для сравнения коробок по их весу
    public boolean compare(Box<?> box) {
        return this.getWeight() == box.getWeight(); // true если вес фруктов внутри коробок равен
    }

    // moveTo - метод перемещающий фрукты из текущей коробки в box
    public void moveTo(Box<T> box) {
        elements.forEach(box::put);
    }
}
