package AdvancdJava.DateAndTime;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Clock {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask updateTimeTask = new TimerTask() {
            @Override
            public void run() {
                Calendar c = Calendar.getInstance();
                int currentSecond = c.get(Calendar.SECOND);

                System.out.print(c.get(Calendar.HOUR_OF_DAY) + ":");
                System.out.print(c.get(Calendar.MINUTE) + ":");
                System.out.println(currentSecond);
            }
        };

        // Schedule the task to run every second
        timer.scheduleAtFixedRate(updateTimeTask, 0, 1000);
    }
}
