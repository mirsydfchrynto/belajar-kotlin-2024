package app

import data.car

fun main() {
    val merek = car(paramMerk = "lamborghini")
    println(merek.merk)
    println(merek.year)
}