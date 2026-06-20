/*
 * Exercise 1.9: Area & Perimeter of Rectangle
 *
 * Write a program that displays the area and perimeter of a rectangle with width 4.5 and height 7.9. Formulas: Area = width * height, Perimeter = 2 * (width + height). The class name must be Exercise01_09.

 * Expected Output:
 *   Area: 35.55
 *   Perimeter: 24.8
 */
public class Exercise01_09 {
    public static void main(String[] args) {
        // Calculate area and perimeter
        double width = 4.5;
        double height = 7.9;
        
        double area = width * height;
        double perimeter = 2 * (width + height);
        
        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+perimeter);
    }
}