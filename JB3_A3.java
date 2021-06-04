package Smoothstack;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * @author Brendon
 * This program is for Java Basics 3 Assignment 3
 * 
 * This program searches through a file for the number of instances of a character. The
 * user is asked to provide a character to search for. If the input is not exactly 1 
 * character long, then an error is continually printed until the input is exactly 
 * 1 character. 
 */
public class JB3_A3 {
    public static void main(String[] args) {

        /**
         * The user is asked to provide a character to search for. If the input is not exactly 1 
         * character long, then an error is continually printed and a new request is made until
         * the input is exactly 1 character.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character to search for: ");
        String str = input.next();

        while (str.length() > 1) {
            System.out.print("INVALID INPUT. Enter a single character to search for: ");
            input.nextLine();
            str = input.next();
        }

        char charToCount = str.charAt(0);

        /**
         * Once the character to search for is known, the program reads the file and searches for all
         * instances of the character. A 'BufferedReader' is used to read through the file line-by-line
         * until the document has been fully searched. Each line is printed out and the number of instances 
         * is counted for each line and added to the 'totalCount'. A FileNotFoundException is caught if
         * the file to be read cannot be found, and an IOException is caught if an error occurs with the IO
         * stream.
         */
        File file = new File("C:\\Users\\Brendon\\Documents\\JavaFiles\\Smoothstack\\sample.txt"); // Insert local file name here
        String line;
        long count;
        long totalCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            System.out.println("Searching contents of file \"" + file + "\"");
            line = reader.readLine();

            while (line != null) {
                count = line.chars().filter(ch -> ch == charToCount).count();
                System.out.println(line);
                totalCount += count;
                line = reader.readLine();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR. File not found. Could not find the specified file.");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nThe file contains " + totalCount + " instances of the character \"" + charToCount + "\"\n");
        input.close();
    }
}
