package com.muhammedtopgul.chapter010.item78;

import java.util.concurrent.TimeUnit;

/**
 * @author muhammed-topgul
 * @since 11.02.2022 17:16
 */

public class Test {

    public static boolean stopRequest = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            int i = 0;
            while (!stopRequest) {
                i++;
                System.out.println(i);
            }
        });
        thread.start();

        TimeUnit.SECONDS.sleep(1);

        stopRequest = true;
    }
}
