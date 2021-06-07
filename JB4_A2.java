package Smoothstack;

/**
 * @author Brendon
 * 
 * This program is for Java Basics 4 Assignment 2.
 */
public class JB4_A2 {
    
    String str1 = "String One";
    String str2 = "String Two";

    /**
     * Creates a new thread which takes both 'str1' and 'str2' as lock objects
     * and then prints out a statement with them. 
     */
    Thread thread1 = new Thread("Thread 1") {
        public void run() {
            while (true) {
                synchronized(str1) {
                    synchronized(str2) {
                        System.out.println(str1 + " " +str2);
                    }
                }
            }
        }
    };

    /**
     * Creates a new thread which performs the same task as 'thread1' but requires 
     * obtaining locks in the opposite order (str2 then str1).
     */
    Thread thread2 = new Thread("Thread 2") {
        public void run() {
            while (true) {
                synchronized(str2) {
                    synchronized(str1) {
                        System.out.println(str2 + str1);
                    }
                }
            }
        }
    };

    /**
     * Creates a new instance of the class JB4_A2 and calls for both 'thread1' and
     * 'thread2' to start. thread1 and thread 2 cannot both run since mutliple threads
     * need the same locks but obtain them in different orders. This results in a deadlock
     * and the program hangs forever.
     */
    public static void main(String[] args) {
        JB4_A2 deadlock = new JB4_A2();
        deadlock.thread1.start();
        deadlock.thread2.start();
    }
}
