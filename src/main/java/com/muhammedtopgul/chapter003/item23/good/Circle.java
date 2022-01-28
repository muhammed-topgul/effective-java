package com.muhammedtopgul.chapter003.item23.good;

/**
 * @author muhammed-topgul
 * @since 28.01.2022 14:36
 */

class Circle extends Figure {
    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * (radius * radius);
    }
}
