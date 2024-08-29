import java.util.*;
// Interface defining common methods for shapes
interface ShapeOperations {
    double calculateArea();
    double calculatePerimeter();
}

// Base class Shape
abstract class Shape implements ShapeOperations {
    // Common properties for all shapes
    // ...

    // Abstract methods to be implemented by subclasses
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

// Concrete class representing Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Concrete class representing Rectangle
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

// Concrete class representing Triangle
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        // Heron's formula to calculate area of a triangle
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

// Example usage
public class Main1 {
    public static void main(String[] args) {
        // Creating instances of shapes
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        // Calculating and printing area and perimeter for each shape
        System.out.println("Circle: Area = " + circle.calculateArea() + ", Perimeter = " + circle.calculatePerimeter());
        System.out.println("Rectangle: Area = " + rectangle.calculateArea() + ", Perimeter = " + rectangle.calculatePerimeter());
        System.out.println("Triangle: Area = " + triangle.calculateArea() + ", Perimeter = " + triangle.calculatePerimeter());
    }
}
