package Smoothstack;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Assignment2 {
    public static void main(String[] args) {

        /* Create a scanner to receive user input, a random number generator, and
        an int to store the random number generated between 1-100. */
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        int randomInt = ran.nextInt(101);

        /* Give the input variable 'userGuess' an initial value of 0, set the do-while condition
        validInt to false, and set the attempts to '1'. Print the first statement asking for the
        first guess from the user. */
        int userGuess = 0;
        boolean validInt = false;
        int attempt = 1;
        System.out.print("Guess a number between 1-100: ");

        /* Run a while loop a maximum of 5 times for the 5 guesses by the user. A do-while with a 
        try-catch is nested inside at the start to make sure the user enters a valid integer. If
        the user enters a value that is not of int-type then a mismatch exception catches the 
        error and runs the do-while again. If the user enters an integer between 1-100 then the 
        while condition becomes true which ends the loop. If the integer is invalid, the loop continues. */
        while (attempt <= 5) {
            do {
                try {
                    userGuess = input.nextInt();
                }
                catch (InputMismatchException e) {
                    System.out.print("INVALID TYPE. Choose an integer between 1-100: ");
                    input.nextLine();
                    continue;
                }
                if (userGuess >= 1 && userGuess <= 100) {
                    validInt = true;
                }
                else {
                    System.out.print("INVALID NUMBER. Choose an integer between 1-100: ");
                }
            } while (validInt == false);

            /* If the user's guess is within 10 of the correct answer, print a statement and break 
            the while loop. If it is not, print a request for a new value and increment 'attempt' by 1. */
            if (Math.abs(userGuess - randomInt) <= 10) {
                System.out.println("Correct!");
                break;
            }

            System.out.print(userGuess + " is not within +/- 10 of the answer. Try again: ");
            attempt++;
        }

        // If the correct answer was not guessed in 5 attempts, print the following statement. 
        if (attempt == 6) {
            System.out.println("Sorry! The answer was " + randomInt + ".");
        }

        // Scanner 'input' is closed at the end. 
        input.close();
    }
}
