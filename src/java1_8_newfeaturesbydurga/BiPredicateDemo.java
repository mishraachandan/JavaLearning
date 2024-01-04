package java1_8_newfeaturesbydurga;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> p1 = (a,b) -> (a*b) % 2  == 0;
        System.out.println(p1.test(10,7));
    }
}
