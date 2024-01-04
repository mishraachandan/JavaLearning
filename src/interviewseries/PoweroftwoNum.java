package interviewseries;

public class PoweroftwoNum {
    public static void main(String[] args) {
        int a , b;
        a = 2;
        b = 3;

        // ans >> 27
        System.out.println(power(a,b));
    }
    
    public static int power(int a, int b){

        if ( b == 1){
            return 1;
        }
        int result = a;
        
        for(int i=0; i<b-1; i++){
            result = result * a;
        }
        
        return result;
        
    }
}
