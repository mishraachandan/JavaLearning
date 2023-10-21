import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(13);
        integerList.add(14);
        integerList.add(15);
        integerList.add(16);

        // exact numbers that are greater than 13 using streams
        // and store them in a list

        List<Integer> streamIntegerList = integerList.stream().filter(x -> x > 13).toList();
//        streamIntegerList.forEach(System.out::println);

        // trying to filter number on the basis of odd/even after their squares
        List<Integer> oddList = integerList.stream().map(y -> y*y).filter(x-> x%2!=0).toList();
//        oddList.forEach(System.out::println);

        List<Integer> evenList = integerList.stream().map(item -> item*item).filter(item-> item%2==0).toList();
        evenList.forEach(System.out::println);

        System.out.println("After the first one _______________________________");
        List<Integer> evenUsingNormal = new ArrayList<>();
        for (Integer integer : integerList) {
            int m = integer * integer;
            if (m % 2 == 0) {
                evenUsingNormal.add(m);
            }
        }
        evenUsingNormal.forEach(System.out::println);


//        Testing changes for the new branch.

//        How do you get last element of an array?

        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");


        String lastElement = listOfStrings.stream().skip(listOfStrings.size() - 1).findFirst().get();
        System.out.println(lastElement);
    }
}
