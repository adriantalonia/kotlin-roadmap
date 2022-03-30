package com.basic.functions

tailrec fun recursiveSum(n: Long, semiresult: Long = 0): Long {
    return if (n <= 0) {
        semiresult
    } else {
        recursiveSum((n - 1), n + semiresult)
    }
}

tailrec fun factorial2(n: Int, run: Int = 1): Long {
    return if (n == 1) {
        run.toLong()
    } else {
        factorial2(n - 1, run * n)
    }
}

fun main() {
    var number = 100000.toLong()
    var result = recursiveSum(number)
    println("sun of upto $number number = $result")


    var number2 = 4
    result = factorial2(number2)
    println("Factorial of $number2 = $result")
}