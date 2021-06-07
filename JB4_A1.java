package Smoothstack;

/**
 * @author Brendon
 * This program is for Java Basics 4 Assignment 1.
 * 
 * This program implements a Singleton class with double checked locking. 
 */
public class JB4_A1 {

    /**
    * This class creates an instance of Singleton and checks it with double checked locking to prevent
    * multiple instances of a Singleton class. 
    */
    static class Singleton {
        private volatile static Singleton instance;
    
        private Singleton() {}
    
        public static Singleton getInstance() {
            if (instance == null) {
                synchronized (Singleton.class) {
                    if (instance == null) {
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        }
    }
}