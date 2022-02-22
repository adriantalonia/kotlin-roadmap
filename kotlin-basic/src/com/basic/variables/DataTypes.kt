package com.basic.variables

fun main() {
    //n Kotlin, everything is an object, which means we can call member function and properties on any variable.

    /** Kotlin built in data type are categorized as following different categories:

    - Number
    - Character
    - Boolean
    - Array
    - String **/

    // Number
    val oneByte: Byte = 1
    val short: Short = 12
    val int: Int = 10
    val pi = 3.14 // Double
    val one: Double = 1.0
    val e = 2.7182818284 // Double
    val eFloat = 2.7182818284f // Float, actual value is 2.7182817

    // Character (Char) Data Type
    val value1 = 'A'
    //or
    val value2: Char
    value2 = 'A'

    // Boolean Data Types
    val flag = true
    val anotherFLag: Boolean
    anotherFLag = false

    // Array
    val id = arrayOf(1, 2, 3, 4, 5)
    val firstId = id[0]
    val lasted = id[id.size - 1]

    // Creating Array using Array() constructor
    /**
     * First argument as a size of array, and
    Second argument as the function, which is used to initialize and return the value of array element given its index.
     * **/
    val asc = Array(5, { i -> i * 2 }) //asc[0,2,4,6,8]

    // String
    val text = "Hello, java"
    val text2: String = "Hello, java2"
    // Escaped String
    val text3 = "Hello, JavaTpoint"
    //or
    val text4 = "Hello, JavaTpoint\n"
    //or
    val text5 = "Hello, \nJavaTpoint"

    // Raw String:
    val text6 ="""  
             Welcome   
                 To  
           JavaTpoint  
    """


}