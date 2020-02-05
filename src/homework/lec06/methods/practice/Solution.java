package homework.lec06.methods.practice;

public class Solution {
    private String name;

    public Solution(String name) {

    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
//        System.out.println(countrLetter("Hello", 'l'));
        Solution myDog = new Solution("Rover");
        System.out.println(myDog);
        foo(myDog);


    }

    public static void foo(Solution someDog) {
        someDog.setName("Max");     // AAA
        System.out.println(someDog);
        someDog = new Solution("Fifi");  // BBB
        someDog.setName("Rowlf");   // CCC
        System.out.println(someDog);
    }




//    public static int countrLetter(String text, char latter) {
//        int count = 0;
//        char[] chars = text.toCharArray();
//
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == latter) {
//                count++;
//            }
//        }
//        return count;
//    }
}
