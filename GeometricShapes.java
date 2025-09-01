import java.util.Scanner;

// Step 1: Create Interface
interface Shape {
    double area();

    double perimeter();
}

// Step 2: Circle Class
class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Step 3: Rectangle Class
class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}

// Step 4: Triangle Class (Base & Height)
class Triangle implements Shape {
    double base, height, side1, side2, side3;

    // Take base & height for area; sides for perimeter
    Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double area() {
        return 0.5 * base * height;
    }

    public double perimeter() {
        return side1 + side2 + side3;
    }
}

// Step 5: Main Driver
public class GeometricShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Circle
            System.out.print("Enter radius of Circle: ");
            double radius = sc.nextDouble();
            Shape circle = new Circle(radius);
            System.out.println("Circle Area: " + circle.area());
            System.out.println("Circle Perimeter: " + circle.perimeter());

            // Rectangle
            System.out.print("\nEnter length of Rectangle: ");
            double length = sc.nextDouble();
            System.out.print("Enter breadth of Rectangle: ");
            double breadth = sc.nextDouble();
            Shape rect = new Rectangle(length, breadth);
            System.out.println("Rectangle Area: " + rect.area());
            System.out.println("Rectangle Perimeter: " + rect.perimeter());

            // Triangle
            System.out.print("\nEnter base of Triangle: ");
            double base = sc.nextDouble();
            System.out.print("Enter height of Triangle: ");
            double height = sc.nextDouble();
            System.out.print("Enter side1 of Triangle: ");
            double side1 = sc.nextDouble();
            System.out.print("Enter side2 of Triangle: ");
            double side2 = sc.nextDouble();
            System.out.print("Enter side3 of Triangle: ");
            double side3 = sc.nextDouble();

            Shape triangle = new Triangle(base, height, side1, side2, side3);
            System.out.println("Triangle Area: " + triangle.area());
            System.out.println("Triangle Perimeter: " + triangle.perimeter());

        } catch (Exception e) {
            System.out.println("❌ Invalid input! Please enter numeric values.");
        } finally {
            sc.close();
        }
    }
}
