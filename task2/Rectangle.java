package Lesson4.task2;

public class Rectangle implements Shape {
    private double width;
    private double height;
    private Color color;

    public Rectangle(double width, double height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public Color getColor() {
        return color;
    }
}
