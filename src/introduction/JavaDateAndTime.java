package introduction;

import java.io.*;

import java.time.DayOfWeek;
import java.time.LocalDate;


class Result {

    public static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year,month,day);
        DayOfWeek dayOfWeek1 = localDate.getDayOfWeek();
        String dayOfWeek = dayOfWeek1.toString();
        return dayOfWeek;
    }

}


public class JavaDateAndTime {
    public static void main(String[] args) throws IOException {

        int month = 4;
        int day = 6;
        int year = 2022;

        String res = Result.findDay(month, day, year);
        System.out.println(res);


    }
}
