package com.example.androidmaster.Exercises

fun main() {
    val weekdays = arrayOf("L", "M", "X", "J", "V", "S", "D")
/*pruebas con arrays:
    println(weekdays[6])
    println(weekdays.size)
    if (weekdays.size>=8){
        println(weekdays[7])
    }else{
        println("no hay más valores en el array")
    } */

//bucles arrays

    /* si me intersa la posición:
    weekdays[0] = "Feliz Lunes!!! :)"
    for (position in weekdays.indices) {
        println(weekdays[position])
    }

    //si me interesa el valor y posición:
    for ((position, value) in weekdays.withIndex()) {
        println("La posición $position, contiene $value")
    } */

    //si solo nos interesa el valor:

    for (weekday in weekdays) {
        println("Ahora es $weekday")
    }
}
