public class Wait {
    private String msg;
    private boolean msgavailable = false;

    public synchronized void producer(String msg) {
        while (msgavailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interruption");
            }

        }
        this.msg = msg;
        this.msgavailable = true;
        System.out.println("Producer wrote");
        notify();
    }

    public synchronized String consumer() {
        while (!msgavailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interruption");
            }
        }
        String tempmsg = this.msg;
        this.msgavailable = false;
        System.out.println("Consumer read " + tempmsg);
        notify();
        return tempmsg;

    }

    public static void main(String[] args) {
        Wait s = new Wait();
        new Thread(new Runnable() {
            public void run() {
                s.producer("hello");
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                String msg = s.consumer();
            }
        }).start();
    }
}
