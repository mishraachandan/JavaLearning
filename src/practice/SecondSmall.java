package practice;

public class SecondSmall {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1};  // op>>> 1, 3
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < small){
                second_small = small;
                small = arr[i];

            }
            if(arr[i] < second_small && arr[i] != small){
                second_small = arr[i];
            }
        }

        System.out.println(small);
        System.out.println(second_small);


        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > large){
                second_large = large;
                large = arr[i];

            }
            if(arr[i] > second_large && arr[i] != large){
                second_large = arr[i];
            }
        }

        System.out.println(large);
        System.out.println(second_large);
    }
}
