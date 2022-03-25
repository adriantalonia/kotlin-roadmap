package com.basic.controlflow

fun main() {

    val marks = arrayOf(80, 85, 60, 90, 70)
    for (item in marks) {
        println(item)
    }

    // If the body of for loop contains only one single line of statement, it is not necessary to enclose within curly braces {}.
    for (item in marks)
        println(item)

    // The elements of an array are iterated on the basis of indices (index) of array. For example:
    for (item in marks.indices)
        println("marks[$item]: " + marks[item])

    // Iterate through range
    print("for (i in 1..5) print(i) = ")
    for (i in 1..5) print(i)
    println()
    print("for (i in 5..1) print(i) = ")
    for (i in 5..1) print(i)             // prints nothing
    println()
    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) print(i)
    println()
    print("for (i in 5 downTo 2) print(i) = ")
    for (i in 5 downTo 2) print(i)
    println()
    print("for (i in 1..5 step 2) print(i) = ")
    for (i in 1..5 step 2) print(i)
    println()
    print("for (i in 5 downTo 1 step 2) print(i) = ")
    for (i in 5 downTo 1 step 2) print(i)

}