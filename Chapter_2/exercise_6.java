/*
 * Exercise 2.6: Sum Integer Digits
 *
 * Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer (e.g. 932 -> 9+3+2 = 14). The class name must be Exercise02_06.

 * Sample Input:
 *   932

 * Expected Output:
 *   Sum: 14
 */
import java.util.Scanner;

public class Exercise02_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Write logic to sum digits of the input integer
  
        int number = input.nextInt();
        
        int digit1 = number % 10; 
        number = number / 10;     
        
        int digit2 = number % 10; 
        number = number / 10;     
        
        int digit3 = number % 10; 
        
        int sum = digit1 + digit2 + digit3;
        
        System.out.println("Sum: " + sum);
    }
}