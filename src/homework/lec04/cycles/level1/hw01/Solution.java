package homework.lec04.cycles.level1.hw01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Введите чило : ");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int number = Integer.parseInt(reader.readLine());

            for (int i = 1; i <= 5 ; i++) {
                for (int j = 1; j <= number; j++) {
                    if (j % 2 == 0) {
                        System.out.print("***");
                    } else {
                        System.out.print("+++");
                    }
                }
                System.out.println();
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}