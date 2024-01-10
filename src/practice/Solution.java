package practice;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);


        removeDuplicateBySet(list);

        int arr[] = {1,1,2,2,2,3,3};
        int k = removeDuplicatesStriver(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int removeDuplicates(ArrayList<Integer> arr, int n) {
        // Write your code here.

        int count = 0;

        if(arr.size() == 1 || arr.isEmpty()){
            return arr.size();
        }

        ;
        for(int i=1; i<arr.size()-1; i++){
            if(arr.get(i) != arr.get(i+1)){
                count++;
                while(i < arr.size()-1 && arr.get(i) == arr.get(i+1)){
                    i++;
                }
            }
            else{
                count++;
            }
        }

        return count;
    }

    static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    static void removeDuplicateBySet(ArrayList<Integer> list){
        HashSet<Integer> set = new HashSet<>();
        for(Integer item : list){
            System.out.println(item);
            set.add(item);
        }
        System.out.println(set.toString());
    }

    static int removeDuplicatesStriver(int[] arr) {
        HashSet < Integer > set = new HashSet < > ();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x: set) {
            System.out.println(x);
            arr[j++] = x;
        }
        return k;
    }
}