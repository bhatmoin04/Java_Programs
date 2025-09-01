class vehicle {
    void run() {
        System.out.println("vehicle");
    }
}

class car extends vehicle {
    void run() {
        System.out.println("car");
    }
}

class motorcycle extends vehicle {
    void run() {
        System.out.println("motorcycle");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        vehicle v;
        v = new vehicle();
        v.run();
        v = new car();
        v.run();
        v = new motorcycle();
        v.run();

    }
}
