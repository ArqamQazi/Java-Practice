//Write a function to convert Celsius temperature into Fahrenheit.
package BaiscPractice.Chapter6;

public class Q9 {
    public static void celsiusToFahrenheit(int c) {
        float fahrenheit = (c * 1.8f) + 32;
        System.out.println(c + "C = " + fahrenheit + "F");
    }
    public static void main(String[] args) {
        celsiusToFahrenheit(37);
    }
}
