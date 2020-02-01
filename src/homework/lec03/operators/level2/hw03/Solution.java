package homework.lec03.operators.level2.hw03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        int[] luck = new int[4];

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите четырехзначное число: ");
            char[] chars = reader.readLine().toCharArray();

            if (chars.length != 4) {
                System.out.println("Ошибка! Введите четырехзначное число");
            } else {
                for (int i = 0; i < chars.length; i++) {
                    luck[i] = Integer.parseInt(String.valueOf(chars[i]));
                }
                boolean luckyTicket = luck[0] + luck[1] == luck[2] + luck[3];

                System.out.println("Число " + String.valueOf(chars) +
                        (luckyTicket ? " является " : " не является ") + "счастливым билетом.");
            }
        } catch (Exception e) {
            System.out.println("Ошибка! Введите число.");
        }
    }
}
