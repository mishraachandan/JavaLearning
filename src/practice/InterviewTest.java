package practice;

public class InterviewTest {

    private static int num = 1;
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("This is the method under the runnable I have written.");
        };

        Thread t1 = new Thread(r);
        t1.start();
    }
}
