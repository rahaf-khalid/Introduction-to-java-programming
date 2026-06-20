/*
 * Exercise 1.11: Population Projection
 *
 * Calculate population for next 5 years (Years 1 to 5). Current population = 312032486. A birth every 7s, death every 13s, immigrant every 45s. Year = 365 days. Use floating point addition per year and print as integers. The class name must be Exercise01_11.

 * Expected Output:
 *   Year 1: 314812582
 *   Year 2: 317592679
 *   Year 3: 320372776
 *   Year 4: 323152873
 *   Year 5: 325932970
 */
public class Exercise01_11 {
    public static void main(String[] args) {
        // Calculate and print Years 1 to 5 population
       
        double currentPopulation = 312032486;
        double secondsInYear = 365 * 24 * 60 * 60;

        double birthsPerYear = secondsInYear / 7.0;
        double deathsPerYear = secondsInYear / 13.0;
        double immigrantsPerYear = secondsInYear / 45.0;

        double netChangePerYear = birthsPerYear - deathsPerYear + immigrantsPerYear;

        double year1 = currentPopulation + netChangePerYear;
        double year2 = year1 + netChangePerYear;
        double year3 = year2 + netChangePerYear;
        double year4 = year3 + netChangePerYear;
        double year5 = year4 + netChangePerYear;
        
        System.out.println("Year 1: " + (long)year1);
        System.out.println("Year 2: " + (long)year2);
        System.out.println("Year 3: " + (long)year3);
        System.out.println("Year 4: " + (long)year4);
        System.out.println("Year 5: " + (long)year5);
    }
}