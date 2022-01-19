package dp.java5.feature.keyword.volatile_;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * https://dzone.com/articles/java-volatile-keyword-0
 * http://tutorials.jenkov.com/java-concurrency/volatile.html
 *
 * volatile keyword is used to mark a Java variable as "being stored in main memory".
 * More precisely that means, that every read of a volatile variable will be read from 
 * the computer's main memory, and not from the CPU cache, 
 * 
 * CPU1										+-------+
 *   Thread1 <-->core1<-->CPU Cache1<-->	| Main	|
 *    										|		|
 * CPU2										| Memory|
 *   Thread2 <-->core2<-->CPU Cache2<-->	|		|
 *   										+-------+
 */							

public class VolatileTest {
    private static final Logger LOGGER = Logger.getLogger(VolatileTest.class.getName());
   // private static volatile int MY_INT = 0;
    
    private static  int MY_INT = 0;

    public static void main(String[] args) {
        new ChangeListener().start();
        new ChangeMaker().start();
    }

    static class ChangeListener extends Thread {
        @Override
        public void run() {
            int local_value = MY_INT;
            while ( local_value < 5){
                if( local_value!= MY_INT){
                    LOGGER.log(Level.INFO,"Got Change for MY_INT : {0}", MY_INT);
                     local_value= MY_INT;
                }
            }
        }
    }

    static class ChangeMaker extends Thread{
        @Override
        public void run() {

            int local_value = MY_INT;
            while (MY_INT <5){
                LOGGER.log(Level.INFO, "Incrementing MY_INT to {0}", local_value+1);
                MY_INT = ++local_value;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) { e.printStackTrace(); }
            }
        }
    }
}