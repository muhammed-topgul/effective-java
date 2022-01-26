package com.muhammedtopgul.chapter001.item07;

/**
 * @author muhammed-topgul
 * @since 26.01.2022 17:18
 */

public class GarbageCollection {

    @Override
    protected void finalize() {
        System.out.println("finalized...");
    }

    public static void main(String[] args) {
        GarbageCollection garbage1 = new GarbageCollection();
        GarbageCollection garbage2 = new GarbageCollection();
        GarbageCollection garbage3 = new GarbageCollection();

        garbage1 = null;

        garbage2 = garbage3;

        System.gc();
    }
}
