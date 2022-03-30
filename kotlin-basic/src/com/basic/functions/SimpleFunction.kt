package com.basic.functions

fun main() {
    sum()
    print("code after sum")

    val result = sum(5, 6)
    print(result)
}

fun sum() {
    var num1 = 5
    var num2 = 6
    println("sum = " + (num1 + num2))

}

fun sum(number1: Int, number2: Int): Int {
    val add = number1 + number2
    return add
}