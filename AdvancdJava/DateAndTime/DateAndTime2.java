package AdvancdJava.DateAndTime;

import java.util.Date;

public class DateAndTime2 {
    public static void main(String[] args) {
        //Question: Is it safe to store the number of milliseconds in a variable of type long?
        //Yes, it is absolutely safe to store the number of milliseconds in a variable of type long
        System.out.println("The maximum value long can store: " + Long.MAX_VALUE);
        System.out.println("Current time in millis: " + System.currentTimeMillis());
        //Most Method are deprecated in java.util.Date

        //getTime() :

        Date d= new Date(2021,5,23);

        System.out.println("The number of milliseconds passed since Jan 1, 1970 :" +d.getTime() );




        Date d1 = new Date();
        System.out.println("Today's date: ");
        int month = d1.getMonth() + 1;
        int year = d1.getYear() + 1900;
        System.out.println(d1.getDate() + "-" + month + "-" + year);

    }
}
