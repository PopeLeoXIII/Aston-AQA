package task1;

// part_1.Dog - класс для собаки
public class Dog extends Animal {
    public final static int runRangeMax = 500; // ограничение на бег для собаки
    public final static int swimRangeMax = 10; // ограничение на плавание для собаки

    static int cnt = 0; // счетчик для подсчета собак

    public Dog() {
        cnt++; // увеличиваем значение на сетчике созданных собак
    }

    // swim - метод для плавания на дистанцию range
    @Override
    public void swim(int range) {
        super.swim(range);
        if (range <= swimRangeMax) {
            // если дистаниця меньше или равна максимальной, то сообщаем в консоль об успехе
            System.out.println("Собака проплыла " + range + " метров.");
        } else {
            // иначе сообщаем в консоль о превышении ограничения
            System.out.println("Дистанция слишком большая. " + range + " > " + swimRangeMax);
        }
    }

    // run - метод для бега на дистанцию range
    @Override
    public void run(int range) {
        super.run(range);
        if (range <= runRangeMax) {
            // если дистаниця меньше или равна максимальной, то сообщаем в консоль об успехе
            System.out.println("Собака пробежала " + range + " метров.");
        } else {
            // иначе сообщаем в консоль о превышении ограничения
            System.out.println("Дистанция слишком большая. " + range + " > " + runRangeMax);
        }
    }

}
