package practice;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        int n = 7;
        System.out.println(a);
        System.out.println(b);
        for(int i=0; i<n-2; i++){
            int next_element = a + b;
            System.out.println(next_element);
            a = b;
            b = next_element;
        }

        System.out.println(func(10));
    }

    public static int func(int n){
        if(n <= 1){
            return n;
        }
        return func(n-1) + func(n -2);
    }
}
