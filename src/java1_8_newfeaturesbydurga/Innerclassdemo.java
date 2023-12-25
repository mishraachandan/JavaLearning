package java1_8_newfeaturesbydurga;

// interface >> run, start public void run(); public String start(){}

public class Innerclassdemo implements Runnable {
    @Override
    public void run() {
        System.out.println("This is a demo method.");
    }
}

class Demostration{
    public static void main(String[] args){
        Innerclassdemo innerclassdemo = new Innerclassdemo();

        Thread t = new Thread(innerclassdemo);

        t.start();

    }
}
