package com.basic.variables

fun main() {
    /**
     * Operators are special characters which perform operation on operands (values or variable).
     * There are various kind of operators available in Kotlin.

    - Arithmetic operator
    - Relation operator
    - Assignment operator
    - Unary operator
    - Bitwise operation
    - Logical operator
     * **/

    // Arithmetic Operator
    var a = 10;
    var b = 5;
    println(a + b);
    println(a - b);
    println(a * b);
    println(a / b);
    println(a % b);

    // Relation Operator
    a = 5
    b = 10
    val max = if (a > b) {
        println("a is greater than b.")
        a
    } else {
        println("b is greater than a.")
        b
    }
    println("max = $max")

    // Assignment operator
    var c = 20;
    var d = 5
    c += d
    println("a+=b :" + c)
    c -= d
    println("a-=b :" + c)
    c *= d
    println("a*=b :" + c)
    c /= d
    println("a/=b :" + c)
    c %= d
    println("a%=b :" + c)

    // Unary Operator
    c = 10
    d = 5
    var flag = true
    println("+a :" + +c)
    println("-b :" + -d)
    println("++a :" + ++c)
    println("--b :" + --d)
    println("!flag :" + !flag)

    // Logical Operator
    a = 10
    b = 5
    c = 15
    flag = false
    var result: Boolean
    result = (a > b) && (a > c)
    println("(a>b) && (a>c) :" + result)
    result = (a > b) || (a > c)
    println("(a>b) || (a>c) :" + result)
    result = !flag
    println("!flag :" + result)

    // Bitwise Operation
    a = 10
    b = 2

    println("a.shl(b): " + a.shl(b))
    println("a.shr(b): " + a.shr(b))
    println("a.ushr(b:) " + a.ushr(b))
    println("a.and(b): " + a.and(b))
    println("a.or(b): " + a.or(b))
    println("a.xor(b): " + a.xor(b))
    println("a.inv(): " + a.inv())


}