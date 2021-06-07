package Smoothstack;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Brendon
 * 
 * This program is for Java Basics 5 Assignment 3.
 * 
 * This program takes a given list of strings and returns a list of all strings that
 * start with the letter 'a' (in lower case) and have exactly 3 letters. 
 */
public class JB5_A3 {
    public List<String> search(List<String> list) {
        return list.stream()
                    .filter(s -> s.startsWith("a"))
                    .filter(s -> s.length() == 3)
                    .collect(Collectors.toList());
    }
}