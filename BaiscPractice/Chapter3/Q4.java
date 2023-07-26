//Write a Java program to detect double and triple spaces in a string.
package BaiscPractice.Chapter3;

public class Q4 {
    public static void main(String[] args) {
        String str = "This string contains double and  triple   spaces";
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));
    }
}
