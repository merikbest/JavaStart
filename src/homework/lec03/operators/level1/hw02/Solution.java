package homework.lec03.operators.level1.hw02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        System.out.print("Введите номер квартиры: ");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int roomNum = Integer.parseInt(reader.readLine());
            int floorHouse = (int) Math.ceil(roomNum / 4);

            if ((roomNum > 0) && (roomNum <= 36)) {
                System.out.println("1 парадное " + floorHouse + " этаж");
            } else if ((roomNum > 36) && (roomNum <= 72)) {
                System.out.println("2 парадное " + (floorHouse - 9) + " этаж");
            } else if ((roomNum > 72) && (roomNum <= 108)) {
                System.out.println("3 парадное " + (floorHouse - 18) + " этаж");
            } else if ((roomNum > 108) && (roomNum <= 144)) {
                System.out.println("4 парадное " + (floorHouse - 27) + " этаж");
            } else {
                System.out.println("Такой квартиры не существует");
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Такой квартиры не существует");
        }
    }
}