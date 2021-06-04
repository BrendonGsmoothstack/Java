package Smoothstack;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Brendon
 * This program is for Java Basics 3 Assignment 2
 * 
 * This program takes a string of text and appends it to a file. If the file does not exist then
 * a new one will be created. A 'FileWriter' object is created for the file and the text is appended
 * onto the file. A statement is then printed informing the user what text the file was appended with.
 */
public class JB3_A2 {
    public static void main(String[] args) {
        try {
            String text = "Append this text to a file."; // Insert text to be appended to the file
            File file = new File("C:\\Users\\Brendon\\Documents\\JavaFiles\\Smoothstack\\sample.txt"); // Insert local file path name
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWrite = new FileWriter(file, true);
            fileWrite.write("\n" + text);
            fileWrite.close();
            System.out.println("File was appended with " + "\"" + text + "\"");
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
