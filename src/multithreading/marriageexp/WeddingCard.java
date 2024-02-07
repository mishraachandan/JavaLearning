package multithreading.marriageexp;

import java.util.List;

public class WeddingCard implements Runnable{

//    private static Venue v;
//    private static Distribution d;

    @Override
    public void run(){
//        System.out.println("Below is the details for the Weddings: ");
//
//        System.out.println("Planned Venues to be picked from::");
////        Venue v = new Venue();
//        List<String> venuesList =  v.getVenue();
//
//        venuesList.forEach(x -> System.out.print(x + " "));
//
////        Distribution d = new Distribution();
//
//        System.out.println("And Total guests:: "+ d.getTotalPersons());

        Venue venue = new Venue();
        Thread t1 = new Thread(venue);

        Distribution distribution = new Distribution();
        Thread t2 = new Thread(distribution);

        t1.start();
        try {t1.join();} catch (InterruptedException e) {e.printStackTrace();}

        t2.start();
        try {t2.join();} catch (InterruptedException e) {e.printStackTrace();}


        System.out.println("Planned Venue that you have picked::" + venue.getPickedVenue() + " ");

        System.out.println("And Total guests:: " + distribution.getTotalPersons());

    }
}

