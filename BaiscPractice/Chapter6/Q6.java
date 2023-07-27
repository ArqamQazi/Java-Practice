//Write a function to find the average of a set of numbers passed as arguments.
package BaiscPractice.Chapter6;

public class Q6 {
    public static void average(int ...n) {
        int sum = 0;
        for (int j : n) {
            sum += j;
        }
        int average = sum / n.length;
        System.out.println(average);
    }
    public static void main(String[] args) {
        average(5, 11, 2);
    }
}
