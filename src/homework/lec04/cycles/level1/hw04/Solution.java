package homework.lec04.cycles.level1.hw04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Высота прямоугольника : ");
            int height = Integer.parseInt(reader.readLine());

            System.out.println("Шырина прямоугольника : ");
            int width = Integer.parseInt(reader.readLine());

            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= width; j++) {
                    if (i == 1 || i == height) {
                        System.out.print("*");
                    } else if (j == 1 || j == width) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}