package homework.lec03.operators.level2.hw02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        int xA = 0;
        int yA = 0;
        int xB = 4;
        int yB = 4;
        int xC = 6;
        int yC = 1;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите координату точки X: ");
            int xCoord = Integer.parseInt(reader.readLine());

            System.out.println("Введите координату точки Y: ");
            int yCoord = Integer.parseInt(reader.readLine());

            int a = (xA - xCoord) * (yB - yA) - (xB - xA) * (yA - yCoord);
            int b = (xB - xCoord) * (yC - yB) - (xC - xB) * (yB - yCoord);
            int c = (xC - xCoord) * (yA - yC) - (xA - xC) * (yC - yCoord);

            if ((a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0)) {
                System.out.println("Принадлежит треугольнику");
            } else {
                System.out.println("Не принадлежит треугольнику");
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Ошибка! Введите число.");
        }
    }
}