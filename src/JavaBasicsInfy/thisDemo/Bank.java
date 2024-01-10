package JavaBasicsInfy.thisDemo;

public class Bank {
    String bankName, area, phoneNo;

    public Bank(String bankName, String area, String phoneNo){
        bankName = bankName;
        this.area = area;
    }

    public static void main(String[] args) {
        Bank bank2 = new Bank("abc", "xyz", "pqr");
        System.out.println(bank2.bankName);
        System.out.println(bank2.area);
    }
}
