package com.muhammedtopgul.chapter008.item60;

import java.math.BigDecimal;

/**
 * @author muhammed-topgul
 * @since 09.02.2022 15:44
 */

public class Change {

    public static void main(String[] args) {
        bad();
        System.out.println();
        good();
    }

    public static void bad() {
        double funds = 1.00;
        int itemBought = 0;
        for (double price = 0.10; funds >= price; price += 0.10) {
            funds -= price;
            itemBought++;
        }

        System.out.println("Bought Items: " + itemBought);
        System.out.println("Change: $" + funds);
    }

    public static void good() {
        final BigDecimal TEN_CENTS = new BigDecimal(".10");
        int itemsBought = 0;
        BigDecimal funds = new BigDecimal("1.00");
        for (BigDecimal price = TEN_CENTS;
             funds.compareTo(price) >= 0;
             price = price.add(TEN_CENTS)) {
            funds = funds.subtract(price);
            itemsBought++;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Money left over: $" + funds);
    }
}
