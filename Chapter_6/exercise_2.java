/*
 * Exercise 6.2: Sum Digits Helper Method
 *
 * Implement a method 'public static int sumDigits(long n)' to sum all digits in a long integer. Call it from main for the input 234. The class name must be Exercise06_02.

 * Expected Output:
 *   Sum: 9
 */
public class Exercise06_02 {
    public static void main(String[] args) {
        System.out.println("Sum: " + sumDigits(234));
    }
    
    public static int sumDigits(long n) {
        // Sum digits logic here
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        
        return sum;
    }
}