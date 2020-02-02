package homework.lec03.operators.level1.hw04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите сторону А: ");
            double aSide = Double.parseDouble(reader.readLine());

            System.out.println("Введите сторону B: ");
            double bSide = Double.parseDouble(reader.readLine());

            System.out.println("Введите сторону C: ");
            double cSide = Double.parseDouble(reader.readLine());

            boolean triangle = (aSide + bSide) > cSide && (aSide + cSide) > bSide && (bSide + cSide) > aSide;

            System.out.println("Треугольник " + (triangle ? "существует." : "не существует."));
        } catch (IOException | NumberFormatException e) {
            System.out.println("Ошибка! Введите число.");
        }
    }
}
