package ru.netology

fun main() {
    val commission = 0.0075
    val minCommission = 3500
    val amount = 100000

    val sumCommission = (if(amount * commission < minCommission) minCommission else amount * commission).toInt()
    println("комиссия составит (в копейках)\n$sumCommission")
}