package JavaBasicsInfy.constructor;

//public class bank2 {
//    String bankName, area, phoneNo;
//
//    void bank2(){
//        System.out.println("Inside constructor");
//    }
//    public static void main(String[] args) {
//        bank2 bank = new bank2();
//        System.out.println(bank.bankName);
//    }
//}


public class bank2 {
    String bankName, area, phoneNo;

    // Constructor with the correct name (matching the class name)
    void bank2() {
        System.out.println("Inside constructor");
    }

    public static void main(String[] args) {
        // Corrected object creation with the correct class name
        bank2 bank = new bank2();
        System.out.println(bank.bankName);
    }
}
