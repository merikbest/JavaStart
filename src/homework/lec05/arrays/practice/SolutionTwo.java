package homework.lec05.arrays.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SolutionTwo {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int size = Integer.parseInt(reader.readLine());
            int [][] array = new int[size][size];
            int sum = 0;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = (1 + j);
                    System.out.print(array[i][j] + " ");
                }
                sum = sum + array[i][i];
                System.out.println();
            }

            System.out.println(sum);

            for (int[] row : array) {
                System.out.println(Arrays.toString(row));

            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
