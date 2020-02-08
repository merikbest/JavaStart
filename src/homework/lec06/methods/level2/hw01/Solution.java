package homework.lec06.methods.level2.hw01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите последовательность чисел (минимум 4 числа) через пробел: ");
            String[] parts = reader.readLine().split(" ");
            int[] n1 = new int[parts.length];

            for (int n = 0; n < parts.length; n++) {
                n1[n] = Integer.parseInt(parts[n]);
            }
            System.out.println(getNumber(n1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getNumber(int[] array) {
        if (formula1(array) != 0) {
            return formula1(array);
        } else if (formula2(array) != 0) {
            return formula2(array);
        } else if (formula3(array) != 0) {
            return formula3(array);
        } else if (formula4(array) != 0) {
            return formula4(array);
        } else {
            return 0;
        }
    }

    public static int formula1(int[] array) {
        boolean fail = false;
        int number = array[1] - array[0];

        for (int i = 0; i < array.length; i++) {
            if (number * ((i + 1) - 1) != array[i]) {
                fail = true;
            }
        }

        if (fail) {
            return 0;
        } else {
            return number * (array.length);
        }
    }

    public static int formula2(int[] array) {
        boolean fail = false;
        int number = array[1] - array[0];

        for (int i = 0; i < array.length; i++) {
            if (number * (i + 1) - 2 != array[i]) {
                fail = true;
            }
        }

        if (fail) {
            return 0;
        } else {
            return number * (array.length) + 1;
        }
    }

    public static int formula3(int[] array) {
        boolean fail = false;
        int number = array[1];

        for (int i = 0; i < array.length; i++) {
            if (Math.pow(number, i) != array[i]) {
                fail = true;
            }
        }

        if (fail) {
            return 0;
        } else {
            return (int) Math.pow(number, array.length);
        }
    }

    public static int formula4(int[] array) {
        boolean fail = false;
        int number = 0;

        for (int i = 0; i < array.length - 2; i++) {
            if (Math.pow(i + 2, i + 2) == array[i + 1] && Math.pow(i + 3, i + 2) == array[i + 2]) {
                number = i + 2;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (Math.pow(i + 1, number) != array[i]) {
                fail = true;
            }
        }

        if (fail) {
            return 0;
        } else {
            return (int) Math.pow(array.length + 1, number);
        }
    }
}
