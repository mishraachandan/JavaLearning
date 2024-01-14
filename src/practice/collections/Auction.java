package practice.collections;

import org.apache.poi.hssf.record.FooterRecord;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class Auction {
    public static void main(String[] args) {
        Footballer messi = new Footballer("messi", "barce", 89229, 36);
        Footballer kaka = new Footballer("kaka", "real madrid",72949 , 41);
        Footballer pepe = new Footballer("pepe", "barce", 89429, 39);
        Footballer ronaldo = new Footballer("ronaldo", "real madrid", 74279, 38);
        Footballer swarez = new Footballer("swarez", "barcelona", 74783, 38);


        List<Footballer> list = new ArrayList<>();
        list.add(messi); list.add(kaka); list.add(pepe); list.add(ronaldo); list.add(swarez);

        // Get the list in the sorted order of there age
        List<Footballer> listByAgeSorted = list.stream().sorted((f1,f2) -> -Integer.compare(f1.getAge(), f2.getAge())).toList();


        // Get the list in the sorted order of there name
        List<Footballer> listByNameSorted = list.stream().sorted((f1,f2) -> -f1.getName().compareTo(f2.getName())).toList();



        // Get List of Footballer who's age is greater than 36 and the sort them in order of their price and print it out
        List<Footballer> listFilterSorted = list.stream().filter(f -> f.getAge() > 36).sorted((f1,f2) -> Integer.compare(f1.getAge(),f2.getAge())).toList();


        // Get count of all the footballer whose name starts with S
        long getCount = list.stream().filter((f1) -> f1.getName().toLowerCase().startsWith("s")).count();
        System.out.println(getCount);


        // Get the average of all the price
        double getAverage = list.stream().mapToDouble(Footballer::getPrice).average().orElse(0);

        System.out.println(getAverage);





    }
}
