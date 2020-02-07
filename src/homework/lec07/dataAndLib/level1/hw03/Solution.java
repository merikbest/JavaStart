package homework.lec07.dataAndLib.level1.hw03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите чило в бинарном формате (например: 0101) :");
            String str = reader.readLine();

            System.out.println(toDecimal(str));
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    static int toDecimal(String text) {
        return Integer.parseInt(text, 2);
    }
}
