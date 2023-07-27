package BaiscPractice.Chapter6;

public class Q5 {
    public static int fibNTerm(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibNTerm(n - 1) + fibNTerm(n - 2);
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibNTerm(n));
    }
}
