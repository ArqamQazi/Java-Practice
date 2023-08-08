package AdvancdJava.DateAndTime;
// Calculate run time
public class DateAndTime1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for(int i = 0; i <= 100; i++) {
            System.out.println("Hello");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Starting Time: " + startTime);
        System.out.println("Ending Time: " + endTime);
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed: " + elapsedTime);
    }
}
