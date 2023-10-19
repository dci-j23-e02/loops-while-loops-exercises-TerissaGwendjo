import java.util.Scanner;

public class WeightlossLossProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your current weight (in kg): ");
        double currentWeight = scanner.nextDouble();

        System.out.println("Please enter your goal weight (in kg): ");
        double goalWeight = scanner.nextDouble();

        System.out.print("Enter your weekly weight loss rate (in kg per week): ");
        double weeklyLossRate = scanner.nextDouble();

        scanner.close(); // close scanner to prevent resources leaks.

        int weeks = 0; //initialize the number of weeks starting from zero

        if (currentWeight <= goalWeight) {
            System.out.println("You have already reached or surpassed your goal.");
        } else {

            while (currentWeight > goalWeight) { //the loop condition is to check if current
                // weight is greater than goal weight
                currentWeight -= 1; //subtract 1kg from the current weight. can also use currentWeight --
                weeks++; // increment the number of weeks
            }
            System.out.println("Goal weight achieved in: " + weeks + " weeks");
        }
        //To handle the case where the user can lose a different amount of weight each week.
       /* if (weeklyLossRate <= 0) {
            System.out.println("Please enter a positive weekly weight loss rate.");
        } else {
            // Calculate how many weeks it will take to reach the goal weight
            while (currentWeight > goalWeight) {
                currentWeight -= weeklyLossRate; // Subtract the specified weekly loss rate
                weeks++;
            }
        }*/

    /*In summary, currentWeight--; is a statement that decreases the value of currentWeight
    by 1, and it's used within the context of a loop to gradually reduce currentWeight
    until it reaches or falls below the goalWeight*/

    }
}
