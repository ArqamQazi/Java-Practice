//5. Write a Java program to detect whether a number entered by the user is an integer or not.
package BaiscPractice.Chapter1;

import java.util.Scanner;

public class Q6_IntegerOrNot {
    public static void main(String[] args) {
        boolean num1;
        Scanner sc = new Scanner(System.in);
//        hasNextInt() is used to check whether number is int or not and it returns boolean value
        num1 = sc.hasNextInt();
        System.out.println(num1);
    }
}