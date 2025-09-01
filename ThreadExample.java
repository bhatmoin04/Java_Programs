class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.err.println("Running");
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException i) {
            System.out.println("Interruption");
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {

        MyThread t = new MyThread();
        t.start();

    }
}
