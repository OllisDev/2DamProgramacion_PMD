package Tema1_Kotlin.Tutorial_Kotlin.Ejercicios.EJ_EstructuraIf

fun main(parametros: Array<String>) {
    println("Introduce un número entero comprendido entre 1 y 99")
    val numero = readln().toInt()

    if (numero >= 10) {
        println("El $numero tiene dos dígitos")
    } else {
        println("El $numero tiene un dígito")
    }
}