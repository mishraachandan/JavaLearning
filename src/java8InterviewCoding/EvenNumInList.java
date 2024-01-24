package java8InterviewCoding;

import java.util.ArrayList;
import java.util.List;

public class EvenNumInList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(34);
        list.add(5);
        list.add(7);
        list.add(754);
        list.add(75);

        List<Integer> result = evenNumberFromList(list);
        result.forEach(System.out::println);
    }

    //Given a list of integers, find out all the even numbers that exist in the list using Stream functions
    public static List<Integer> evenNumberFromList(List<Integer> list){
        double countOfEven = list.stream().filter(x -> x%2==0).count();
        System.out.println((int)countOfEven);
        return list.stream().filter(x -> x % 2 == 0).toList();
    }
}
