package java8InterviewCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class TotalElementPresent {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println((totalElementsInList(myList)));
        System.out.println((maxValueInList(myList)));


    }

    public static int totalElementsInList(List<Integer> list){
        double count = list.stream().count();
        return (int)count;
    }


    public static int maxValueInList(List<Integer> list){
        return list.stream().max(Integer::compare).orElse(0);
    }


}
