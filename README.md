

# Exercise 1 (Easy):

## Overview:
You are a software developer at a fitness company. Your task is to create a program that asks the user for their current weight and their goal weight. The program should then calculate how many weeks it will take for the user to reach their goal if they lose 1kg per week.

## Step Guidance:
1. Use the Scanner class to get the user's current weight and goal weight.
2. Use a while loop to subtract 1 from the current weight each week until the current weight is less than or equal to the goal weight.
3. Print out the number of weeks it will take for the user to reach their goal.

## Examples:
Input -> Output 
Current weight: 70, Goal weight: 65 -> "It will take you 5 weeks to reach your goal."

## Notes:
Remember to handle the case where the current weight is already less than or equal to the goal weight.

## Bonus:
Try to handle the case where the user can lose a different amount of weight each week.

# Exercise 2 (Medium):

## Overview:
You are a software developer at a game company. Your task is to create a program that simulates a guessing game. The program should generate a random number between 1 and 100 and ask the user to guess the number. The game continues until the user guesses the correct number.

## Step Guidance:
1. Use the Random class to generate a random number.
2. Use a do-while loop to ask the user for their guess and compare it to the random number.
3. If the guess is correct, congratulate the user and end the game. If the guess is incorrect, give the user a hint and ask for another guess.

## Examples:
Input -> Output 
Random number: 50, User guess: 70 -> "Too high! Try again."
User guess: 30 -> "Too low! Try again."
User guess: 50 -> "Congratulations! You guessed the number."

## Notes:
Remember to use the nextInt() method of the Random class to generate a random number.

## Bonus:
Try to count the number of guesses the user makes and display it at the end of the game.

# Exercise 3 (Hard):

## Overview:
You are a software developer at a bank. Your task is to create a program that calculates the compound interest on a savings account. The program should ask the user for their initial deposit, the annual interest rate, and the number of years they plan to leave the money in the account.

## Step Guidance:
1. Use the Scanner class to get the user's initial deposit, annual interest rate, and number of years.
2. Use a while loop to calculate the compound interest for each year.
3. Print out the final balance of the account after the specified number of years.

## Examples:
Input -> Output 
Initial deposit: 1000, Annual interest rate: 5, Number of years: 10 -> "The final balance after 10 years is 1628.89."

## Notes:
Remember to convert the annual interest rate from a percentage to a decimal.

## Bonus:
Try to handle the case where the interest is compounded more than once per year.

# Exercise 4 (Medium):

## Overview:
You are a software developer at a school. Your task is to create a program that calculates the average grade of a student. The program should ask the user for their grades until they enter a negative number.

## Step Guidance:
1. Use the Scanner class to get the user's grades.
2. Use a do-while loop to keep asking for grades until the user enters a negative number.
3. Calculate the average grade and print it out.

## Examples:
Input -> Output 
Grades: 80, 90, 85, -1 -> "The average grade is 85."

## Notes:
Remember to handle the case where the user enters a negative number as the first grade.

## Bonus:
Try to calculate the highest and lowest grade as well.

# Exercise 5 (Hard):

## Overview:
You are a software developer at a company that sells products online. Your task is to create a program that calculates the total price of a customer's order. The program should ask the user for the price of each item until they enter a negative number.

## Step Guidance:
1. Use the Scanner class to get the price of each item.
2. Use a while loop to keep asking for prices until the user enters a negative number.
3. Calculate the total price and print it out.

## Examples:
Input -> Output 
Prices: 10.99, 20.99, 15.99, -1 -> "The total price is 47.97."

## Notes:
Remember to handle the case where the user enters a negative number as the first price.

## Bonus:
Try to calculate the average price of the items as well.

