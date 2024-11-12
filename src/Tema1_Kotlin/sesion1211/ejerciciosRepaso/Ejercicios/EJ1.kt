package Tema1_Kotlin.sesion1211.ejerciciosRepaso.Ejercicios

/*
EJ1: Crea un programa que te pida una cantidad en miligramos para una poción
multijugos, el valor debe ser de tipo entero, si el valor es mayor a 100 imprime
“¡Felicidades, es una buena poción multijugos!”, de lo contrario imprime “La poción
es mediocre, sangre sucia inmunda”.
 */

fun main(parametros: Array<String>) {
    println("Introduce una cantidad de miligramos para crear una poción multijugos: ")
    val cantidad = readln().toInt();

    if (cantidad > 100) {
        println("¡Felicidades, es una buena poción multijugos!")
    } else {
        println("La poción es mediocre, sangre sucia inmunda.")
    }
}