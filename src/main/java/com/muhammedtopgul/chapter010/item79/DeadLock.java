package com.muhammedtopgul.chapter010.item79;

/**
 * @author muhammed-topgul
 * @since 11.02.2022 17:26
 */

public class DeadLock {

    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void main(String[] args) {
        Thread01 thread01 = new Thread01();
        Thread02 thread02 = new Thread02();

        thread01.start();
        thread02.start();
    }

    private static class Thread01 extends Thread {
        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 01: Holding lock 1...");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 01: Waiting for lock 2...");
                synchronized (lock2) {
                    System.out.println("Thread 01: Holding lock 1 & 2...");
                }
            }
        }
    }

    private static class Thread02 extends Thread {
        @Override
        public void run() {
            synchronized (lock2) {
                System.out.println("Thread 02: Holding lock 2...");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 02: Waiting for lock 1...");
                synchronized (lock1) {
                    System.out.println("Thread 02: Holding lock 1 & 2...");
                }
            }
        }
    }
}
