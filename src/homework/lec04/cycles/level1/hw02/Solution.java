package homework.lec04.cycles.level1.hw02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Введите чило в диапазоне от 4 до 16: ");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            long number = Integer.parseInt(reader.readLine());
            long result = 1;

            if (4 < number && number < 16) {
                for (long i = number; i >= 1; i--) {
                    result = result * i;
                }
                System.out.println(result);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
