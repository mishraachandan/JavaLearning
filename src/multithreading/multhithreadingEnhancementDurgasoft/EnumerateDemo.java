package multithreading.multhithreadingEnhancementDurgasoft;

public class EnumerateDemo {
    public static void main(String[] args) {
        ThreadGroup parentGroup = Thread.currentThread().getThreadGroup().getParent();
        System.out.println(parentGroup.activeGroupCount());
        Thread[] t = new Thread[parentGroup.activeCount()];  // Initializing

        parentGroup.enumerate(t);

        for(Thread t1 : t){
            System.out.println(t1.getName() + "    " + t1.isDaemon());
        }

    }
}
