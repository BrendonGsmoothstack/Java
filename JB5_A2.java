package Smoothstack;
import java.util.stream.Collectors;
import java.util.List;

/**
 * @author Brendon
 * 
 * This program is for Java Basics 5 Assignment 2.
 * 
 * This method returns a comma-seperated string based on a given integer list. If the integer
 * is divisible by '2' then it is precded by the letter "e", but if it is not then it 
 * is preceded by the letter "o".
 */
public class JB5_A2 {
    public String getString(List<Integer> list) {
        return list.stream()
                    .map(i -> i % 2 == 0 ? "e" + i : "o" + i)
                    .collect(Collectors.joining(","));
    }
}