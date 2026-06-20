/*
 * Exercise 2.5: Financial Tip Calculator
 *
 * Write a program that reads a subtotal and a gratuity rate from console input, and computes the gratuity and total. Gratuity = subtotal * (rate / 100). Total = subtotal + gratuity. The class name must be Exercise02_05.

 * Sample Input:
 *   10 15

 * Expected Output:
 *   Tip: 1.5
 *   Total: 11.5
 */
import java.util.Scanner;

public class Exercise02_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read subtotal and rate, calculate and print tip and total
        double subtotal = input.nextDouble();
        double rate = input.nextDouble();
        
        double gratuity = subtotal * (rate / 100.0);
        double total = subtotal + gratuity;
        
        System.out.println("Gratuity: " + gratuity + " Total: " + total);
  
    }
}