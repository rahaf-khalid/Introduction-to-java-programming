/*
 * Exercise 2.2: Compute Cylinder Volume
 *
 * Write a program that reads the radius and length of a cylinder from console input, and computes area and volume. Area = radius * radius * PI. Volume = area * length. The class name must be Exercise02_02.

 * Sample Input:
 *   5.5 12

 * Expected Output:
 *   Area: 95.033
 *   Volume: 1140.4
 */
import java.util.Scanner;

public class Exercise02_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read radius and length, then calculate area and volume
        
        double radius = input.nextDouble();
        double length = input.nextDouble();
        
        double Area = radius * radius * 3.14159;
        double Volume = Area * length;
        
        System.out.println("Area: " + Area + " Volume: " + Volume);
    }
}