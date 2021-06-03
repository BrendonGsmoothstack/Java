package Smoothstack;
import java.util.Random;

/**
 * @author Brendon 
 * This program is for Java Basics 2 Assignment 2
 */
public class JB2_A2 {
    public static void main(String[] args) {
        // Create a 5x5 2D array and create a new random object. 
        int[][] array = new int [5][5];
        Random rand = new Random();

        // Iterate through each element of the array and store a random 
        // integer between 1-50. Print out the 2D array with the values 
        // created. If an element is less than 10, print an extra space
        // to improve formatting. Store the newly created value as 'max'
        // if it is the largest value that has been created.
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(51);
                System.out.print("[" + array[i][j] + "] ");

                if (array[i][j] < 10) {
                    System.out.print(" ");
                }
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            System.out.println();
        }

        // With the maximum value known, iterate through the array again and output each
        // position within the 2D array where that value is found. 
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == max) {
                    System.out.print("Max found at: ");
                    System.out.print("array[" + i + "]" + "[" + j + "]");
                    System.out.println();
                }
            }
        }
    }
}
