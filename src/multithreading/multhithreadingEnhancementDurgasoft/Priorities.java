package multithreading.multhithreadingEnhancementDurgasoft;

public class Priorities {
    public static void main(String[] args) {
        ThreadGroup g1 = new ThreadGroup("DummyGroup");
        Thread t1 = new Thread(g1, "t1");
        Thread t2 = new Thread(g1, "t2");


        g1.setMaxPriority(7);
        Thread t3 = new Thread(g1, "t3");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        g1.list();

    }

}
