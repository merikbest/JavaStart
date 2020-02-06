package homework.lec07.dataAndLib.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class practice02 {
    public static void main(String[] args) {
        Date date = new Date();
        String str = "23 Мая 1995";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");

        try {
            date = simpleDateFormat.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(new SimpleDateFormat("EEEE").format(date));
    }
}
