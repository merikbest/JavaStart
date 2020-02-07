package homework.lec07.dataAndLib.level2.hw01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите дату в формате dd MM yyyy : ");
            getDate(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getDate(String text) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
            Date currentDate = new Date();
            Date enteredDate = sdf.parse(text);
            int yearDifference = currentDate.getYear() - enteredDate.getYear();

            if (yearDifference == 0) {
                stringBuilder.append("Год совпадает");
            } else {
                stringBuilder.append("Год отличается на: " + yearDifference);
            }

            stringBuilder.append(" и ");

            int mounthDifference = currentDate.getMonth() - enteredDate.getMonth();

            if (mounthDifference == 0) {
                stringBuilder.append("месяц совпадает.");
            } else {
                stringBuilder.append("месяц отличается на: " + mounthDifference);
            }
            System.out.println(stringBuilder);
        } catch (ParseException e) {
            System.out.println("Ошибка! Вы ввели некоректную дату.");
        }
    }
}