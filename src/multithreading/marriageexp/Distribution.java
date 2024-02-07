package multithreading.marriageexp;

import java.util.Scanner;

public class Distribution implements Runnable{

    // field with variable name > totalPerson
    private int totalPersons;

    public void setTotalPersons(int totalPersons) {
        this.totalPersons = totalPersons;
    }

    @Override
    public void run(){
//        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of guests:: ");
//        totalPersons = sc.nextInt();
        totalPersons = 1000;
    }

    public int getTotalPersons(){
        return totalPersons;
    }
}
