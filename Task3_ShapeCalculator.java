abstract class Shape {

    abstract double calculateArea();

    void displayMessage() {
        System.out.println("Calculating Shape Area...");
    }
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

public class Task3_ShapeCalculator {

    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10, 6);

        circle.displayMessage();
        System.out.println("Area of Circle: " +
                circle.calculateArea());

        rectangle.displayMessage();
        System.out.println("Area of Rectangle: " +
                rectangle.calculateArea());
    }
}