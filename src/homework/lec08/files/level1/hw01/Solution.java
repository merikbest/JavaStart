package homework.lec08.files.level1.hw01;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        File file = new File("JavaStart/a.txt");
        textEditor(file);
    }

    public static void textEditor(File file) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            StringBuilder stringBuilder = new StringBuilder();
            String string;

            while (!(string = reader.readLine()).equals("exit")) {
                stringBuilder.append(string);
                stringBuilder.append(System.lineSeparator());
            }
            writer.write(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}