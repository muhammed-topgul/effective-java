package com.muhammedtopgul.chapter007.item52;

import java.util.*;

/**
 * @author muhammed-topgul
 * @since 08.02.2022 21:54
 */

public class CollectionClassifier {

    public static String classify(Set<?> set) {
        return "Set";
    }

    public static String classify(List<?> list) {
        return "List";
    }

    public static String classify(Collection<?> collection) {
        return "Collection";
    }

    public static void main(String[] args) {
        Collection<?>[] collections = {
                new HashSet<>(),
                new ArrayList<>(),
                new HashMap<String, String>().values()
        };

        for (Collection<?> collection : collections) {
            System.out.println(classify(collection));
        }

        System.out.println(classify(new HashSet<>()));
    }
}
