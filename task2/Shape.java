package Lesson4.task2;

public interface Shape {
    double getArea();
    double getPerimeter();
    Color getColor();

    default void printInfo() {
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Цвет заливки: " + getColor().getFillColor());
        System.out.println("Цвет границ: " + getColor().getBorderColor());
        System.out.println();
    }
}
