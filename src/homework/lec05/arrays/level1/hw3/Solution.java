package homework.lec05.arrays.level1.hw3;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] ints1 = new int[15];

        for (int i = 0; i < ints1.length; i++) {
            ints1[i] = (int) (Math.random() * 15);
        }
        System.out.println(Arrays.toString(ints1));

        int[] ints2 = Arrays.copyOf(ints1, 30);

        for (int i = 0; i < 15; i++) {
            ints2[i + 15] = ints2[i] * 2;
        }
        System.out.println(Arrays.toString(ints2));
    }
}