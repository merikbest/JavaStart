package homework.lec06.methods.level1.hw01;

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 6, 54, 9, 3, 2, 8, 44, 22};
        System.out.println(getMax(array));
    }

    public static int getMax(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }
}