//Repeat problem 4 using Recursion
package BaiscPractice.Chapter6;

public class Q7 {
    public static void pyramid(int n) {
        if (n == 0)
            return;
        for (int j = 1; j <= n; j++) {
            System.out.print("* ");
        }
        System.out.println();
        pyramid(n - 1);
    }
    public static void main(String[] args) {
        pyramid(5);
    }
}
