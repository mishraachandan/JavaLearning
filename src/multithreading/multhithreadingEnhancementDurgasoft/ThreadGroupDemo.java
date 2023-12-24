package multithreading.multhithreadingEnhancementDurgasoft;

public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup t = new ThreadGroup("DummyGroup");
        System.out.println(t.getParent().getName());

        ThreadGroup g1 = new ThreadGroup(t, "Sub-ThreadGroup");
        System.out.println(g1.getParent().getName());  // output >> DummyGroup.

    }
}
