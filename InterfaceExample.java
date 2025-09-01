interface Flyable {
    void fly();
}

class bird implements Flyable {
    public void fly() {
        System.out.println("bird");
    }
}

class plane implements Flyable {
    public void fly() {
        System.out.println("plane");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Flyable b = new bird();
        b.fly();
        Flyable p = new plane();
        p.fly();

    }
}
