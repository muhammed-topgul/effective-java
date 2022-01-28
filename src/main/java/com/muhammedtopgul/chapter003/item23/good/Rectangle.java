package com.muhammedtopgul.chapter003.item23.good;

/**
 * @author muhammed-topgul
 * @since 28.01.2022 14:36
 */

class Rectangle extends Figure {
    final double length;
    final double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
