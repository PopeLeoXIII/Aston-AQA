public class Main {
    public static void main(String[] args) {
        // создадим различные коробки
        Box<Apple> appleBox = new Box<>(); // коробка с яблоками
        Box<Orange> orangeBox = new Box<>(); // коробка с апельсинами
        Box<Orange> orangeBoxSameWeight = new Box<>(); // коробка с апельсинами, которая будет весить как коробка яблок

        // помещаем 3 яблока (3кг)
        for (int i = 0; i < 3; i++) {
            appleBox.put(new Apple());
        }

        // помещаем 7 апельсинов (10.5кг)
        for (int i = 0; i < 7; i++) {
            orangeBox.put(new Orange());
        }

        // помещаем 2 апельсина (3кг)
        for (int i = 0; i < 2; i++) {
            orangeBoxSameWeight.put(new Orange());
        }

        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());
        System.out.println("Вес второй коробки с апельсинами: " + orangeBoxSameWeight.getWeight());
        System.out.println("Сравним две коробки: " + appleBox.compare(orangeBox));
        System.out.println("Сравним две коробки с одним весом: " + appleBox.compare(orangeBoxSameWeight));

        // перемещаем все апельсины в одну коробку
        orangeBox.moveTo(orangeBoxSameWeight);

        // попытка использовать коробки с разными фруктами вызывает ошибку
        // orangeBox.moveTo(appleBox);

        System.out.println("Вес всех апельсинов в одной коробке: " + orangeBoxSameWeight.getWeight());

    }
}

