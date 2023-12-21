package multithreading;

public class threadByRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Multithreading using Implements Runnable");
    }
}


class myThreadRunnable{
    public static void main(String[] args) {
        threadByRunnable r = new threadByRunnable();

        // works like a normal method i.e thread concept is not applicable.
        r.run();
        Thread t = new Thread(r);
        t.start();
    }
}