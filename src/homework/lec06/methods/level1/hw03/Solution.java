package homework.lec06.methods.level1.hw03;

public class Solution {
    public static void main(String[] args) {
        drawRectangle(5, 5);
    }

    public static void drawRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}