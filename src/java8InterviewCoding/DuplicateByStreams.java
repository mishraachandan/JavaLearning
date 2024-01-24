package java8InterviewCoding;

import java.util.*;

public class DuplicateByStreams {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        duplicateFinder(myList);
    }

    public static void duplicateFinder(List<Integer> list){
        Set<Integer> set = new HashSet<>();
//        list.stream().filter(x -> !set.add(x)).forEach(System.out::println);
        list.stream().filter(x -> !set.add(x)).map(x -> x*2).forEach(System.out::println);

        System.out.println(list.toString());

    }
}
