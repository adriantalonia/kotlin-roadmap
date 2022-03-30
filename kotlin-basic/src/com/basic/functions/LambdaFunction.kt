package com.basic.functions

fun addNumber(a: Int, b: Int) {
    val add = a + b
    println(add)
}

fun addNumber2(a: Int, b: Int, mylambda: (Int) -> Unit ){   //high level function lambda as parameter
    val add = a + b
    mylambda(add) // println(add)
}

fun main() {
    addNumber(5, 10)

    // { variable -> body_of_function}
    val myLambda: (Int) -> Unit= {s: Int -> println(s) } //lambda function
    addNumber2(5,10,myLambda)
}