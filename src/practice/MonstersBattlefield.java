package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MonstersBattlefield {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input the number of test cases
        int t = Integer.parseInt(br.readLine());
        for (int testCase = 0; testCase < t; testCase++) {
            // Input the number of monsters for each test case
            int n = Integer.parseInt(br.readLine());

            // Input the strengths of monsters for each test case
            int[] strengths = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                strengths[i] = Integer.parseInt(st.nextToken());
            }

            // Process the test case
            int[] monstersAlive = new int[n];
            for (int minute = 0; minute < n; minute++) {
                int monstersKilled = 0;
                for (int i = 0; i <= minute; i++) {
                    if (strengths[i] >= minute) {
                        monstersKilled++;
                    }
                }
                monstersAlive[minute] = n - monstersKilled;
            }

            // Print the result for the test case
            System.out.println(Arrays.toString(monstersAlive));
        }

        // Close the BufferedReader
        br.close();
    }
}
