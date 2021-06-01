package Smoothstack;
import java.util.Scanner;
import java.util.Random;

public class assignment2 {
    public static void main(String[] args) {

        /* Create a scanner to receive user input, a random number generator, and
        an int to store the random number between 1-100. */
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        int randomInt = ran.nextInt(101);

        /* Receive the initial guess from the user and check if the number is within
        the bounds of 1-100. If it is not, continually print an error statement and 
        request a new valid integer between 1-100. While loop only runs if the initial
        answer is out of bounds. */
        System.out.print("Guess a number between 1-100: ");
        int userGuess = input.nextInt();
        while (!(userGuess >= 1 && userGuess <= 100)) {
            System.out.print("INVALID NUMBER. Choose a number between 1-100: ");
            userGuess = input.nextInt();
        }

        /* Run a while-loop that runs a maximum of 5 times. This while loop always runs
        at least once and first checks whether the initial guess is within +/- 10 of the
        correct answer. If it is, it prints out a statement and breaks the while loop. If 
        it is not, and the user has guess 5 times, then it prints a statement and breaks
        the loop. 
        
        Otherwise, the loop prints a prints a statement and requests a new guess from the user.
        If the user enters an invalid number then an error message continually prints until a 
        valid number is entered. The counter (attempt) is then incremented by 1.
        */
        int attempt = 1;
        while (attempt <= 5) {
            if (Math.abs(userGuess - randomInt) <= 10) {
                System.out.println("Correct!");
                break;
            }
            else if (attempt == 5) {
                System.out.println("Sorry! The answer was " + randomInt + ".");
                break;
            }

            System.out.print(userGuess + " is not within +/- 10 of the answer. Try again: ");
            userGuess = input.nextInt();
            while (!(userGuess >= 1 && userGuess <= 100)) {
                System.out.print("INVALID NUMBER. Choose a number between 1-100: ");
                userGuess = input.nextInt();
            }
            attempt++;
        }

        /* Scanner 'input' is finally closed. */
        input.close();
    }
}
