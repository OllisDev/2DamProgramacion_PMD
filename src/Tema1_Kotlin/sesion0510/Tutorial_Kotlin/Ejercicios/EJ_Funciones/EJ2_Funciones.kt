package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_Funciones

fun esPar(num: Int): Boolean {
    return num % 2 == 0
}

fun main (parametros: Array<String>) {
    println("Introduce un número entero")
    val numero = readln().toInt()
    if (esPar(numero)) {
        println("$numero es par")
    } else {
        println("$numero es impar")
    }
}