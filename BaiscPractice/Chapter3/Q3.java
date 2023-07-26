//Write a Java program to fill in a letter template which looks like below:
// letter = “Dear <|name|>, Thanks a lot”

// Replace <|name|> with a string (some name)
package BaiscPractice.Chapter3;


public class Q3 {
    public static void main(String[] args) {
        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>", "(some name)");
        System.out.println(letter);
    }
}
