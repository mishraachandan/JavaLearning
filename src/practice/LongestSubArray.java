package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSubArray {
    public static void main(String[] args) {
//        int n = 5;
//        int k = 12;
//        int[] arr = {2,6,5,6,11};
//
//
//        System.out.println(twoPairs(arr, k));

        int[] arr = {2,5,4,1,3};
        System.out.println(Arrays.toString(secondMxxAndMinn(arr)));


    }

    public static int[] secondMxxAndMinn(int[] arr){
        int maxx = arr[0];
        int minn = arr[0];

        for(int i: arr){
            if(i > maxx) maxx = i;
            if(i < minn) minn = i;
        }

        int second_maxx = arr[0];
        int second_minn = arr[0];

        System.out.println("Maxx and minn :: " + maxx + " " + minn);

        for(int i: arr){
            if( i != maxx && i != minn){
                if(i > second_maxx) second_maxx = i;
                if(i < second_minn) second_minn = i;
            }
        }

        return new int[] {second_maxx, second_minn};
    }

    public static int func(int[] arr, int k){
        int j = 1;
        int ans = 0;
        int result = -1;
        for(int i=0; i<arr.length;i++){
            while(i<arr.length && j<arr.length){
                ans = ans + arr[i]+arr[j];
                if(ans == k && (j-i >= result)){
                    result = j-i;
                    i++;
                }
                if(arr[i] + arr[j] > k && i  < arr.length &&  j < arr.length) {
                    i++;
                }
                if(arr[i] + arr[j] < k && i < arr.length &&  j < arr.length){
                    j++;
                }
            }
        }
        return ans;
    }

    public static String twoPairs(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i: arr){
            if(!map.containsValue(i)){
                map.put(i, target - i);
            }
        }

        System.out.println(map);

        for(int i: arr){
            if(map.containsValue(i) && map.get(i) != i){
                return "YES";
            }
        }

        return "NO";
    }

//    public static int subArrayLongest(int[] arr, int target){
//        int i=0;
//        int maxx = 0;
//        while(i < arr.length){
//            int sum = 0;
//            int count = 0;
//            if(arr[i] == target){
//                count += 1;
//                if(count > maxx){
//                    maxx = count;
//                }
//                i++;
//            }
//            int j = i+1;
//            while(i<arr.length && j < arr.length && sum < target){
//                if(sum == target){
//                    if(count > maxx){
//                        maxx = count;
//                    }
//                    i++;
//                    j++;
//                } else if () {
//
//                }
//            }
//
//
//
//
//
//
//        }
//    }

}
