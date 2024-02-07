package multithreading.marriageexp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class WeedingResult{
    public static void main(String[] args) throws InterruptedException{

//        Venue venue = new Venue();
//        Thread t1 = new Thread(venue);
//
//        Distribution distribution = new Distribution();
//        Thread t2 = new Thread(distribution);
//
//        t1.start();
//        t1.join();
//
//        t2.start();
//        t2.join();
//
//
//        WeddingCard weddingCard = new WeddingCard();
//        Thread t3 = new Thread(weddingCard);
//
//        t3.start();
//        t3.join();
//
//        System.out.println("--------------End of main Thread.--------------------");

//        WeddingCard weddingCard = new WeddingCard();
//        Thread t3 = new Thread(weddingCard);
//
//        t3.start();
//        t3.join();

//        System.out.println("--------------End of main Thread.--------------------");

        List<String> venueList = new ArrayList<>();
        venueList.add("India");  //india // inDIa
        venueList.add("Canada");
        venueList.add("Australia");
        venueList.add("Russia");
        venueList.add("Jaish");



            Collections.sort(venueList);

        boolean flag = false;
        for (String venueItem : venueList){
            if(venueItem.toLowerCase().contentEquals("JAISH".toLowerCase())){
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("Hurray we found match!!");
        }
        else{
            System.out.println("Not Found");
        }







    }
}
