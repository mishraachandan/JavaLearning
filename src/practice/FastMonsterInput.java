package practice;

import org.apache.poi.ss.formula.functions.T;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FastMonsterInput {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        // Input the number of test cases
//        int t = Integer.parseInt(br.readLine());
//        for (int testCase = 0; testCase < t; testCase++) {
//            // Input the number of monsters for each test case
//            int n = Integer.parseInt(br.readLine());
//
//            // Input the strengths of monsters for each test case
//            int[] strengths = new int[n];
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for (int i = 0; i < n; i++) {
//                strengths[i] = Integer.parseInt(st.nextToken());
//            }
//
//            // Process the test case (you can add your logic here)
//
//            // Print or use the strengths array as needed
//            System.out.println("Test Case " + (testCase + 1) + ":");
//            for (int strength : strengths) {
//                System.out.print(strength + " ");
//            }
//            System.out.println();
//        }
//
//        // Close the BufferedReader
//        br.close();

        int[] numbers = {3, 0, 3, 4, 1};

        List<Integer> result = result(numbers);
        System.out.println(result.toString());
    }


//    3 0 3 4 1
    public static List<Integer> result(int[] strength){
        List<Integer> initial = new ArrayList<>();
        List<Integer> removed = new ArrayList<>();
        for (int j : strength) {
            int count = 0;
            if (initial.isEmpty()) {
                initial.add(j);
                count++;
            } else {
                initial.add(j);
                for (Integer item : initial) {
                    if (j >= item) {
                        initial.remove(item);
                        count++;
                    }

                    if (initial.isEmpty()) {
                        initial.add(j);
                        count = count - 1;
                    }
                }
            }
            removed.add(count);
        }

        return removed;
    }
}
