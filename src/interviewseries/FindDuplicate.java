package interviewseries;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {

        // find duplicate using stream
        int[] arr = {1, 2, 1, 2, 3, 4, 4, 5, 6, 7, 7, 8, 8};

        // Using Java streams to find duplicates
        Map<Integer, Long> frequencyMap = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        System.out.println(frequencyMap.toString());
        List<Integer> duplicates = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println("Duplicates: " + duplicates);

        Set<Integer> set = new HashSet<>();
        for(int item : arr){ set.add(item); }

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 1, 2, 3, 4, 4, 5, 6, 7, 7, 8, 8);

        List<Integer> duplicate = list.stream().filter(i -> !set.add(i)).toList();

        System.out.println(duplicate.toString());




    }
}
