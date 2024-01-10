package multithreading;

public class myThread extends Thread{

    private String t = "true";
    @Override
    public void run(){
//        String threadname = Thread.currentThread().getName().toString();
//        if(!threadname.equals("Child Thread")){
//            t = "False";
//        }
////        System.out.println("I am in the Child Thread: "+ t);
//        System.out.println("I am in the Child Thread: "+ threadname);

//        try{
//            Thread.sleep(2000);
//        }
//        catch (InterruptedException e){
//            System.out.println("Exception occurred.");
//        }
//        System.out.println("Overriding the run method.");

        for(int i=0; i<10; i++){
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}

class myThreadDemo{
    public static void main(String[] args) throws InterruptedException {

//        Thread.currentThread().setName("My Main thread");
//        System.out.println("Execution of thread:: "+ Thread.currentThread().getName());
        myThread t1 = new myThread();
        t1.setName("Thread t1");
        t1.start();

        for(int i=0; i<10; i++){
            System.out.println("Main Thread");
        }
//        myThread t2 = new myThread();
//        t2.setName("Thread t2");
//        t2.start();
//        t2.join();
//        t1.start();
//        t1.join();
//
//
//
//        System.out.println("Current Thread: "+ Thread.currentThread().getName());



    }
}