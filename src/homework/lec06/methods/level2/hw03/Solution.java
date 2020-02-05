package homework.lec06.methods.level2.hw03;


import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Set<List<String>> strings = new HashSet<>();

        List<String> arrlist = new ArrayList<>();
        arrlist.add("A");
        arrlist.add("B");
        arrlist.add("C");

        while (true) {
            Collections.shuffle(arrlist);
            System.out.println("Final collection after shuffle: " + arrlist);
            strings.add(arrlist);
        }




//        int[] array = new int[]{1, 2, 3, 4, 5};
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                int temp = array[j];
//                array[j] = array[j];
//                array[j] = temp;
//                System.out.println(Arrays.toString(array));
//            }
//        }


    }

//    public static void main(String args[]) {
//        String[] s = {"Was", "it", "a", "cat", "I", "saw"};
//        permutate(s);
//    }
//
//    public static void permutate(String[] arr){
//        permuteIteration(arr, 0);
//    }
//
//    private static void permuteIteration(String[] arr, int index){
//        //последняя итерация
//        if(index >= arr.length - 1){
//            for(String s: arr) System.out.print(s + " ");
//            System.out.println("");
//            return;
//        }
//
//        for(int i = index; i < arr.length; i++){
//            String temp = arr[index];
//            arr[index] = arr[i];
//            arr[i] = temp;
//
//            permuteIteration(arr, index+1);
//
//            temp = arr[index];
//            arr[index] = arr[i];
//            arr[i] = temp;
//        }
//    }
}
