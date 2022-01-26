package com.muhammedtopgul.chapter001.item03;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 13:37
 */

public class Test {

    public static void main(String[] args) {

//        Runnable thread1 = () -> {
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException exception) {
//                exception.printStackTrace();
//            }
//
//            System.out.println("HashCode of Lazy: " + LazyCache.getInstance().hashCode());
//            System.out.println("HashCode of Eager: " + EagerCache.getInstance().hashCode());
//            System.out.println("HashCode of Enum: " + EnumCache.INSTANCE.hashCode());
//        };
//
//        Runnable thread2 = () -> {
//            System.out.println("HashCode of Lazy: " + LazyCache.getInstance().hashCode());
//            System.out.println("HashCode of Eager: " + EagerCache.getInstance().hashCode());
//            System.out.println("HashCode of Enum: " + EnumCache.INSTANCE.hashCode());
//        };
//
//        thread1.run();
//        thread2.run();

        new Thread(() -> {
            try {
                Thread.sleep(1);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }

            System.out.println("HashCode of Lazy: " + LazyCache.getInstance().hashCode());
            System.out.println("HashCode of Eager: " + EagerCache.getInstance().hashCode());
            System.out.println("HashCode of Enum: " + EnumCache.INSTANCE.hashCode());
        }).start();

        new Thread(() -> {
            System.out.println("HashCode of Lazy: " + LazyCache.getInstance().hashCode());
            System.out.println("HashCode of Eager: " + EagerCache.getInstance().hashCode());
            System.out.println("HashCode of Enum: " + EnumCache.INSTANCE.hashCode());
        }).start();
    }
}
