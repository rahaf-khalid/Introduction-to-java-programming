/*
 * Exercise 3.9: Business Check ISBN-10
 *
 * Read the first 9 digits of an ISBN. Compute the checksum: (d1 * 1 + d2 * 2 + ... + d9 * 9) % 11. If the checksum is 10, the last digit is 'X'. Print the full 10-digit ISBN. The class name must be Exercise03_09.

 * Sample Input:
 *   013031997

 * Expected Output:
 *   013031997X
 */
import java.util.Scanner;

public class Exercise03_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read 9 digits, print 10-digit ISBN
        int isbn = input.nextInt();

        int remainingDigits = isbn;
        int d9 = remainingDigits % 10;
        remainingDigits /= 10;
        int d8 = remainingDigits % 10;
        remainingDigits /= 10;
        int d7 = remainingDigits % 10;
        remainingDigits /= 10;
        int d6 = remainingDigits % 10;
        remainingDigits /= 10;
        int d5 = remainingDigits % 10;
        remainingDigits /= 10;
        int d4 = remainingDigits % 10;
        remainingDigits /= 10;
        int d3 = remainingDigits % 10;
        remainingDigits /= 10;
        int d2 = remainingDigits % 10;
        remainingDigits /= 10;
        int d1 = remainingDigits % 10;

        int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        System.out.printf("%09d", isbn);

        if (checksum == 10) {
            System.out.print("X");
        } else {
            System.out.print(checksum);
        }
        System.out.println();
    }
}