package by.Vitali.HomeWorks.philosophers;

import java.util.concurrent.Semaphore;

/**
 *Philosopher
 */
public class Philosopher extends Thread {

    private Semaphore semaphore;
    private int id;
    private int num = 0;

    Philosopher(Semaphore semaphore, int id) {
        this.semaphore = semaphore;
        this.id = id;
    }

    public void run() {
        try {
            while (num < 3)//количество циклов обедов каждого философа
            {
                semaphore.acquire();
                System.out.println("Философ " + id + " садится за стол");
                Thread.sleep(3000);
                num++;
                System.out.println("Философ " + id + " берет 2 вилки и обедает");
                System.out.println("Философ " + id + " пообедал, размышляет");
                semaphore.release();
                Thread.sleep(1000);
                           }
        } catch (InterruptedException e) {
            System.out.println("Exception!!!");
        }
    }
}