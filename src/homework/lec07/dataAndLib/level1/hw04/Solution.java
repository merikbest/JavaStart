package homework.lec07.dataAndLib.level1.hw04;

public class Solution {
    public static void main(String[] args) {
        tenPiNum(Math.PI);
    }

    static void tenPiNum(double num) {
        for (int i = 2; i < 12; i++) {
            System.out.printf("%." + i + "f" + "\n", num);
        }
    }
}