package multithreading.marriageexp;

import java.util.ArrayList;
import java.util.List;

public class Venue implements Runnable{

    List<String> venue = new ArrayList<>();

    public List<String> getVenue() {
        return venue;
    }

    public void setVenue(List<String> venue) {
        this.venue = venue;
    }

    @Override
    public void run(){
        venue.add("India");
        venue.add("Canada");
        venue.add("Australia");
    }

}
