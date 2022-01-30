package com.muhammedtopgul.chapter005.item34;

/**
 * @author muhammed-topgul
 * @since 30.01.2022 23:00
 */

public enum Operation implements Math {
    PLUS("+") {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        @Override
        public double apply(double var0, double var1) {
            return var0 - var1;
        }
    },
    TIMES("*") {
        @Override
        public double apply(double var0, double var1) {
            return var0 * var1;
        }
    },
    DIVIDE("/") {
        @Override
        public double apply(double var0, double var1) {
            return var0 / var1;
        }
    };

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public static void main(String[] args) {
       double var0 = 4;
       double var1 = 2;

        for (Operation operation : Operation.values()) {
            System.out.printf("%f %s %f = %f%n", var0, operation, var1, operation.apply(var0, var1));

        }
    }
}
