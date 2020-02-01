package homework.lec03.operators.level1.hw01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        int[] numArray = new int[4];
        int maxNum = numArray[0];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 4; i++) {
            try {
                int str = Integer.parseInt(reader.readLine());
                numArray[i] = str;

                if (numArray[i] > maxNum) {
                    maxNum = numArray[i];
                }
            } catch (IOException e) {
                System.out.println("Ошибка! Введите число.");
                i--;
            }
        }
        System.out.println("Максимальное число : " + maxNum);
    }
}