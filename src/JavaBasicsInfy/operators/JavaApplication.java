package JavaBasicsInfy.operators;

public class JavaApplication {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = d ? b : c;
        System.out.println(d + " " + e);
    }
}
