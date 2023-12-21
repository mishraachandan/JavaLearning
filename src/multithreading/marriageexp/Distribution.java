package multithreading.marriageexp;

import java.util.Scanner;

public class Distribution implements Runnable{

    private int totalPersons;

    public void setTotalPersons(int totalPersons) {
        this.totalPersons = totalPersons;
    }

    @Override
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of guests:: ");
        totalPersons = sc.nextInt();
    }

    public int getTotalPersons(){
        return totalPersons;
    }
}
