//4. Write a Java program to convert Kilometers to miles.
package BaiscPractice.Chapter1;

import java.util.Scanner;

public class Q5_KilometerToMiles {
    public static void main(String[] args) {
        float kilometer;
        Scanner sc = new Scanner(System.in);
        kilometer = sc.nextFloat();
        System.out.println(kilometer + " = " + kilometer / 1.609f + " miles");
    }
}
