//Write a program to find out whether a student is pass or fail; if it requires a total
// of 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user
package BaiscPractice.Chapter4;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        byte sub1, sub2, sub3;
        Scanner sc = new Scanner(System.in);
        sub1 = sc.nextByte();
        sub2 = sc.nextByte();
        sub3 = sc.nextByte();
        if (sub1 >= 33 && sub2 >= 33 && sub3 >=33) {
            if (((sub1 + sub2 + sub3) / 3) >= 40) {
                System.out.println("You are passed");
            } else {
                System.out.println("Your are fail");
            }
        }

    }
}
