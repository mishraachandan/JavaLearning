package multithreading.marriageexp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Venue implements Runnable{

    private List<String> venueChoices = new ArrayList<>();
    private StringBuilder pickedVenue = new StringBuilder("");
    String name = "jaish";

    // name >> jaish

    // name >> jaish mishra

    // name >> ""

    // name.append("jaish mishra")


    public Venue() {
        // Initialize the venueChoices list in the constructor
        venueChoices.add("India");  //india // inDIa
        venueChoices.add("Canada");
        venueChoices.add("Australia");
        venueChoices.add("Russia");
        name = name + "mishra";
    }

    @Override
    public void run() {
//        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the venue:: ");
//        String pickFromVenue = sc.nextLine();
        String pickFromVenue = "Ukraine";

        if(!pickFromVenue.isEmpty()){
            for(String venues : venueChoices){
                if(pickFromVenue.toLowerCase().contentEquals(venues.toLowerCase())){
                    pickedVenue.append(venues);
                    System.out.println("Okay Got it, We have locked the "+venues+" for your wedding congratulations.");
                    return;
                }
            }
            System.out.println("Sorry, You have not entered any venue that is not available in our list.");
        }
        else{
            System.out.println("your venue is empty.");
        }


    }

    public List<String> getVenue() {
        return venueChoices;
    }

    public String getPickedVenue(){
        return pickedVenue.toString();
    }
}
