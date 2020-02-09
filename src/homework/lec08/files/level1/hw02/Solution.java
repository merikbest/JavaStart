package homework.lec08.files.level1.hw02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Solution {
    public static void main(String[] args) {
        File file = new File("matrix.txt");
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String text = fromArrayToString(array);
        saveTextToFile(text, file);
    }

    public static void saveTextToFile(String text, File file) {
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.println(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String fromArrayToString(int[][] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int[] rows : array) {
            for (int col : rows) {
                stringBuilder.append(String.format("%-6.6s\t", "" + col));
            }
            stringBuilder.append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }
}