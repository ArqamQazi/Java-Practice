//Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
package BaiscPractice.Chapter2;

public class Q2 {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char) (grade + 8);
//        encrypted marks
        System.out.println(grade);
        //decrypted marks
        grade = (char) (grade - 8);
        System.out.println(grade);
    }
}


