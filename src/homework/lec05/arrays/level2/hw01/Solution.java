package homework.lec05.arrays.level2.hw01;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] ints = {
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6}};

        printMatrix(ints);

        System.out.println("Rotate to 90 degrees");
        printMatrix(rotateMatrix(ints, 90));

        System.out.println("Rotate to 180 degrees");
        printMatrix(rotateMatrix(ints, 180));

        System.out.println("Rotate to 270 degrees");
        printMatrix(rotateMatrix(ints, 270));

    }

    public static void printMatrix(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static int[][] rotateMatrix(int[][] matrix, int degree) {

        int[][] rotated = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (degree == 90) {
                    rotated[matrix[0].length - j - 1][i] = matrix[i][j];
                }

                if (degree == 180) {
                    rotated[matrix.length - i - 1][matrix[0].length - j - 1] = matrix[i][j];
                }

                if (degree == 270) {
                    rotated[j][matrix.length - i - 1] = matrix[i][j];
                }
            }
        }
        return rotated;
    }
}