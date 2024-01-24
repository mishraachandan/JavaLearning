package practice;

import java.util.ArrayList;

public class UnionOfSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5};

        ArrayList<Integer> result = union(arr1, arr2);
        for(Integer item : result){
            System.out.print(item + " ");
        }
    }

    public static ArrayList<Integer> union(int[] arr1, int[] arr2){
        int i =0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i < arr1.length && j < arr2.length){

            if(arr1[i] <= arr2[j]){
                if((list.isEmpty() || arr1[i] != list.get(list.size()-1))){
                    list.add(arr1[i]);
                }
                i++;
            }
            else{
                if(list.isEmpty() || arr2[j] != list.get(list.size()-1)){
                    list.add(arr2[j]);
                }
                j++;
            }
        }

        while(i < arr1.length){
            if(list.get(list.size()-1) != arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }

        while(j < arr2.length){
            if(list.get(list.size()-1) != arr2[j]){
                list.add(arr2[i]);
            }
            j++;
        }

        return list;
    }
}
