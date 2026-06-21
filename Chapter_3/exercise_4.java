/*
 * Exercise 3.4: Random Month Generator
 *
 * Write a program that randomly generates an integer between 1 and 12 and displays the English month name (e.g. 1 for January, 2 for February...). The class name must be Exercise03_04.

 * Expected Output:
 *   [Month]
 */
public class Exercise03_04 {
    public static void main(String[] args) {
        // Generate random number 1 to 12, print month
        int month = (int)(Math.random() * 12) + 1;

        if (month == 1) {
            System.out.println("January");
        } else if (month == 2) {
            System.out.println("February");
        } else if (month == 3) {
            System.out.println("March");
        } else if (month == 4) {
            System.out.println("April");
        } else if (month == 5) {
            System.out.println("May");
        } else if (month == 6) {
            System.out.println("June");
        } else if (month == 7) {
            System.out.println("July");
        } else if (month == 8) {
            System.out.println("August");
        } else if (month == 9) {
            System.out.println("September");
        } else if (month == 10) {
            System.out.println("October");
        } else if (month == 11) {
            System.out.println("November");
        } else if{
            System.out.println("December");
        }
    }
}