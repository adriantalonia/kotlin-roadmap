package com.basic.arrays

fun main() {

    // Constructor
    // Array(size: Int, init: (Int) -> T)

    var myArray1 = arrayOf(1, 10, 4, 6, 15)
    var myArray2 = arrayOf<Int>(1, 10, 4, 6, 15)
    val myArray3 = arrayOf<String>("Ajay", "Prakesh", "Michel", "John", "Sumit")
    var myArray4 = arrayOf(1, 10, 4, "Ajay", "Prakesh")

    /** functions
    intArrayOf()
    charArrayOf()
    booleanArrayOf()
    longArrayOf()
    shortArrayOf()
    byteArrayOf() */

    var myArray5: IntArray = intArrayOf(5, 10, 20, 12, 15)

    // Modify and access elements of array

    val array1 = arrayOf(1, 2, 3, 4)
    val array2 = arrayOf<Long>(11, 12, 13, 14)

    array1.set(0, 5)
    array1[2] = 6

    array2.set(2, 10)
    array2[3] = 8

    for (element in array1) {
        println(element)
    }
    println()
    for (element in array2) {
        println(element)
    }

    // array get()
    val array3 = arrayOf(1, 2, 3, 4)
    val array4 = arrayOf<Long>(11, 12, 13, 14)

    println(array3.get(0))
    println(array3[2])
    println()
    println(array4.get(2))
    println(array4[3])

    // Initialize an array of size 5 with default value as 0
    println()
    var myArray = Array<Int>(5) { 0 }

    for (element in myArray) {
        println(element)
    }

    // rewrite the value of array using its index value. Since,
    // we can able to modify the value of array, so array is called as mutable property.
    println()
    var myArrayMutable = Array<Int>(5) { 0 }

    myArrayMutable[1] = 10
    myArrayMutable[3] = 15

    for (element in myArrayMutable) {
        println(element)
    }

    // using arrayOf() and intArrayOf() function
    println()

    val name = arrayOf<String>("Ajay", "Prakesh", "Michel", "John", "Sumit")
    var myArray6 = arrayOf<Int>(1, 10, 4, 6, 15)
    var myArray7 = arrayOf(5, 10, 20, 12, 15)
    var myArray8 = arrayOf(1, 10, 4, "Ajay", "Prakesh")
    var myArray9: IntArray = intArrayOf(5, 10, 20, 12, 15)

    for (element in name) {
        println(element)
    }

    println()
    for (element in myArray6) {
        println(element)
    }
    println()
    for (element in myArray7) {
        println(element)
    }
    println()
    for (element in myArray8) {
        println(element)
    }
    println()
    for (element in myArray9) {
        println(element)
    }

    // Suppose when we try to insert an element at index position greater than array size then what will happen?
    println()

    /*var myArray10: IntArray = intArrayOf(5, 10, 20, 12, 15)

    myArray10[6] = 18 // ArrayIndexOutOfBoundsException
    for (element in myArray10) {
        println(element)
    }*/

    // The Kotlin's array elements are also traversed using index range (minValue..maxValue) or (maxValue..minValue)
    println()

    var myArray11: IntArray = intArrayOf(5, 10, 20, 12, 15)

    for (index in 0..4) {
        println(myArray11[index])
    }
    println()
    for (index in 0..myArray11.size - 1) {
        println(myArray11[index])
    }

}