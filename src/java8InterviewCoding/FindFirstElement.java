package java8InterviewCoding;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println(getFirstElement(myList));
    }

    public static int getFirstElement(List<Integer> list){
//        list.stream().findFirst().ifPresent(x -> System.out.println(x));
        Integer x = list.stream().findFirst().orElse(0);
        return (int) x;

    }

}
