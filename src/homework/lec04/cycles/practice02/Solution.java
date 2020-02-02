package homework.lec04.cycles.practice02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Введите чило : ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int num = Integer.parseInt(reader.readLine());

            for (int i = 1; i <= num ; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
