class MyRunnable implements Runnable {
    public void run() {
        System.out.println("T1 runs");

        try {
            Thread.sleep(200);
        } catch (InterruptedException i) {
            System.out.println("Interruption");
        }
    }

}

class Runnable2 implements Runnable {
    public void run() {
        System.out.println("T2 runs");

        try {
            Thread.sleep(200);
        } catch (InterruptedException i) {
            System.out.println("Interruption");
        }
    }
}

public class RunnambleThread {
    public static void main(String[] args) {

        MyRunnable r1 = new MyRunnable();
        Thread t1 = new Thread(r1);
        t1.start();
        Runnable2 r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t2.start();

    }
}
