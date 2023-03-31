package com.example.androidmaster

fun main(){

   // getTrimester(month=22)
    result(true)
}

fun getMonth(month:Int) {

    when(month) {
        1 -> println("en")
        2 -> println("feb")
        3 -> println("mr")
        4 -> println("ab")
        5 -> println("my")
        6 -> println("jn")
        7 -> println("jl")
        8 -> println("ag")
        9 -> println("sep")
        10 -> println("oct")
        11 -> println("nov")
        12 -> {
            println("dic")
            println("el mejor mes")
            println("o quizás no")
            println("pq suele hacer un frio que pela")
        }
        else -> println("no es un mes válido")
    }
}

fun getTrimester(month: Int) {

    when (month) {
        in 1..3 -> print("primer trimestre")
        2, 3, 4 -> print("segundo trimestre")
        5, 6, 7 -> print("tercer trimestre")
        10, 11, 12 -> print("cuarto trimestre")
        //else-> print("no es un mes válido") otra manera:
        !in 1..12 -> print("no es un mes válido")
    }
}

fun result(value:Any){
    when(value){
        is Int -> value + value
        is String-> println(value)
        is Boolean ->if(value) println ("holi")
    }
}




   /* if (month == 1) {
        println("enero")
    } else if (month == 2) {
        println("febrero")
    } else if (month == 3) {
        println("marzo")
    } else if (month == 4) {
        println("abril")
    } else if (month == 5) {
        println("mayo")
    } else if (month == 6) {
        println("junio")
    } else if (month == 7) {
        println("julio")
    } else if (month == 8) {
        println("agosto")
    } else if (month == 9) {
        println("septiembre")
    } else if (month == 10) {
        println("octubre")
    } else if (month == 11) {
        println("noviembre")
    } else if (month == 12) {
        println("diciembre")
    }else{
        println("el mes no existe")
    } */

