package com.example.androidmaster

fun main() {
    ifBasico()
    ifAnidado()
    ifBoolean()
    ifInt()
    fMultiple()
    fMultipleOR()
}

fun ifBasico() {
    val name = "Aris"

    if (name.lowercase() =="aris") {
        println("Oye, la variable name es ARIS")
    }else {
            println("este no es ARIS")

    }
}

fun ifAnidado(){
    val animal ="dog"
    if(animal=="dog"){
        println("Es un dog")
    }else if (animal=="cat") {
        print("es un cat")
    }else if(animal=="bird"){
        println("es un bird")
    }else{
        println("no es suno de los animales esperados")
    }
}
// ! significa falso
fun ifBoolean(){
    var soyFeliz:Boolean = false
    if(!soyFeliz){
        println("estoy triste :(")
    }
}

fun ifInt(){
    var age =18
    if(age>18){
        println("bebe cerveza")
    }else{
        println("bebe zumito")
    }
}

//>=18 y permiso padres
fun fMultiple (){
    var age=18
    var permiso:Boolean=true

    if(age>=18 && permiso){
            println("puedo beber")
    }
}

fun fMultipleOR(){
    var pet = "dog"

    if(pet=="dog" || pet=="cat"){
        println("es un gato o un perro")
    }
}