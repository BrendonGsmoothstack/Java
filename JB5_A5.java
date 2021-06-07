package Smoothstack;

import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.time.DateTimeException;
import java.io.PrintStream;
import java.lang.NumberFormatException;

/**
 * @author Brendon
 * 
 * This program is for Java Basics 5 Assignment 5. 
 * 
 * This program displays the number of days in each month of the specified year. 
 */
public class JB5_A5 {
    public static void main(String[] args) {
        int year = 0;

        if (args.length <= 0) {
            System.out.printf("Usage: MonthsInYear <year>%n");
            throw new IllegalArgumentException();
        }

        try {
            year = Integer.parseInt(args[0]);
        } catch (NumberFormatException nexc) {
            System.out.printf("%s is not a properly formatted number.%n",
                args[0]);
            throw nexc;     // Rethrow the exception.
        }

        try {
            Year test = Year.of(year);
        } catch (DateTimeException exc) {
            System.out.printf("%d is not a valid year.%n", year);
            throw exc;     // Rethrow the exception.
        }

        System.out.printf("For the year %d:%n", year);
        for (Month month : Month.values()) {
            YearMonth ym = YearMonth.of(year, month);
            System.out.printf("%s: %d days%n", month, ym.lengthOfMonth());
        }
    }
}