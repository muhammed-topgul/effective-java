package com.muhammedtopgul.chapter005.item39.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author muhammed-topgul
 * @since 31.01.2022 10:44
 */

public class Test {

    public static void main(String[] args) {
        try {
            Class<?> metallica = Class.forName("com.muhammedtopgul.chapter005.item39.reflection.Metallica");
            Object object = metallica.getDeclaredConstructor().newInstance();

            Constructor<?> constructor = metallica.getDeclaredConstructor(String.class, Integer.TYPE);

            space();

            for (Field declaredField : metallica.getDeclaredFields()) {
                System.out.println("Field: " + declaredField.getName());
            }

            space();

            int modifiers = constructor.getModifiers();
            System.out.println("Modifiers: " + modifiers);
            System.out.println("Modifier: " + Modifier.toString(modifiers));

            space();

            System.out.println("Name: " + constructor.getName());
            System.out.println("Accessible: " + constructor.isAccessible());
            System.out.println("Synthetic: " + constructor.isSynthetic());
            System.out.println("VarArgs: " + constructor.isVarArgs());


            space();

            Method setVocalAge = metallica.getMethod("setVocalAge", Integer.TYPE);
            setVocalAge.invoke(object, 25);

            Method getVocalAge = metallica.getMethod("getVocalAge");
            System.out.println("Age: " + getVocalAge.invoke(object));

            Method printPersonCount = metallica.getMethod("printPersonCount");
            printPersonCount.invoke(null);

            // getDeclaredMethod for all access modifiers
            Method increaseAge = metallica.getDeclaredMethod("increaseAge");
            increaseAge.setAccessible(true);
            increaseAge.invoke(object);
            System.out.println("Age: " + getVocalAge.invoke(object));


            Method toString = metallica.getMethod("toString");
            String response = (String) toString.invoke(object);
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void space() {
        System.out.println("\n");
    }
}
