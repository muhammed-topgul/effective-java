package com.muhammedtopgul.chapter005.item37;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

/**
 * @author muhammed-topgul
 * @since 31.01.2022 09:45
 */

class Plant {
    enum LifeCycle {ANNUAL, PERENNIAL, BIENNIAL}

    final String name;
    final LifeCycle lifeCycle;

    Plant(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Plant[] garden = {
                new Plant("Basil", LifeCycle.ANNUAL),
                new Plant("Carroway", LifeCycle.BIENNIAL),
                new Plant("Dill", LifeCycle.ANNUAL),
                new Plant("Lavendar", LifeCycle.PERENNIAL),
        };


        // Using ordinal() to index into an array - DON'T DO THIS!
        @SuppressWarnings("unchecked")
        Set<Plant>[] plantsByLifeCycle = (Set<Plant>[]) new Set[Plant.LifeCycle.values().length];

        for (int i = 0; i < plantsByLifeCycle.length; i++)
            plantsByLifeCycle[i] = new HashSet<>();

        for (Plant plant : garden)
            plantsByLifeCycle[plant.lifeCycle.ordinal()].add(plant);

        // Print the results
        for (int i = 0; i < plantsByLifeCycle.length; i++) {
            System.out.printf("%s: %s%n", Plant.LifeCycle.values()[i], plantsByLifeCycle[i]);
        }


        System.out.println("\n\n");

        // Using an EnumMap to associate data with an enum
        Map<LifeCycle, Set<Plant>> plantsByLifeCycleMap = new EnumMap<>(Plant.LifeCycle.class);
        for (Plant.LifeCycle lifeCycle : Plant.LifeCycle.values())
            plantsByLifeCycleMap.put(lifeCycle, new HashSet<>());

        for (Plant plant : garden)
            plantsByLifeCycleMap.get(plant.lifeCycle).add(plant);
        System.out.println(plantsByLifeCycleMap);


        System.out.println();

        System.out.println(Arrays.stream(garden).collect(groupingBy(p -> p.lifeCycle)));
        System.out.println(Arrays.stream(garden).collect(groupingBy(p -> p.lifeCycle, () -> new EnumMap<>(LifeCycle.class), toSet())));
    }
}