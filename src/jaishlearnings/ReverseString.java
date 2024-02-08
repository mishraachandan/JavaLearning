package jaishlearnings;

public class ReverseString {
    public static void main(String[] args) {
        String input = "ZanduChavanprash";

        // reverse using stringbuilder
        StringBuilder sb = new StringBuilder("");
        for (int i=input.length()-1; i>0; i--){
            sb.append(input.charAt(i)+"");
        }

        System.out.println(sb);

        // using pointers
        int low = 0;
        int high = input.length() -1;

        StringBuilder sb2 = new StringBuilder("");
        char[] chars = input.toCharArray();
        for(int i=chars.length-1; i>0; i--){
            sb2.append(chars[i]);
        }
        System.out.println(sb2.toString());
    }
}
