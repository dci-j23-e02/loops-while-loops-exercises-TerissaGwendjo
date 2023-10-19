import java.util.Scanner;

public class OrderTotalCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalPrice = 0.0;
        int itemCount = 0;
        double price;

        System.out.println("Enter the price of each item (or a negative number to finish):");

        do {
            System.out.print("Item " + (itemCount + 1) + ": $");
            price = scanner.nextDouble();

            if (price >= 0) {
                totalPrice += price;
                itemCount++;
            } else if (itemCount == 0) {
                System.out.println("No items entered. Exiting...");
                return;
            }
        } while (price >= 0);

        // Calculate and display the total price
        System.out.println("Total price: $" + totalPrice);

        // Calculate and display the average price
        if (itemCount > 0) {
            double averagePrice = totalPrice / itemCount;
            System.out.println("Average price: $" + averagePrice);
        }
    } /*if (price >= 0): This condition checks if the price entered by the user is non-negative (i.e., greater than or
    equal to 0). It ensures that the price is a valid non-negative value.

If the price is non-negative, the code inside the if block is executed:

totalPrice += price;: Here, price is added to the totalPrice. This line accumulates the total price of all items entered so far.

itemCount++;: This line increments the itemCount by 1. itemCount keeps track of the number of items entered by the user.

If the price is negative (i.e., the user entered a negative number), the code inside the else if block is executed:

itemCount == 0: This condition checks if no items have been entered yet. If itemCount is still 0, it means this is the
first entry and the user entered a negative number immediately.

If this is the case, the program prints the message "No items entered. Exiting..." to inform the user that no items were
 entered, and then it returns, effectively exiting the program.

In summary, this code block ensures that only valid non-negative prices are added to the total and that the program
exits if a negative price is entered as the first item (to avoid processing empty input).*/
}

