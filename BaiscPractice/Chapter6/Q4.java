//Write a function to print the following pattern
// ****
// ***
// **
// *
package BaiscPractice.Chapter6;

public class Q4 {
    public static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pyramid(5);
    }
}
