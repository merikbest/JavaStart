package homework.lec08.files.level2.hw01;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Содержысое файла matrix.txt
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
*/

public class Solution {
    public static void main(String args[]) {
        File file = new File("matrix.txt");
        twoDArray(file);
    }

    public static void twoDArray(File file) {
        List<List<String>> arrayList = new ArrayList<List<String>>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            List<String> subList = new ArrayList<>();
            String line;

            while ((line = reader.readLine()) != null) {
                subList.add(line);
            }

            for (int i = 0; i < subList.size(); i++) {
                arrayList.add(new ArrayList<String>(Collections.singleton(subList.get(i))));
            }

            for (List<String> s: arrayList) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}