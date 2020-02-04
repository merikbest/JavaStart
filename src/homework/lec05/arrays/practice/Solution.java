package homework.lec05.arrays.practice;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int [] payArray = new int[12];
        int sumArray = 0;

        for (int i = 0; i < payArray.length; i++) {
            payArray[i] = (int) (Math.random()* 5000) + 5000;
            sumArray += payArray[i];
        }
        System.out.println(Arrays.toString(payArray));
        System.out.println(sumArray);
        System.out.println(sumArray/payArray.length);
    }
}
