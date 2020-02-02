package homework.lec04.cycles.pracrice01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Введите чило : ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int num = Integer.parseInt(reader.readLine());

            for (int i = 1; i <= 100; i++) {
                if (i%num == 0){
                    System.out.print("* ");
                } else {
                    System.out.print(i + " ");
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}