//4. Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.
package BaiscPractice.Chapter1;

import java.util.Scanner;

public class Q4_Greet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();

        System.out.println("Hello " + name);
        System.out.println("have a good day " + name);
    }
}
