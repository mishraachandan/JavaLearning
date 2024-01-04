package interviewseries;

import java.util.*;
import java.util.stream.Collectors;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String msg = "aaajsjfsjaihaghajhgahahhgaeieytthsisisismsgwhereIamteringhtogethtefrequencyofcharacterz";

        //using streams

        String[] splitmsg =  msg.split("");

        Map<String, Long> map = Arrays.stream(splitmsg).collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        System.out.println(map.toString());

        HashMap<Character, Integer> mapresult = new HashMap<>();

        for(int i=0; i<msg.length(); i++){
            if(mapresult.containsKey(msg.charAt(i))){
                mapresult.put(msg.charAt(i), mapresult.get(msg.charAt(i))+1);
            }
            else{
                mapresult.put(msg.charAt(i), 1);
            }
        }

        System.out.println(mapresult.toString());
    }
}
