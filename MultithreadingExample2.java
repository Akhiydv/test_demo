class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class MyRunnable implements Runnable {
    private Counter counter;

    public MyRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            counter.increment();
            System.out.println(Thread.currentThread().getName() + " is running... Count = " + counter.getCount());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread extends Thread {
    private Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            counter.increment();
            System.out.println(this.getName() + " is executing... Count = " + counter.getCount());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultithreadingExample2 {
    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread t1 = new Thread(new MyRunnable(counter), "Runnable-Thread");
        MyThread t2 = new MyThread(counter);
        t2.setName("Extended-Thread");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nFinal Count (after both threads): " + counter.getCount());
    }
}
