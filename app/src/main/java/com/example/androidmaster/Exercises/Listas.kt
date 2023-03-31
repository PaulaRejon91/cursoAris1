package com.example.androidmaster.Exercises

fun main() {

    mutableList()

}

fun mutableList() {
    val weekdays: MutableList<String> = mutableListOf("L", "M", "X", "J", "V", "S", "D")
    weekdays.add(0, "paulaDay")
    println(weekdays)

    if (weekdays.isEmpty()) {
        //no hay que pintar nada porque no hay.
    }else{
    weekdays.forEach{ println(it)}

        if (weekdays.isNotEmpty()){
            weekdays.forEach{println(it)}

            }
        weekdays.last()
        }
}


/*fun inmutableList(){
    val readOnly: List <String> = listOf("L", "M", "X", "J", "V", "S", "D")*/

/* //Recorrer lista (iterar) Lista inmutable:
readOnly.forEach {weekday -> println(weekday)}*/
/* it es cada uno de los valores en su posición
//Tamaño:
    println("este es el tamaño de la lista:  "  + readOnly.size)
    println(readOnly.toString())
//Filtrar:
    val example = readOnly.filter { it.contains("L") }
    println(example) */