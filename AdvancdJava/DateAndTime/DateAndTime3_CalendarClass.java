package AdvancdJava.DateAndTime;

import java.util.Calendar;

public class DateAndTime3_CalendarClass {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.print(c.get(Calendar.DATE) + "-");
        System.out.print(c.get(Calendar.MONTH) + "-");
        System.out.println(c.get(Calendar.YEAR));

        System.out.print(c.get(Calendar.HOUR_OF_DAY) + ":");
        System.out.print(c.get(Calendar.MINUTE) + ":");
        System.out.println(c.get(Calendar.SECOND));

        //add(int field, int amount) :

        System.out.println("Current date is : " + c.getTime());
        c.add(Calendar.YEAR, 4);
        System.out.println("After 4 years  : "+ c.getTime());
        c.add(Calendar.YEAR, -12);
        System.out.println("Before 12 years  : "+ c.getTime());
        c.add(Calendar.MONTH,2);
        System.out.println("After 2 months  : "+ c.getTime());

        //getWeeksInWeekYear() :
        //Returns the number of week in a year
        System.out.println(c.getWeeksInWeekYear());
    }
}

