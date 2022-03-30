package com.basic.functions

var count = 0
fun rec() {
    count++;
    if (count <= 5) {
        println("hello " + count)
        rec()
    }
}

fun factorial(n: Int): Long {
    return if (n == 1) {
        n.toLong()
    } else {
        n * factorial(n - 1)
    }
}

fun main() {
    rec()

    val number = 5
    val result: Long = factorial(number)
    println("Factorial of $number = $result")
}