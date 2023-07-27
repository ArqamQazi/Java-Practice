//Repeat problem 2 using Recursion
package BaiscPractice.Chapter6;

public class Q8 {
    public static void pyramid(int n, int i) {
        if (i > n)
            return;
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
        pyramid(n, i + 1);
    }
    public static void main(String[] args) {
        pyramid(5, 1);
    }
}
