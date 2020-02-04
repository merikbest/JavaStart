package homework.lec05.arrays.level1.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        int count = 0;

        System.out.println("Введите строку текста: ");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            char[] chars = reader.readLine().toCharArray();

            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == 'b'){
                    count++;
                }
            }
            System.out.println("Количество символов b: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}