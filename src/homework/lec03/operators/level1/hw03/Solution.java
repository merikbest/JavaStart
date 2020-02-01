package homework.lec03.operators.level1.hw03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        System.out.print("Введите год: ");
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int year = Integer.parseInt(reader.readLine());

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("количество дней в году: " + 366);
            } else {
                System.out.println("количество дней в году: " + 365);
            }
        } catch (Exception e) {
            System.out.println("Ошибка! Вы ввели неправильный год.");
        }
    }
}