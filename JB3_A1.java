package Smoothstack;
import java.io.File;

/**
 * @author Brendon
 * This program is for Java Basics 3 Assignment 1
 * 
 * This program searches through the contents of a folder based on a file path
 * and checks whether the local file path is a directory or not. If it exists and
 * it is a directory, store the list of contents into an array 'arr'. Print out the
 * name of the file path and recursively print through the contents.
 */
public class JB3_A1 {
    public static void main(String[] args) {
        String maindirpath = "C:\\Users\\Brendon\\Documents\\JavaFiles\\Smoothstack"; // insert local file path here
        File maindir = new File(maindirpath);

        if (maindir.exists() && maindir.isDirectory()) {

            File arr[] = maindir.listFiles();
            System.out.println("Files from the directory: " + maindir);
            System.out.println();

            RecursivePrint(arr, 0, 0);
        }
    }

    /**
     * 
     * If the file path has no contents, return a statement and exit. If it does, and the item is a file
     * then get and print out the file name. If the item is a subdirectory, print out the name of the
     * subdirectory and recurisvely print the contents of this subdirectory. Increment 'level' by 1
     * to print tabs for formatting purposes. Continue running through the subidrectory until all of its
     * contents have been evaluated. Continue running this function until all contents of the main
     * directory have been evaluated. 
     * 
     */
    static void RecursivePrint(File[] arr, int index, int level) {
        if (index == arr.length) {
            System.out.println("No files/subdirectories in this folder.");
            return;
        }

        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }

        if (arr[index].isFile()) {
            System.out.println(arr[index].getName());
        }

        else if (arr[index].isDirectory()) {
            System.out.println("[" + arr[index].getName() + "]");
            RecursivePrint(arr[index].listFiles(), 0, level + 1);
        }
        RecursivePrint(arr, ++index, level);
    }
}
