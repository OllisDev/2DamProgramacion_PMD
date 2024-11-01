package Tema1_Kotlin.sesion3010.ejerciciosKotlin

fun main(parametros: Array<String>) {
    println("Introduzca su edad: ")
    val edad = readln().toInt()

    val categorias = if (edad > 1 && edad <= 9) {
        "Eres infantil"
    } else if (edad >= 10 && edad < 18) {
        "Eres adolecescente"
    }
    else if (edad >= 18 && edad < 59) {
        "Eres adulto"
    } else if (edad > 59) {
        "Eres mayor"
    }
    else {
        "Introduce un valor correcto"
    }

    println("Categoría que perteneces según tu edad: $categorias")
}