package com.basic.variables

fun main() {
    /** Kotlin variable is declared using keyword var and val **/

    /**We don't require specifying the type of variable explicitly. Kotlin complier
    knows this by initilizer expression ("Java" is a String and 30000 is an Int value). This is called type
    inference in programming. **/

    var language = "Java"
    val salary = 30000

    // We can also explicitly specify the type of variable while declaring it.
    var language2: String = "Java"
    val salary2: Int = 30000

    /** It is not necessary to initialize variable at the time of its declaration.
    Variable can be initialized later on when the program is executed. **/
    var language3: String
    //... ... ...
    language3 = "Java"
    val salary3: Int
    //... ... ...
    salary3 = 30000

    /**
    - var (Mutable variable): We can change the value of variable declared using var keyword later in the program.
    - val (Immutable variable): We cannot change the value of variable which is declared using val keyword.
     * **/

    var salary4 = 30000
    salary4 = 40000 //execute

    val language4 = "Java"
    //language4 = "Kotlin" //Error

}