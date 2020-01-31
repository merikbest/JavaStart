package homework.lec02.variables.hw01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String number = reader.readLine();

            if (number.length() != 5) {
                System.out.println("Введите 5-ти значное число");
            } else {
                char result [] = number.toCharArray();

                for (char c : result) {
                    System.out.println(c);
                }
                break;
            }
        }
    }
}