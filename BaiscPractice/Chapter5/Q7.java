//Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
package BaiscPractice.Chapter5;

public class Q7 {
    public static void main(String[] args) {
        int n = 8, sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += n * i;
        }
        System.out.println("sum = " + sum);
    }
}
//    1: What can be done using one type of loop can also be done using the other two types of loops - True or False.
//    Ans = True

//    A do-while loop is executed:
//
//       At least once    <--
//       At least twice
//      At most once