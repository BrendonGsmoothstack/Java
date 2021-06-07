package Smoothstack;
import java.util.LinkedList;

/**
 * @author Brendon
 * 
 * This program is for Java Basics 4 Assignment 3.
 * 
 */
public class JB4_A3 {
    public static void main(String[] args) throws InterruptedException {

        final ProducerConsumer pc = new ProducerConsumer();

        /**
         * Creates a new thread which attempts to call the 'produce' method. If it cannot
         * produce, it will catch with the InterruptedException error. 
         */
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        /**
         * Creates a new thread which attempts to call the 'consume' method. If it cannot 
         * consume, it will catch the InterruptedException error. 
         */
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Thread 1 and 2 are both started.
        thread1.start();
        thread2.start();
    }   

    /**
     * This class contains both the 'produce' and 'consume' methods for adding values to
     * a list and consuming them. 
     */
    public static class ProducerConsumer {

        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 2;
    
        /**
         * This method adds values to a list with a max capacity of '2'. The values start at 
         * '0' and then continually increment by '1'. Once the list is full, production is 
         * halted with 'wait' and the consumer thread may operate. The thread has a sleep timer
         * of 1000 ms to slow down the rate of operation and make the process easier to watch. 
         */
        public void produce() throws InterruptedException {
    
            int value = 0;
            while (true) {
                synchronized (this) {
                    while (list.size() == capacity) {
                        wait();
                    }
                    
                    System.out.println("Producer produced-" + value);
                    list.add(value++);
                    notify();
                    Thread.sleep(1000);
                }
            }
        }
    
        /**
         * This method consumes values from the list with the 'removeFirst' method. Once the
         * list is empty (size 0), the thread is halted with 'wait' and the producer thread
         * may operate again. 
         */

        public void consume() throws InterruptedException {
    
            while (true) {
                synchronized (this) {
                    while (list.size() == 0) {
                        wait();
                    }
    
                    int val = list.removeFirst();
                    System.out.println("Consumer consumed-" + val);
                    notify();
                    Thread.sleep(1000);
                }
            }
        }
    }
}

