package multithreading.multhithreadingEnhancementDurgasoft;

public class ThreadActiveDemo extends Thread{

    ThreadActiveDemo(ThreadGroup g, String name){
        super(g, name);
    }

    @Override
    public void run(){
        System.out.println("Child Thread");
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}

class ThreadActiveResult{
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup parentGroup = new ThreadGroup("ParentGroup");
        ThreadGroup childGroup = new ThreadGroup(parentGroup, "ChildGroup");
        ThreadActiveDemo t1 = new ThreadActiveDemo(parentGroup, "ChildThread1");
        ThreadActiveDemo t2 = new ThreadActiveDemo(parentGroup, "ChildThread2");
        t1.start();
        t2.start();

        System.out.println(parentGroup.activeCount());
        System.out.println(parentGroup.activeGroupCount());

        parentGroup.list();

        Thread.sleep(10000);

        System.out.println(parentGroup.activeCount());  // 0 as all the active threads will finish its execution.
        System.out.println(parentGroup.activeGroupCount());  // 1 as subgroup will be there.
        parentGroup.list();
    }
}