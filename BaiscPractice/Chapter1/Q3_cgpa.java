//3. Write a program to calculate CGPA using marks of three subjects (out of 100)


package BaiscPractice.Chapter1;
public class Q3_cgpa {
    public static void main(String[] args) {
        float subject1 = 81f, subject2 = 89f, subject3 = 92f;
        float cgpa = (subject1 + subject2 + subject3) / 30.0f;
        System.out.println("CGPA: " + cgpa);
    }
}
