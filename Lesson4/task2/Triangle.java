package Lesson4.task2;

public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private Color color;

    public Triangle(double sideA, double sideB, double sideC, Color color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.color = color;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
