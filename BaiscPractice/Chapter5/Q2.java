//Write a program to sum first n even numbers using a while loop.
package BaiscPractice.Chapter5;

public class Q2 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 20, i = 1;
        while(i <= n) {
            if (i % 2 == 0)
                sum = sum + i;
            i++;
        }
        System.out.println("sum = " + sum);
    }
}
