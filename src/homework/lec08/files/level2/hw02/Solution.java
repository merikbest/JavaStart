package homework.lec08.files.level2.hw02;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        File file = new File("a.txt");
        getTextCharacters(file);
    }

    public static void getTextCharacters(File file) {
        Map<Character, Integer> unSortedMap = new HashMap<Character, Integer>();
        StringBuilder stringBuilder = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String line = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            char[] alphabetChars = alphabet.toCharArray();

            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(System.lineSeparator());
            }

            String text = stringBuilder.toString().toLowerCase().replaceAll(" ", "");
            char[] textChars = text.toCharArray();

            for (int i = 0; i < alphabetChars.length; i++) {
                char c = alphabetChars[i];
                int count = 0;

                for (int j = 0; j < textChars.length; j++) {
                    if (c == textChars[j])
                        count++;
                }
                if (count != 0) {
                    unSortedMap.put(c, count);
                }
            }
            sortMap(unSortedMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sortMap(Map<Character,Integer> map) {
        LinkedHashMap<Character, Integer> reverseSortedMap = new LinkedHashMap<>();

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

        for (Map.Entry pair : reverseSortedMap.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
    }
}