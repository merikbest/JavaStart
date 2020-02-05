package homework.lec06.methods.level1.hw05;

public class Solution {
    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet consectetur adipiscing elit";
        System.out.println(countWords(str));
    }

    public static int countWords (String text) {
        String[] strings = text.trim().split("\\s+");
        return strings.length;
    }
}