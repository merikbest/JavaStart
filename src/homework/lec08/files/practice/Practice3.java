package homework.lec08.files.practice;

import java.io.*;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        File file = new File("src/homework/lec08/files/practice/Practice3.java");
        String text = fastLoadTextFromFile(file);
        System.out.println(text);
    }

    public static String loadTextFromFile(File file) {
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine());
                stringBuilder.append(System.lineSeparator());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public static String fastLoadTextFromFile(File file) {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String string = "";
            while ((string = reader.readLine()) != null) {
                stringBuilder.append(string);
                stringBuilder.append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}