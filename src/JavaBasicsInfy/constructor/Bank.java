package JavaBasicsInfy.constructor;

public class Bank {

    String bankname, area, phoneNo;

    void Bank(){
        System.out.println("banking application");
    }
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println(bank.bankname);
    }
}
