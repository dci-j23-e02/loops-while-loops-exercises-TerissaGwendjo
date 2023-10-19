import java.util.Random;
import java.util.Scanner;

    public class NumberGuessingGame {
        public static void main(String[] args) {
            Random random = new Random();
            int min = 1;
            int max = 100;
            int randomNumber = random.nextInt(max - min + 1) + min; // Generate a random number between 1 and 100
            int userGuess;
            int numberOfGuesses = 0;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to the Number Guessing Game!");

            do {
                System.out.print("Guess the number (between 1 and 100): ");
                userGuess = scanner.nextInt();
                numberOfGuesses++;

                if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number.");
                }
            } while (userGuess != randomNumber);

            System.out.println("You guessed the number in " + numberOfGuesses + " tries.");
            scanner.close();
        }
    }

