/*
 * Exercise 5.4: Conversion Miles to Kilometers
 *
 * Write a loop to display a table of conversions from miles (1 to 10) to kilometers (1 mile = 1.609 km). The class name must be Exercise05_04.

 * Expected Output:
 *   10      16.09
 */
public class Exercise05_04 {
    public static void main(String[] args) {
        // Display conversion table
        final double MILES_TO_KILOMETERS = 1.609;

        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = miles * MILES_TO_KILOMETERS;
            System.out.printf("%-10d%-13.2f\n", miles, kilometers);
        }
    }
}