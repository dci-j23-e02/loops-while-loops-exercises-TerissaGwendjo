import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0.0; //sum is initialized to 0.0 This variable is meant to accumulate the sum of all the grades
        // entered by the user. It starts at zero because no grades have been entered yet.
        double count = 0;  //  is initialized to 0. This variable is used to count the number of grades entered.
        // It also starts at zero because no grades have been entered yet.
        double highestGrade = Double.NEGATIVE_INFINITY;
        double lowestGrade = Double.POSITIVE_INFINITY;
        // highestGrade is initialized to Double.NEGATIVE_INFINITY. This value represents negative infinity in the
        // context of double-precision floating-point numbers. It's used as a placeholder to ensure that the first
        // entered grade will always be considered higher than this initial value. This way, the program can track
        // the highest grade effectively.

        double grade;
        /*grade is a variable that holds the grade entered by the user in each iteration. It's declared but not
        initialized in this snippet. It will be set to the grade entered by the user within the loop.*/

        do {
            System.out.print("Enter a grade (or a negative number to quit): ");
            grade = scanner.nextDouble();

            if (grade >= 0) {
                sum += grade;
                count++;

                if (grade > highestGrade) {
                    highestGrade = grade;
                }

                if (grade < lowestGrade) {
                    lowestGrade = grade;
                }
            } else if (count == 0) {
                System.out.println("No grades entered. Exiting...");
                return;
            }
        } while (grade >= 0); //After exiting the loop, we calculate the average grade by dividing the sum by the count
        // and display the result, along with the highest and lowest grades.

        // Calculate and display the average grade
        double average = sum / count;
        System.out.println("Average grade: " + average);

        // Display the highest and lowest grades
        System.out.println("Highest grade: " + highestGrade);
        System.out.println("Lowest grade: " + lowestGrade);
    } //We use a do-while loop to repeatedly ask the user for grades until they enter a negative number.
    // The loop continues as long as the grade is non-negative.
}

