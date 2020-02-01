package homework.lec03.operators.level1.hw01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SolutionTwo {
    public static void main(String[] args) {
        int[] numArray = new int[4];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 4; i++) {
            try {
                int str = Integer.parseInt(reader.readLine());
                numArray[i] = str;
            } catch (IOException e) {
                System.out.println("Ошибка! Введите число.");
                i--;
            }
        }
        Arrays.sort(numArray);
        System.out.println("Максимальное число : " + numArray[numArray.length-1]);
    }
}