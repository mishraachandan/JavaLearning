//package multithreading;
//
//import java.util.List;
//
//public class PrintEvenOdd implements Runnable{
//
//    private List<Integer> list;
//
//    @Override
//    public void run(){
//
//        // print from 1 ro 20
//
//        for(int i=1; i<=20; i++){
//            list.add(i);
//            System.out.print(i + " ");
//        }
//
//    }
//
//
//    public int run(int i){
//        for(Integer item : list){
//            if(i == item){
//                return 1;
//            }
//        }
//
//        return -1;
//    }
//}
//
//class mythreadOddEven {
//    public static void main(String[] args) {
//        PrintEvenOdd r = new PrintEvenOdd();
//
//        Thread t1 = new Thread(r);
//        t1.run();
//
//        Thread t2 = new Thread(r);
//        int result = t2.run(4);
//
//    }
//}
