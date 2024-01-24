package java8InterviewCoding;

import java.util.ArrayList;
import java.util.List;

public class NumStartingWith1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(101);
        list.add(2);
        list.add(3);
        list.add(34);
        list.add(5);
        list.add(7);
        list.add(754);
        list.add(75);

        System.out.println(numsStartingWithOne(list));
        startingWithOne(list);

        String c = 10 + " ";
        System.out.println(c.getClass());
    }

    public static int numsStartingWithOne(List<Integer> list){
        double count = list.stream().filter(x -> String.valueOf(x).startsWith("1")).count();
        return (int) count;
    }


    //Alternate method
    public static void startingWithOne(List<Integer> list){
        List<String> result = list.stream()
                .map(s -> s + "") // Convert integer to String
                .filter(s -> s.startsWith("1"))
                .toList();
        result.forEach(System.out::println);
    }
}

