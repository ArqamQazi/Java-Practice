//Write a Java program to find whether a year entered by the user is a leap year or not
package BaiscPractice.Chapter4;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (year % 400 == 0)
            System.out.println(year + " is leap year");
        else if (year % 100 == 0)
            System.out.println(year + " is not leap year");
        else if (year % 4 == 0)
            System.out.println(year + " is leap year");
        else
            System.out.println(year + " is not leap year");
    }
}
