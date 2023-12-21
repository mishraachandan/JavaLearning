package multithreading.multhithreadingEnhancementDurgasoft;

public class Test {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
    }


//    >> main method called by >> main thread >> which belongs to main thread group
}
