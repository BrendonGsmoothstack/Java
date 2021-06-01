package Smoothstack;

public class assignment1 {
    public static void main(String[] args) {
        // PROBLEM #1
        // Initialize string to be output with one "*"
        String stars = "*";

        // Run a for-loop 4 times that prints out the string and 
        // then adds another "*" onto it.
        for (int i = 0; i < 4; i++) {
            System.out.println(stars);
            stars += "*";
        }

        // Print out one line of dots after the loop is done. 
        System.out.println(".........");


        //PROBLEM #2

        // Print out one line of dots at the start.
        System.out.println("..........");

        // Double for-loop to print out "*". Strings are immutable and cannot be shortened so this
        // function prints out 4 stars with the inner loop, then increments the outer loop by 1, starts
        // the inner loop at a higher value, and prints out 3, 2, and 1 stars. 
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // PROBLEM #3
        
        // Initialize string variable with one star. 
        String starsP3 = "*";

        // Run a double for-loop that runs 4 times. Inner for-loop prints spaces
        // based on the counter of the outer loop. Inner for-loop prints 5, 4, 3, 
        // then 2 spaces. Outer for-loop prints the starsP3 string and then concatenates
        // it with 2 more stars before running again. 
        for (int i = 0; i < 4; i++) {

            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }

            System.out.print(starsP3);
            System.out.println();
            starsP3 += "**";
        }

        System.out.println("...........");


        // PROBLEM #4

        System.out.println("............");
        
        for (int i = 4; i > 0; i--) {

            for (int j = i-1; j < 5; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i * 2 - 1; k++) {
            System.out.print("*");
            }

            System.out.println();
        }
    }
}
