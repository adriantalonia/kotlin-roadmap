package com.basic.functions

inline fun inlineFunction(myFun: () -> Unit) {
    myFun()
    print("code inside inline function")
}

inline fun inlineFunction2(myFun: () -> Unit, nxtFun: () -> Unit) {
    myFun()
    nxtFun()
    print("code inside inline function2")
}

inline fun inlineFunction3(crossline myFun: () -> Unit, nxtFun: () -> Unit) {
    myFun()
    nxtFun()
    print("code inside inline function")
}

inline fun inlineFunctionExample4(myFun: () -> Unit, noinline nxtFun: () -> Unit  ) {
    myFun()
    nxtFun()
    println("code inside inline function")
}


fun main(args: Array<String>) {
    inlineFunction({ println("calling inline functions") })

    inlineFunction2({
        println("calling inline functions2")
        return
    }, { println("next parameter in inline functions2") })

    inlineFunction3({ println("calling inline functions")
        return // compile time error
    },{ println("next parameter in inline functions")})

    inlineFunctionExample4({  println("calling inline functions")},
        {  println("next parameter in inline functions")} )

    println("this is main function closing")

}