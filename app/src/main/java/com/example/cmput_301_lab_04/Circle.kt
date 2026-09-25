package com.example.cmput_301_lab_04


class Circle(val radius: Double, override val y: Int): Shape("Circle") {

    override val x: Double
        get() = Math.PI * radius * radius
}