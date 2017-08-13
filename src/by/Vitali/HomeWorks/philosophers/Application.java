package by.Vitali.HomeWorks.philosophers;

import java.util.concurrent.Semaphore;

/**
 * Philosopher
 */
public class Application {
    public static void main(final String... args) {

        Semaphore sem = new Semaphore(2);
        for(int i=1;i<6;i++)
            new Philosopher(sem, i).start();
    }
}
