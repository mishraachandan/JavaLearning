package JavaBasicsInfy.conditionalstatement;

public class IfElseCheck {
    public static void main(String[] args) {
        String username = "john";
        String password = "infy123";

        if(username.equals("john") && password.equals("infy123")){
            System.out.println("Welcome");
        }
        else{
            System.out.println("sorry");
        }

        String s = username.equals("john") && password.equals("infy123") ? "Welcome" : "Sorry";
        System.out.println(s);
    }
}
