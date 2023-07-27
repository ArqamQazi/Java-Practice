// Repeat problem 5 using a while loop.
//Q5: Write a program to find the factorial of a given number using for loops
package BaiscPractice.Chapter5;

public class Q6 {
    public static void main(String[] args) {
        int sum = 1, n = 5;
        int i = 1;
        while (i <= n) {
            sum *= i;
            i++;
        }
        System.out.println("Factorial of " + n + " is " + sum);
    }
}
