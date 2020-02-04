package homework.lec05.arrays.level2.hw02;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int [] ints = new int[]{7,2,9,4};
        ArrayUtils.reverse(ints);
        System.out.println(Arrays.toString(ints));
    }
}