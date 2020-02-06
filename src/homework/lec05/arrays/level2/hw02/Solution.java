package homework.lec05.arrays.level2.hw02;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int [] ints = new int[]{7,2,9,4};

        for(int i = 0; i < ints.length / 2; i++) {
            int temp = ints[i];
            ints[i] = ints[ints.length - i - 1];
            ints[ints.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(ints));
    }
}