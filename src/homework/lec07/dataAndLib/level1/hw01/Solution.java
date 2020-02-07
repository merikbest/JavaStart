package homework.lec07.dataAndLib.level1.hw01;

import java.util.Calendar;

public class Solution {
    public static void main(String[] args) {
        System.out.println(dateDifference());
    }

    static long dateDifference() {
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.MONTH, -1);
        return calendar1.getTimeInMillis() - calendar2.getTimeInMillis();
    }
}