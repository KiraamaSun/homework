package Lesson4;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Бобик");
        animals[1] = new Dog("Шарик");
        animals[2] = new Cat("Мурзик");
        animals[3] = new Cat("Барсик");

        System.out.println();
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(150);
            animals[i].swim(5);
            System.out.println();
        }

        System.out.println();
        System.out.println("Всего животных: " + Animal.getCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Котов: " + Cat.getCatCount());
        System.out.println();

        System.out.println();
        Bowl bowl = new Bowl(50);
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Рыжик");
        cats[1] = new Cat("Снежок");
        cats[2] = new Cat("Пушок");

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(bowl, 20);
        }

        System.out.println();
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].getName() + " сытость: " + (cats[i].isFull() ? "сыт" : "голоден"));
        }

        System.out.println("Осталось еды в миске: " + bowl.getFoodAmount());

        bowl.addFood(30);
        System.out.println("Добавили еды. Теперь в миске: " + bowl.getFoodAmount());
    }
}
