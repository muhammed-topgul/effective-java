package com.muhammedtopgul.chapter005.item39.reflection;

/**
 * @author muhammed-topgul
 * @since 31.01.2022 10:37
 */

public class Metallica {

    private static final int PERSON_COUNT = 4;

    private String vocalName;
    private int vocalAge;

    public Metallica() {
        this("James", 54);
    }

    public Metallica(String vocalName, int vocalAge) {
        this.vocalName = vocalName;
        this.vocalAge = vocalAge;
    }

    private void increaseAge() {
        ++vocalAge;
    }

    public static void printPersonCount() {
        System.out.println("No: " + PERSON_COUNT);
    }

    //
    public String getVocalName() {
        return vocalName;
    }

    public void setVocalName(String vocalName) {
        this.vocalName = vocalName;
    }

    public int getVocalAge() {
        return vocalAge;
    }

    public void setVocalAge(int vocalAge) {
        this.vocalAge = vocalAge;
    }

    //
    @Override
    public String toString() {
        return "Metallica{" +
                "vocalName='" + vocalName + '\'' +
                ", vocalAge=" + vocalAge +
                '}';
    }
}
