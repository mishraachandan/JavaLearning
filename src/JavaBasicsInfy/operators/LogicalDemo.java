package JavaBasicsInfy.operators;

public class LogicalDemo
{
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        System.out.println(!(x && y));  // true
        System.out.println(x && y); // false
        System.out.println(x || y); // true
    }
}
