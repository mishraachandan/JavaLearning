package practice;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7,5,9,2,8};

        for(int i=0; i<arr.length; i++){
            int min = arr[i];
            int index_min = i;
            for(int j=i; j< arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    index_min = j;
                }
            }
            int temp = arr[index_min];
            arr[index_min] = arr[i];
            arr[i] = temp;
        }

        for (int i : arr){
            System.out.print(i+" ");
        }

    }
}
