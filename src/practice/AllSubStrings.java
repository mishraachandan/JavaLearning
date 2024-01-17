package practice;

import java.io.FilterOutputStream;
import java.util.ArrayList;

public class AllSubStrings {
    public static void main(String[] args) {
        String s = "babad";
        ArrayList<String> list = printAllSubStrings("babad");
        System.out.println(list.toString());
//        list.forEach(System.out::println);

//        print();

        StringBuilder result = new StringBuilder("");

        for(String item : list){
            StringBuilder temp = new StringBuilder();
            temp.append(item);
            if(item.contentEquals(temp.reverse()) && temp.length() > result.length()){
                result = temp;
            }
        }

        System.out.println(result);

    }

    public static ArrayList<String> printAllSubStrings(String s){
        ArrayList<String> result = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                result.add(s.substring(i,j+1));
            }
        }

        return result;
    }

    public static void print(){
        for(int i=0; i<5; i++){
            for(int j=i+1; j<5; j++){
                System.out.println(i + " " + j);
            }
        }
    }
}
