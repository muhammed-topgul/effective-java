package com.muhammedtopgul.chapter002.item13;

import java.util.EmptyStackException;

/**
 * @author muhammed-topgul
 * @since 27.01.2022 14:31
 */

public class Animal implements Cloneable {

    private int[] array = new int[5];
    private int size = 0;

    private int id;
    private String breed;
    private Integer flag;

    public Animal(int id, String breed, Integer flag) {
        this.id = id;
        this.breed = breed;
        this.flag = flag;
    }

    public int[] getArray() {
        return array;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    //
    public void add(int var) {
        array[size++] = var;
    }

    public void remove() {
        if (size == 0)
            throw new EmptyStackException();
        array[--size] = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    protected Animal clone() throws CloneNotSupportedException {
        // return (Animal) super.clone();
        Animal animal = (Animal) super.clone();
        animal.array = array.clone();
        return animal;
    }
}
