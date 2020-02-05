package homework.lec06.methods.level1.hw02;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getConcat("Hello", 3, 4.5));
    }

    public static String getConcat(String s, int a, double c) {
        return s + " " + (a + c);
    }
}
