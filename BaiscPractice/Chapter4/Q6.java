//:Write a program to find out the type of website from the URL:
//
//        .com – commercial website
//        .org – organization website
//        .in – Indian website
package BaiscPractice.Chapter4;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if (website.endsWith(".com"))
            System.out.println("commercial website");
        else if(website.endsWith(".org"))
            System.out.println("organization website");
        else if (website.endsWith(".in"))
            System.out.println(".Indian website");
    }
}
