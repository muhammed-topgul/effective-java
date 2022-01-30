package com.muhammedtopgul.chapter005.item34;

/**
 * @author muhammed-topgul
 * @since 30.01.2022 23:13
 */

public enum PaymentOffice {
    MONDAY(PaymentType.WEEKDAY), TUESDAY(PaymentType.WEEKDAY), WEDNESDAY(PaymentType.WEEKDAY), THURSDAY(PaymentType.WEEKDAY), FRIDAY(PaymentType.WEEKDAY),
    SATURDAY(PaymentType.WEEKEND), SUNDAY(PaymentType.WEEKEND);

    private final PaymentType paymentType;

    PaymentOffice(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public double pay(int hour, double payRate) {
        return (hour * payRate) + paymentType.overtimePay(hour, payRate);
    }

    enum PaymentType {
        WEEKDAY {
            double overtimePay(int hour, double payRate) {
                return (hour * payRate) * 1.1;
            }
        },

        WEEKEND {
            double overtimePay(int hour, double payRate) {
                return (hour * payRate) * 1.5;
            }
        };

        abstract double overtimePay(int hour, double payRate);
    }


    public static void main(String[] args) {
        for (PaymentOffice day : values()) {
            System.out.println(day + " : " + day.pay(8, 5.85));
        }

        System.out.println(PaymentOffice.FRIDAY.pay(10, 2));
        System.out.println(PaymentOffice.SATURDAY.pay(10, 2));
    }
}
