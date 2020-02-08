package homework.lec07.dataAndLib.level2.hw02;

public class Solution {
    public static void main(String[] args) {
        int num1 = 1000, num2 = 17;
        System.out.println(hammingDistance(num1, num2));
    }

    static int hammingDistance(int num1, int num2) {
        int i = num1 ^ num2;
        int bits = 0;

        while (i > 0) {
            bits += i & 1;
            i >>= 1;
        }
        return bits;
    }
}