package homework.lec03.operators.level1.hw02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите номер квартиры: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double roomNum = Double.parseDouble(reader.readLine());
        double floorHouse = Math.ceil(roomNum / 4);

        if ((roomNum > 0) && (roomNum <= 36)) {
            System.out.println("1 парадное " + (int) floorHouse + " этаж");
        } else if ((roomNum > 36) && (roomNum <= 72)) {
            System.out.println("2 парадное " + ((int) floorHouse - 9) + " этаж");
        } else if ((roomNum > 72) && (roomNum <= 108)) {
            System.out.println("3 парадное " + ((int) floorHouse - 18) + " этаж");
        } else if ((roomNum > 108) && (roomNum <= 144)) {
            System.out.println("4 парадное " + ((int) floorHouse - 27)  + " этаж");
        } else {
            System.out.println("Такой квартиры не существует");
        }
    }
}