package Smoothstack;

/**
 * @author Brendon 
 * This program is for Java Basics 2 Assignment 1
 */
public class JB2_A1 {

	/**
	 * This program checks if there were any parameters passed to the main class
	 * before running. If there are parameters, it iterates over the entire args
	 * array and checks if each element can be converted to 'double' type. If it
	 * can be, convert it and add its value to the total 'sum'. If not, catch the
	 * error and print out a statement about the element. 
	 */
	public static void main(String[] args) {

		if (args != null) {
			double num;
			double sum = 0;
			
			for (int i = 0; i < args.length; i++) {
				try {
					num = Double.parseDouble(args[i]);
					sum += num;
				} catch (Exception e) {
					System.out.println("args[" + i + "] " + "\"" + args[i] + "\"" + " is not a number");
					continue;
				}
				System.out.println("args[" + i + "] = " + args[i]);
			}
			
			System.out.printf("\nThe total sum of all valid numbers is %.2f", sum);
		}
	}
}