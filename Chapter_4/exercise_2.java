/*
 * Exercise 4.2: Great Circle Distance
 *
 * Read latitude/longitude of point 1 and point 2, then compute the great circle distance using Math trig functions. The class name must be Exercise04_02.

 * Sample Input:
 *   39.55 -8.66 41.51 -8.22

 * Expected Output:
 *   Distance: 218.
 */
import java.util.Scanner;

public class Exercise04_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Write Great Circle distance calculation here
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double x1Rad = Math.toRadians(x1);
        double y1Rad = Math.toRadians(y1);
        double x2Rad = Math.toRadians(x2);
        double y2Rad = Math.toRadians(y2);

        double radius = 6371.01;

        double distance = radius * Math.acos(Math.sin(x1Rad) * Math.sin(x2Rad) + 
                          Math.cos(x1Rad) * Math.cos(x2Rad) * Math.cos(y1Rad - y2Rad));

        System.out.println("The distance between the two points is " + distance + " km");  
    }
}