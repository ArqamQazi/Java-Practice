//Write a Java method to print the multiplication table of a number n.
package BaiscPractice.Chapter6;

public class Q1 {
    public static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
    public static void main(String[] args) {
        table(10);
    }
}
