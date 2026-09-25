package com.example.cmput_301_lab_04

abstract class Shape(string: String) {
    abstract val x: Double
    abstract val y: Int
}


class madronaCircle: Shape() {
    override val x = 200
    override val y = 200
}

abstract class Pentagon: Shape() {
    override val x = 2020
}