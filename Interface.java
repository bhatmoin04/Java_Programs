interface Flyable {
    void fly();
}

class Bird implements Flyable{ 
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Plane implements Flyable{ 
    public void fly() {
        System.out.println("Plane is flying");
    }
}

public class Interface {
    public static void main(String[] args) {
        Flyable b = new Bird();
        Flyable p = new Plane();
        b.fly();
        p.fly();

    }
}
