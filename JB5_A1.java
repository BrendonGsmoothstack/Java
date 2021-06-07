package Smoothstack;
import java.util.Arrays;

/**
 * @author Brendon
 * 
 * This program is for Java Basics 5 Assignment 1.
 */
public class JB5_A1 {
    public static void main(String[] args) {

        String array[] = {"abc", "xyz", "short", "medium length", "the longest string"};


        // Shortest to Longest
        System.out.println("Array From Shorest to Longest: ");
        Arrays.sort(array, (a, b) -> a.length() - b.length());

        for (String i : array) {
            System.out.println(i);
        }

        // Longest to Shortest
        Arrays.sort(array, (a, b) -> b.length() - a.length());
        System.out.println("\nArray From Longest to Shorest:");

        for (String i : array) {
            System.out.println(i);
        }

        // Alphabetically by first character only
        Arrays.sort(array, (a, b) -> a.charAt(0) - b.charAt(0));
        System.out.println("\nArray Sorted by First Character:");
        
        for (String i : array) {
            System.out.println(i);
        }

        // Strings that contain "e" first and everything else second.
        Arrays.sort(array, (a, b) -> {
            if (a.contains("e")) return -1;
            else return 0;
        });
        System.out.println("\nArray Sorted by Strings That Contain \"E\":");

        for (String i : array) {
            System.out.println(i);
        }

        // Using a static helper method
        // public class Utils {
        //     public static void helper(s1, s2) {

        //     }
        // }

        // Arrays.sort(words, (s1, s2)) -> Utils.helper(s1,s2);
    }
}
