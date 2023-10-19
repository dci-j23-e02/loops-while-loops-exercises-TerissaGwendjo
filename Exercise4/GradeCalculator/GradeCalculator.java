import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0.0;
        double count = 0;
        double highestGrade = Double.NEGATIVE_INFINITY;
        double lowestGrade = Double.POSITIVE_INFINITY;

        double grade;

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
        } while (grade >= 0);

        // Calculate and display the average grade
        double average = sum / count;
        System.out.println("Average grade: " + average);

        // Display the highest and lowest grades
        System.out.println("Highest grade: " + highestGrade);
        System.out.println("Lowest grade: " + lowestGrade);
    }
}

