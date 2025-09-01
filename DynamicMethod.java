class A {
    public void show() {
        System.out.println("This is A");
    }
}

class B extends A {
    public void show() {
        System.out.println("This is B");
    }

}

class C extends A {
    public void show() {
        System.out.println("This is C");
    }
}

public class DynamicMethod {
    public static void main(String[] args) {
        A ref;
        B obj1 = new B();
        ref = obj1;
        ref.show();

        C obj2 = new C();
        ref = obj2;
        ref.show();
    }
}
