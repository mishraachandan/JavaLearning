package interviewseries;

public class Test {

    static int xx = 10;

    public static void main(String[] args) {
//        System.out.println(foo());
        try{
            throw new IllegalArgumentException();
        }
        catch (Exception e){
            System.out.println("Got exception" + e);
        }
    }

    static int foo(){
        int x = 0;
        return ++x;
    }
}
