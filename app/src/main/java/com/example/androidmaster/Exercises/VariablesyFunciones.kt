package com.example.androidmaster
val age:Int=30
fun main() {

    showMyName(name="Pepe")
    showMyAge()
    add(2,2)
    val mySubtrack = subtrack(10,5)
    println(mySubtrack)

}

fun showMyName(name:String) {
    println ("Me llamo $name")
}

fun showMyAge (currentAge:Int=30) {
    println ("Tengo $currentAge años")
}

fun add(firstNumber: Int, secondNumber:Int) {
   println(firstNumber+secondNumber)
}
fun subtrack(firstNumber: Int, secondNumber:Int):Int {
    return firstNumber - secondNumber
}

fun subtrackCool(firstNumber: Int, secondNumber:Int) =firstNumber - secondNumber


    /* println("Hola mundo!")

    //Diferencias entre val y var:
    //variables: la puedes modificar (val)
    //valores: no lo puedes modificar

    //Se usa camel case

    val name="Paula"
    val age: Int = 30
    val example:Long = 30
    val floatExample:Float = 30.5f
    val doubleExample:Double= 30.5
    val charExample1:Char ='e'
    val stringExample:String ="Esto es un string"
    val booleanExample:Boolean= true
    val booleanExample2:Boolean= false

    println("charExample1")

    //Android Studio sabe identificar el tipo de dato. Por ejemplo: var example =30, será int.

    var age2:Int =30
    age2=29
    println(age2)

    println("sumar:")
    println (age +age2)
       // restar -, multiplicar * dividir /, resto age%age2

    val stringExample2 ="4"
    val stringExample3="2"

    //No quiero que imprima string concatenados, quiero que sume como int:
    println (stringExample2.toInt() + stringExample3.toInt())

    val stringConcatenada= "Hola tengo $stringExample2 años"
    println (stringConcatenada)

    //Función es un contenador de operaciones */


