package homework.lec05.arrays.level1.hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            try {
                int arrayLenght = Integer.parseInt(reader.readLine());
                int[] numArray = new int[arrayLenght];

                System.out.println("Заполните массив целых чисел: ");
                for (int i = 0; i < numArray.length; i++) {
                    numArray[i] = Integer.parseInt(reader.readLine());
                }
                System.out.println(Arrays.toString(numArray));
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите целое число.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
