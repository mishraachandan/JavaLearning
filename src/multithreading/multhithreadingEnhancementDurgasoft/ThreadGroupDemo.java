package multithreading.multhithreadingEnhancementDurgasoft;

public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup t = new ThreadGroup("DummyGroup");
        System.out.println(t.getParent().getName());
    }
}
