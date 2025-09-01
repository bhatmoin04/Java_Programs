import java.util.Scanner;

// Abstract base class
abstract class Shape {
    // Abstract method (must be overridden in subclasses)
    public abstract double area();
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    private double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }
}

// Triangle subclass
class Triangle extends Shape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

// Main class to test polymorphism
public class ShapeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Shape shape; // base class reference

        System.out.println("Choose Shape: 1.Circle  2.Rectangle  3.Triangle");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                shape = new Circle(r);
                break;
            case 2:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double b = sc.nextDouble();
                shape = new Rectangle(l, b);
                break;
            case 3:
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double h = sc.nextDouble();
                shape = new Triangle(base, h);
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        // Dynamic method dispatch at runtime
        System.out.println("Area: " + shape.area());

        sc.close();
    }
}
