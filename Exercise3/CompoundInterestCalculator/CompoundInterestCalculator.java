import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for initial deposit
        System.out.print("Enter the initial deposit: $");
        double principal = scanner.nextDouble();

        // Prompt the user for the annual interest rate
        System.out.print("Enter the annual interest rate (as a percentage): ");
        double annualInterestRate = scanner.nextDouble();
        double yearlyInterestRate = annualInterestRate / 100; // Convert to a decimal

        // Prompt the user for the number of years
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        // Calculate the final balance after the specified number of years with yearly compounding
        double finalBalance = principal;
        int i = 0;

        while (i < years) {
            int n = 0; // Initialize the number of compounding periods for the current year
            double balance = finalBalance; // Initialize the balance for the current year

            while (n < 12) { // Assuming monthly compounding within a year (12 compounding periods)
                balance += balance * (yearlyInterestRate / 12); // Calculate interest for each compounding period
                n++;
            }

            finalBalance = balance; // Update the final balance for the current year
            i++;
        }

        // Close the scanner to prevent resource leaks
        scanner.close();

        System.out.printf("The final balance after %d years is %.2f.%n", years, finalBalance);
    }
}




//The formula calculates the interest for one compounding period by multiplying the current balance by the monthly interest rate adjusted for the compounding frequency.
            //
            //+= finalBalance * (monthlyInterestRate / compoundingFrequency): This adds the calculated interest to the current balance.
            //It effectively increases the balance by the interest earned during the compounding period, reflecting
            // the growth of the account over that period.



