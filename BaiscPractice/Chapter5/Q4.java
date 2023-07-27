//Write a program to print a multiplication table of 10 in reverse order.
package BaiscPractice.Chapter5;

public class Q4 {
    public static void main(String[] args) {
        int n = 2;
        for (int i = 10; i >= 1; i--) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
