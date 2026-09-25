package com.example.cmput_301_lab_04


class Circle(val radis: Double, override val y: Int): Shape("Circle") {

    override val x: Double
        get() = Math.PI * radis * radis
}