package com.muhammedtopgul.chapter004.item32;

/**
 * @author muhammed-topgul
 * @since 30.01.2022 21:39
 */

public class VarArgs {

    public static int sum(int var0, int var1) {
        return var0 + var1;
    }

    public static int sum(int var0, int var1, int var2) {
        return sum(var0, var1) + var2;
    }

    public static int sum(int... vars) {
        if (vars.length == 0)
            return 0;

        int sum = 0;
        for (int var : vars) {
            sum += var;
        }
        System.out.println(vars[0]);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4));
        System.out.println(sum());
    }
}
