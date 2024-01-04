package JavaBasicsInfy.typecasting;

public class ABCBank {
    int phone = 312345;
    double getPhone(){
        System.out.println("phone number received");
        return phone;
    }

    public static void main(String[] args) {
        ABCBank abcBank = new ABCBank();
        System.out.println(abcBank.getPhone());
    }

}


