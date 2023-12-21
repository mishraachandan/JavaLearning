package multithreading.marriageexp;

import java.util.List;

public class WeddingCard implements Runnable{

    private static Venue v;
    private static Distribution d;

    @Override
    public void run(){
        System.out.println("Below is the details for the Weddings: ");

        System.out.println("Planned Venues to be picked from::");
//        Venue v = new Venue();
        List<String> venuesList =  v.getVenue();

        venuesList.forEach(x -> System.out.print(x + " "));

//        Distribution d = new Distribution();

        System.out.println("And Total guests:: "+ d.getTotalPersons());

    }
}

class WeedingResult{
    public static void main(String[] args) throws InterruptedException{

        Venue venue = new Venue();
        Thread t1 = new Thread(venue);

        Distribution distribution = new Distribution();
        Thread t2 = new Thread(distribution);

        t1.start();
        t1.join();

        t2.start();
        t2.join();


        WeddingCard weddingCard = new WeddingCard();
        Thread t3 = new Thread(weddingCard);

        t3.start();
        t3.join();

        System.out.println("--------------End of main Thread.--------------------");


    }
}
