class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("The thread is running");
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Interruption");
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
    }
}
