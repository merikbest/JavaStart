package homework.lec04.cycles.level2.hw03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите нечетное число : ");
            int width = Integer.parseInt(reader.readLine());

            for(int i = width; i >= 1; i--){
                for(int k = width - i; k >= 1; k--){
                    System.out.print(" ");
                }
                for(int j = i; j >= 1; j--){
                    System.out.print("*");
                }
                for(int m = 2; m <= i; m++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for(int a = 2; a <= width; a++) {
                for(int b = width - a; b >= 1; b--){
                    System.out.print(" ");
                }
                for(int c = a; c >= 1; c--) {
                    System.out.print("*");
                }
                for(int d = 2; d <= a; d++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
