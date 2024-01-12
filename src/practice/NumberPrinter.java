package practice;

public class NumberPrinter {
    private static final int MAX_NUMBER = 9;
    private static volatile int currentNumber = 1;
    private static final Object locker = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(createRunnable(1));
        Thread thread2 = new Thread(createRunnable(2));
        Thread thread3 = new Thread(createRunnable(3));

        thread1.start();
        thread2.start();
        thread3.start();
    }

    private static Runnable createRunnable(int threadNumber) {
        return () -> {
            while (currentNumber <= MAX_NUMBER) {
                synchronized (locker) {
                    if (currentNumber % 3 == threadNumber - 1) {
                        printAndIncrement(threadNumber);
                        locker.notifyAll();
                    } else {
                        waitForTurn();
                    }
                }
            }
        };
    }

    private static void printAndIncrement(int threadNumber) {
        System.out.println("Thread " + threadNumber + ": " + currentNumber);
        currentNumber++;
    }

    private static void waitForTurn() {
        try {
            locker.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
