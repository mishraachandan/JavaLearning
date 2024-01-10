package practice;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
