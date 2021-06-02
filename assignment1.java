package Smoothstack;

public class assignment1 {
    public static void main(String[] args) {

        //---PROBLEM #1---//

        /* Initialize string to be output with one "*" then run a for-loop 4 times that 
        prints out the string and continually adds an additional "*" onto it. Print out 
        a line of 9 dots at the end. */

        System.out.println("1)");
        String starsP1 = "*";

        for (int i = 0; i < 4; i++) {
            System.out.println(starsP1);
            starsP1 += "*";
        }

        System.out.println(".........");

        //---PROBLEM #2---//

        /* Print out a line of 10 dots at the start and run a double for-loop to print out "*". 
        The number of stars decreases with each iteration. The value of the inner loop counter 'j' 
        is dependent on the value of the outer loop 'i'. The function starts by printing 4 stars 
        and then decreases to 3, 2, and 1 stars. */
        System.out.println("2)");
        System.out.println("..........");

        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //---PROBLEM #3---//

        /* Initialize string variable with one star. Run a double for-loop that runs 4 times. 
        Inner loop counter 'j' depends on the outer loop counter 'i'. The inner loop prints out 
        spaces and the number of spaces printed decreases with each iteration. Inner loop prints 
        out 5, 4, 3, and then 2 spaces. Outer for-loop prints the string and then concatenates it
        with 2 more stars before running again. At the end, print out a line of 11 dots. */
        System.out.println("3)");
        String starsP3 = "*";

        for (int i = 0; i < 4; i++) {

            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }

            System.out.print(starsP3);
            System.out.println();
            starsP3 += "**";
        }

        System.out.println("...........");

        //---PROBLEM #4---//

        /* Print out a line of 12 dots. Run a for-loop with 2 nested for-loops inside of it.
        The first nested loop prints out spaces, the second one prints out "*". The counters
        'j' and 'k' for both loops depend on the counter of the outer loop 'i'. The first loop
        prints out 2, 3, 4, then 5 spaces. The second loop prints out 7, 5, 3, then 1 stars. */
        System.out.println("4)");
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