package homework.lec02.variables.hw03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.print("Радиус = ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double radius = Double.parseDouble(reader.readLine());
        double perimeter = 2.0 * Math.PI * radius;
        System.out.println("Длина окружности (периметр круга) с радиусом " + radius + " равна " + perimeter);
    }
}