package Lesson4.task2;

public class Main {
    public static void main(String[] args) {
        Color redColor = new Color("Красный", "Черный");
        Color blueColor = new Color("Синий", "Белый");
        Color greenColor = new Color("Зеленый", "Желтый");

        Circle circle = new Circle(5, redColor);
        Rectangle rectangle = new Rectangle(4, 6, blueColor);
        Triangle triangle = new Triangle(3, 4, 5, greenColor);

        System.out.println(" КРУГ ");
        circle.printInfo();

        System.out.println(" ПРЯМОУГОЛЬНИК ");
        rectangle.printInfo();

        System.out.println(" ТРЕУГОЛЬНИК ");
        triangle.printInfo();
    }
}
