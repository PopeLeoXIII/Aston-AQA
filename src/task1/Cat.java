package task1;

// part_1.Cat - класс для кота
public class Cat extends Animal {
    public final static int runRangeMax = 200; // ограничение на бег для кота
    static int cnt = 0; // счетчик для подсчета котов
    public boolean satiety; // сытость кота
    public int gluttony; // количество еды, необходимое коту, чтобы стать сытым

    // Feeder - класс миски с едой
    // В задании это не уточнается, но так как кормить мы будем именно котов, то сделал класс вложенным
    public static class Feeder {
        private int feed; // количество еды в миске

        // fillFeeder - метод для пополнения миски на n еды
        public void fillFeeder(int n) {
            feed = feed + n;
        }

        // конструктор для создания уже наполненной едой миски
        public Feeder(int feed) {
            this.feed = feed;
        }
    }

    public Cat() {
        cnt++; // увеличиваем значение на сетчике созданных котов
        this.satiety = false; // коты создаются голодными
        this.gluttony = (int) ((Math.random() * 9) + 1); //случайным образом устанавливаем прожорливость кота от 1 до 10
    }

    // swim - метод для плавания на дистанцию range
    @Override
    public void swim(int range) {
        super.swim(range);
        System.out.println("Кот не умеет плавать");
    }

    // run - метод для бега на дистанцию range
    @Override
    public void run(int range) {
        super.run(range);
        if (range <= runRangeMax) {
            // если дистаниця меньше или равна максимальной, то сообщаем в консоль об успехе
            System.out.println("Кот пробежал " + range + " метров.");
        } else {
            // иначе сообщаем в консоль о превышении ограничения
            System.out.println("Дистанция слишком большая. " + range + " > " + runRangeMax);
        }
    }

    // feedCat - метод для того чтобы кормить бедное, изголодавшееся животное
    public void feedCat(Feeder feeder){
        // подумал что логично будет добавить проверку на сытость кота
        if (this.satiety) {
            System.out.println("Ого! Кот сыт, количество еды в миске не изменилось.");
        }

        // если для кота в миске достаточно еды
        if (feeder.feed >= this.gluttony) {
            feeder.feed -= this.gluttony; // уменьшаем количество еды в миске
            this.satiety = true; // кот теперь сыт
            System.out.print("Кот теперь сыт. ");
        } else {
            System.out.print("Коту не хватило еды. ");
        }
        System.out.println("В миске осталось " + feeder.feed + " еды.");
    }

    @Override
    public String toString() {
        return "Кот{" +
                "сыт=" + satiety +
                ", прожорливость=" + gluttony +
                '}';
    }
}



