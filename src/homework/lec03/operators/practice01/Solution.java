package homework.lec03.operators.practice01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] num = new int[3];
        int max = num[0];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < num.length; i++) {
            int str = Integer.parseInt(reader.readLine());
            num[i] = str;

            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("Max number is " + max);
    }
}