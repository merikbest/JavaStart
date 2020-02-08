package homework.lec08.files.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Practice2 {
    public static void main(String[] args) {
        int[][] array = {{1111111, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String text = fromArrayToString(array);
        System.out.println(text);
        File file = new File("matrix.txt");
        saveTextToFile(text,file);
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
