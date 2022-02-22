package com.basic.variables

fun main() {
    /**
     * n Kotlin, conversion is done by explicit in which smaller data type is converted into
     * larger data type and vice-versa. This is done by using helper function.
     * **/

    //var value1 = 10
    //val value2: Long = value1  //Compile error, type mismatch

    var value1 = 10
    val value2: Long = value1.toLong()

    /**
     * The list of helper functions used for numeric conversion in Kotlin is given below:

    toByte()
    toShort()
    toInt()
    toLong()
    toFloat()
    toDouble()
    toChar()
     * **/

    var value3 = 100
    val value4: Long =value3.toLong()


    var value5: Long = 200
    val value6: Int =value5.toInt()
}