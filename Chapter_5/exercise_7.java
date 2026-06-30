/*
 * Exercise 5.7: Compute Future Tuition
 *
 * Tuition is $10,000 this year, rising 5% annually. Compute tuition in 10 years and the total cost of 4 years' tuition starting 10 years from now. The class name must be Exercise05_07.

 * Expected Output:
 *   Tuition: 16288.9
 *   Cost: 73717.7
 */
public class Exercise05_07 {
    public static void main(String[] args) {
        // Calculate tuition and total 4-year cost
        double tuition = 10000.0;
        double totalCost = 0;

        for (int i = 1; i <= 10; i++) {
            tuition = tuition * 1.05;
        }

        double currentYearTuition = tuition;
        for (int i = 1; i <= 4; i++) {
            totalCost += currentYearTuition;
            currentYearTuition = currentYearTuition * 1.05;
        }

        System.out.println("Tuition: " + tuition);
        System.out.println("Cost: " + totalCost);
    }
}