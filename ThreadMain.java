class classFirst extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d *", i);
        }
    }
}

class classSecond extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d #", i);
        }
    }
}

public class ThreadMain {
    public static void main(String[] args) {
        classFirst t1 = new classFirst();
        classSecond t2 = new classSecond();
        t1.start();
        t2.start();
    }

}
