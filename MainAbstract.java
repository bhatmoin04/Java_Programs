abstract class shape {
    void display() {
        System.out.println("This is a shape");
    }

    public abstract double getArea();
}

class circle extends shape {
    double r;

    public circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return 3.14 * r * r;
    }
}

class rectangle extends shape {
    double l;
    double b;

    public rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public double getArea() {
        return l * b;
    }
}

public class MainAbstract {
    public static void main(String[] args) {
        shape c = new circle(3);
        shape r = new rectangle(4, 5);
        c.getArea();
        r.getArea();
        c.display();
        r.display();
    }
}
