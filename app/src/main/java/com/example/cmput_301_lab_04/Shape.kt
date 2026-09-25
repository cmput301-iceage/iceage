package com.example.cmput_301_lab_04

abstract class Shape {
    abstract val x: Int
    abstract val y: Int
}

class madronaCircle: Shape() {
    override val x = 200
    override val y = 200
}