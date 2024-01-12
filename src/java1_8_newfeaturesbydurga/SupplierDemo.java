package java1_8_newfeaturesbydurga;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        // Using supplier to get random otp.

        Supplier<String> s = () -> {
            StringBuilder otp = new StringBuilder();
            for(int i=0 ;i<6; i++){
                otp.append((int) (Math.random() * 10));
            }
            return otp.toString();
        };
        System.out.println(s.get());
    }
}
