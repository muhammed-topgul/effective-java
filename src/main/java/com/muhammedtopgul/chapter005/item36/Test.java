package com.muhammedtopgul.chapter005.item36;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author muhammed-topgul
 * @since 31.01.2022 00:22
 */

public class Test {

    public enum Style {
        BOLD, ITALIC, UNDERLINE, STRIKE_THROUGH;
    }

    public void applyStyles(Set<Style> styles) {
        System.out.printf("Applying styles %s to text%n", Objects.requireNonNull(styles));
    }

    public static void main(String[] args) {
        Test test = new Test();

        test.applyStyles(EnumSet.of(Style.BOLD, Style.UNDERLINE));
    }
}
