//Repeat problem 3 using an iterative approach.
package BaiscPractice.Chapter6;

public class Q10 {
    public static int sumOfN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfN(100));
    }
}
