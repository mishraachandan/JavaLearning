package ioOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        try {
            // File ka path specify karo
            String filePath = "D:\\day1.txt";

            // FileReader aur BufferedReader ka use karo file ko read karne ke liye
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            // Har line ko padh kar print karo
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // File close karo
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
