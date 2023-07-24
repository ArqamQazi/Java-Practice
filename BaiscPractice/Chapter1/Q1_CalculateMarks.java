//Write a program to calculate the percentage of a given student in the CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)
package BaiscPractice.Chpter1;

import java.util.Scanner;

public class Q1_CalculateMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sub1, sub2, sub3, sub4, sub5;
        System.out.println("Enter marks of 5 subject: ");
        sub1 = sc.nextFloat();
        sub2 = sc.nextFloat();
        sub3 = sc.nextFloat();
        sub4 = sc.nextFloat();
        sub5 = sc.nextFloat();

        float percentage = (sub1 + sub2 + sub3 + sub4 + sub5) / 5.0f;
        System.out.println("Percentage: " + percentage + "%");
    }
}
