package BaiscPractice.ExceptionQuestions;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
//        Write a java program to demonstrate syntax, logical 2 runtime errors.
//        Syntax error
//        int a = 5
//        Logical error
//        int a = 5, b = 3;
//        int add = a - b;
        // Problem 2
//        Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument exception.
        try {
            int a = 23 / 0;
        } catch (IllegalArgumentException e) {
            System.out.println("Hehe");
        } catch (ArithmeticException e) {
            System.out.println("haha");
        }

        //Problem 3
        //Write a program that allows you to keep access an array until valid index is given. If max retries exceeds 5 return "error".

        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 93;
        marks[1] = 98;
        marks[2] = 99;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (i <= 5) {
            try {
                System.out.println("Enter the value of index: ");
                index = sc.nextInt();
                System.out.println("Value of marks[" + index + "] is " + marks[index]);
                flag = false;
                break;
            } catch (Exception e) {
                System.out.println("Invalid index");
                i++;
            }
        }
        if (flag) {
            System.out.println("Error");
        }

    }
}
