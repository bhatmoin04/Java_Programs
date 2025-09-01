interface phone {
    void call(String n);
}

interface camera {
    void photo();
}

class smartphone implements phone, camera {
    public void call(String n) {
        System.out.println("Calling : " + n);
    }

    public void photo() {
        System.out.println("Take photo");
    }
}

public class InterfacePhone {
    public static void main(String[] args) {
        smartphone s = new smartphone();
        s.call("123");
        s.photo();
    }
}
