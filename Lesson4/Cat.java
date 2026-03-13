package Lesson4;

public class Cat extends Animal {
    private static int catCount = 0;
    private int runLimit = 200;
    private boolean full;

    public Cat(String name) {
        super(name);
        catCount++;
        this.full = false;
    }

    public static int getCatCount() {
        return catCount;
    }

    public boolean isFull() {
        return full;
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            full = true;
            System.out.println(getName() + " покушал " + amount + " еды и теперь сыт");
        } else {
            System.out.println(getName() + " не смог поесть, в миске мало еды");
        }
    }

    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(getName() + " пробежал " + distance + " м.");
        } else {
            System.out.println(getName() + " не может пробежать " + distance + " м., максимум " + runLimit + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " не умеет плавать");
    }
}
