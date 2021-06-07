package Smoothstack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Brendon
 * 
 * This program is for Java Basics Week 1 Assignment 1.
 * 
 * This program uses lambda expression to evalute input and check whether
 * the value is odd, prime, or a palindrome. 
 */
interface PerformOperation {
    boolean check(int a);
}

/**
 * This class contains the methods to perform the operations to check whether a value
 * is odd, prime, or a palindrome.
 */
class Math {
    public boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd() {
        return a -> (a % 2 != 0) ? true : false;
    }

    public PerformOperation isPrime() {
        return a -> {
            for (int i = 2; i * i <= a; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return a -> a == Integer.parseInt(new StringBuilder(String.valueOf(a)).reverse().toString()) ? true : false;
    }
}

/**
 * The main class executes the program by creating a new instance of the 'Math' class. A BufferedReader
 * reads the input that is put in, and the first integer is stored for the number of test cases (must
 * be greater than 0 to run). 
 */
public class JBWK1_A1 {
    public static void main(String[] args) throws IOException {
        Math obj = new Math();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());

        PerformOperation operation;
        boolean ret = false;
        String ans = null;

        /**
         * This operation accepts the next numbers in a line after the initial value has been read.
         * The first value is stored into the variable 'ch' and is used to determine which kind of 
         * assessment to make (isOdd, isPrime, isPalindrome). The second variable 'num' is the value
         * to be checked. The operation is performed and a boolean value is returned based on the 
         * result. The result of the operation is then evaluated and a statement is printed out
         * reflecting the result. 
         */
        while (T --> 0) {
            String str = reader.readLine().trim();

            StringTokenizer token = new StringTokenizer(str);
            int ch = Integer.parseInt(token.nextToken());
            int num = Integer.parseInt(token.nextToken());

            if (ch == 1) {
                operation = obj.isOdd();
                ret = obj.checker(operation, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                operation = obj.isPrime();
                ret = obj.checker(operation, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                operation = obj.isPalindrome();
                ret = obj.checker(operation, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
            }
            System.out.println(ans);
        }
    }
}
