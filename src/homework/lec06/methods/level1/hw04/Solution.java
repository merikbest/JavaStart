package homework.lec06.methods.level1.hw04;

public class Solution {
    public static void main(String[] args) {
        int[] intsArray = new int[]{1, 5, 6, 54, 9, 3, 2, 8, 44, 22};
        int num = 44;
        System.out.println(findElement(intsArray, num));
    }

    public static int findElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}