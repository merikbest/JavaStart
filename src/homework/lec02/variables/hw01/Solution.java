package homework.lec02.variables.hw01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        char result [] = number.toCharArray();
        for (char c : result) {
            System.out.println(c);
        }
    }
}