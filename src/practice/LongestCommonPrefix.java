package practice;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"abcd", "abc", "abref", "abcde"};
        System.out.println(commonPrefix(arr, 4));
    }

    public static String commonPrefix(String []arr,int n){
        //Write your code here

        if(arr.length == 1){
            return arr[0];
        }

        String prefix = arr[0];
        int count = 0;

        for(int i =1; i<arr.length; i++){
            int current_count = 0;
            int temp = 0;
//            while(temp < Math.min(prefix.length(), arr[i].length())){
                while(temp < (Math.min(prefix.length(), arr[i].length())) && prefix.charAt(temp) == arr[i].charAt(temp)){
                    current_count+=1;
                    temp++;
                }

                if(current_count > count){
                    count = current_count;
                }
//            }
        }

        return arr[0].substring(0, count+1);





    }
}
