package java8InterviewCoding;

import java.util.Map;
import java.util.TreeMap;

public class TreeTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(19,"chandan");
        map.put(8,"jaish");
        map.put(67,"ujjwal");
        map.put(6,"danish");
        map.put(78,"pavan");

        map.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
