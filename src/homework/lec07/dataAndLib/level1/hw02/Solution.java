package homework.lec07.dataAndLib.level1.hw02;

public class Solution {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 3, 4, 5};
        System.out.println(myToString(ints));
    }

    static String myToString(int[] array) {
        StringBuilder builder = new StringBuilder("[");

        for (int i : array) {
            builder.append(i + ",");
        }

        builder.deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }
}