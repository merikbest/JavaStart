package homework.lec03.operators.level1.hw01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionTwo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 4; i++) {
            try {
                list.add(Integer.parseInt(reader.readLine()));
            } catch (IOException | NumberFormatException e) {
                System.out.println("Ошибка! Введите целое число.");
                i--;
            }
        }
        System.out.println("Максимальное число : " + Collections.max(list));
    }
}