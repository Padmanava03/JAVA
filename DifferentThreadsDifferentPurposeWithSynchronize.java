class Th1 extends Thread {
    private final Object lock;

    public Th1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread #1 : " + i);
                try {
                    Th1.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thread #1 is DEAD!!!");
        }
    }
}

class Th2 implements Runnable {
    private final Object lock;

    public Th2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 10; i > 0; i--) {
                System.out.println("Thread #2 : " + i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thread #2 is DEAD!!!");
        }
    }
}

class Th3 extends Thread {
    private final Object lock;

    public Th3(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 20; i++) {
                if (i % 2 == 0) {
                    System.out.println("Thread #3 : " + i);
                    try {
                        Th3.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("Thread #3 is DEAD!!!");
        }
    }
}

public class Exp20 {

    public static void main(String[] args) {
        Object lock = new Object();
        Th1 th1 = new Th1(lock);
        Th2 th2 = new Th2(lock);
        Th3 th3 = new Th3(lock);
        th1.start();
        new Thread(th2).start();
        th3.start();
    }
}
