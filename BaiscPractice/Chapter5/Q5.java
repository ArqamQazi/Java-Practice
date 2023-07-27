// Write a program to find the factorial of a given number using for loops
package BaiscPractice.Chapter5;

public class Q5 {
    public static void main(String[] args) {
        int sum = 1, n = 5;
        for (int i = 1; i <= n; i++)
            sum *= i;
        System.out.println("Factorial of " + n + " is " + sum);

    }
}
