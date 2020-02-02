package homework.lec03.operators.level2.hw01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        double r = 4;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите координату точки X: ");
            double xCoord = Double.parseDouble(reader.readLine());

            System.out.println("Введите координату точки Y: ");
            double yCoord = Double.parseDouble(reader.readLine());
            double h = Math.sqrt((xCoord * xCoord) + (yCoord * yCoord));

            System.out.println("Координаты точки X и Y " + (h > r ? "не лежат " : " лежат ") + "внутри круга.");
        } catch (IOException | NumberFormatException e) {
            System.out.println("Ошибка! Введите число.");
        }
    }
}