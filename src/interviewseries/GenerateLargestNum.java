package interviewseries;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GenerateLargestNum {
    public static void main(String[] args) {
        int arr[] = {8,6,0,4,6,2,4,2,7};

//        Map<Integer, Integer> map = new HashMap<>();
//
//        StringBuilder result = new StringBuilder();
//
//        for(Integer i : arr){
//
//        }

//        System.out.println(Arrays.stream(arr).sorted().forEach(i -> System.out.print(i + " ")));

        Arrays.sort(arr);

        for(int i=arr.length-1; i>=0; i--){
            System.out.print(String.valueOf(arr[i])+"");
        }

    }


}
