/*
 * Exercise 3.5: Find Future Dates
 *
 * Prompt user for today's day of week (0 for Sun, 1 for Mon, ..., 6 for Sat) and elapsed days, then print today's day and the future day of the week. The class name must be Exercise03_05.

 * Sample Input:
 *   1 3

 * Expected Output:
 *   Today is Monday and the future day is Thursday
 */
import java.util.Scanner;

public class Exercise03_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Write code here
       
        int today = input.nextInt();
        int elapsedDays = input.nextInt();

        int futureDay = (today + elapsedDays) % 7;

        
        switch (today) {
            case 0: todayStr = "Sunday"; break;
            case 1: todayStr = "Monday"; break;
            case 2: todayStr = "Tuesday"; break;
            case 3: todayStr = "Wednesday"; break;
            case 4: todayStr = "Thursday"; break;
            case 5: todayStr = "Friday"; break;
            case 6: todayStr = "Saturday"; break;
        }

        
        switch (futureDay) {
            case 0: futureDayStr = "Sunday"; break;
            case 1: futureDayStr = "Monday"; break;
            case 2: futureDayStr = "Tuesday"; break;
            case 3: futureDayStr = "Wednesday"; break;
            case 4: futureDayStr = "Thursday"; break;
            case 5: futureDayStr = "Friday"; break;
            case 6: futureDayStr = "Saturday"; break;
        }

        System.out.println("Today is " + todayStr + " and the future day is " + futureDayStr);

    }
}