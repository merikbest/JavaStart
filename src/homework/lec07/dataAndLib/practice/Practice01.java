package homework.lec07.dataAndLib.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice01 {
    public static void main(String[] args) {
        Date date = new Date();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите дату: dd:MM:yyyy");
            String str = reader.readLine();
            SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd:MM:yyyy");
            date = dateFormat1.parse(str);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println(dateFormat.format(date));
    }
}
