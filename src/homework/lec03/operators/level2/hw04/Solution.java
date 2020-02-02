package homework.lec03.operators.level2.hw04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите шестизначное число: ");
            String palindrome = reader.readLine();

            if (palindrome.length() != 6) {
                System.out.println("Ошибка! Введите шестизначное число.");
            } else {
                boolean isPalindrome = palindrome.equals(new StringBuilder(palindrome).reverse().toString());
                System.out.println("Число " + palindrome + (isPalindrome ? " является палиндромом." : " не является палиндромом."));
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Ошибка! Введите число.");
        }
    }
}