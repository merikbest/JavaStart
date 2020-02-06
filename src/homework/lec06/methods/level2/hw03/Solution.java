package homework.lec06.methods.level2.hw03;

public class Solution {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 3, 4, 5};
        getPermutations(ints, 0);
    }

    public static void getPermutations(int[] array, int index) {
        if (index >= array.length - 1) {
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + " ");
            }

            if (array.length > 0) {
                System.out.print(array[array.length - 1]);
            }
            System.out.println("");
            return;
        }

        for (int i = index; i < array.length; i++) {
            int j = array[index];
            array[index] = array[i];
            array[i] = j;

            getPermutations(array, index + 1);

            j = array[index];
            array[index] = array[i];
            array[i] = j;
        }
    }
}