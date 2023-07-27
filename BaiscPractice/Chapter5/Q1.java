//1 : Write a program to print the following pattern :
//        ****
//
//        ***
//
//        **
//
//        *
package BaiscPractice.Chapter5;

public class Q1 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
