package com.basic.controlflow

fun main() {

    // Traditional if Statement
    var condation = true

    if (condation) {
        //code statement
    }

    if (condation) {
        //code statement
    } else {
        //code statement
    }

    // Kotlin if-else Expression

    val returnValue = if (condation) {
        //code statement
        println("if")
        1
    } else {
        // code statement
        println("else")
        2
    }
    println(returnValue)

    //example 2
    var num1 = 10
    var num2 = 20
    val result = if (num1 > num2) {
        "$num1 is greater than $num2"
    } else {
        "$num1 is smaller than $num2"
    }
    println(result)

    //example 3
    val result2 = if (num1 > num2) "$num1 is greater than $num2" else "$num1 is smaller than $num2"
    println(result2)

    // Kotlin if-else if-else Ladder Expression
    val num = 10
    val result3 = if (num > 0) {
        "$num is positive"
    } else if (num < 0) {
        "$num is negative"
    } else {
        "$num is zero"
    }
    println(result3)

    // Kotlin Nested if Expression
    num1 = 25
    num2 = 20
    var num3 = 30
    val result4 = if (num1 > num2) {

        val max = if (num1 > num3) {
            num1
        } else {
            num3
        }
        "body of if " + max
    } else if (num2 > num3) {
        "body of else if" + num2
    } else {
        "body of else " + num3
    }
    println("$result4")


}