import java.util.*;

abstract class Shape {
    public void display() {
        System.out.println("This is a shape ");
    }

    public abstract double Area();
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public double Area() {
        return 3.14 * r * r;
    }
}

class Rectangle extends Shape {
    int l;
    int b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public double Area() {
        return l * b;
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Shape c = new Circle(60);
        Shape r = new Rectangle(10, 10);
        c.display();
        r.display();
        System.out.printf("Area of circle : ", c.Area());
        System.out.println("Area of Rectangle :" + r.Area());
    }

}
