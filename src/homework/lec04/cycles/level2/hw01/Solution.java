package homework.lec04.cycles.level2.hw01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int width = 7;
        double half = width / 2;
        for (int i = 0; i < width; i++){
            System.out.println(String.format("%"+((i < half ? i : (width-i-1))*2+1)+"s", "").replaceAll(" ", "*"));
        }
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            System.out.println("Высота прямоугольника : ");
//            int height = Integer.parseInt(reader.readLine());
//
//            char[] chars = new char[height];
//            Arrays.fill(chars, '*');
//
//
//
////            for (int i = 0; i < height; i++) {
////                System.out.println(new String(chars,0, height - Math.abs(i)));
////            }
//        } catch (IOException | NumberFormatException e) {
//            e.printStackTrace();
//        }
    }
}
