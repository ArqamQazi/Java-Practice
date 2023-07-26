//3 :Calculate income tax paid by an employee to the government as per the slabs mentioned below:

//Income     Slab	    Tax
//        2.5L – 5.0L  	5%
//        5.0L – 10.0L 	20%
//        Above 10.0L	30%
package BaiscPractice.Chapter4;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int salary;
        int tax;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        salary = sc.nextInt();
        if (salary >= 250000 && salary < 500000) {
            tax = (salary * 5) / 100;
            System.out.println("You will pay " + tax + " tax");
        }
        else if (salary >= 500000 && salary < 1000000) {
            tax = (salary * 20) / 100;
            System.out.println("You will pay " + tax + " tax");

        }
        else if (salary >= 1000000) {
            tax = (salary * 30) / 100;
            System.out.println("You will pay " + tax + " tax");
        }
    }
}
