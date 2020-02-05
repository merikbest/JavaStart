package homework.lec06.methods.level2.hw02;

public class Solution {
    public static void main(String[] args) {
        int sum;
        int max = 0;

        for (int i = 999; i > 0; i--) {
            for (int j = 999; j > 0; j--) {
                sum = i * j;
                String s = Integer.toString(sum);

                if (s.equals(new StringBuilder(s).reverse().toString())) {
                    max = Math.max(max, sum);
                }
            }
        }
        System.out.println("Самый большой палиндром, полученный умножением двух трехзначных чисел : " + max);
    }
}
