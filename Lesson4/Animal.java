package Lesson4;

public abstract class Animal {
    private static int count = 0;
    private String name;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);
}
