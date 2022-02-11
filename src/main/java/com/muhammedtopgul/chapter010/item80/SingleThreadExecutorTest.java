package com.muhammedtopgul.chapter010.item80;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

/**
 * @author muhammed-topgul
 * @since 11.02.2022 17:42
 */

public class SingleThreadExecutorTest {

    private static class PrinterJob implements Runnable {
        private static int nth = 0;

        private final int id = ++nth;
        private final int speed;

        private PrinterJob() {
            this.speed = new Random().nextInt(99) + 1;
        }

        @Override
        public void run() {
            System.out.println("Starting printer work: " + id);

            for (int i = 0; i < 100; i += speed) {
                try {
                    MILLISECONDS.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("Worker %d, done %d%%%n", id, i);
            }

            System.out.println(Thread.currentThread().getName() + "-#####");
            System.out.println("Done PrinterJob: " + id);
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting Single Thread Executor");
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new PrinterJob());
        }
        executorService.shutdown();
    }
}
