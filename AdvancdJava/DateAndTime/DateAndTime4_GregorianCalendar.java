package AdvancdJava.DateAndTime;

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateAndTime4_GregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.getTime());
        System.out.println(cal.isLeapYear(2023));
        System.out.println(cal.getCalendarType());
        //Time zone
        for (int i = 0; i < 100; i++) {
            System.out.println(TimeZone.getAvailableIDs()[i]);
        }
    }

}
