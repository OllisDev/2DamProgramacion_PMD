package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_EstructuraIf_Expresion

fun main(parametros:Array<String>) {
    println("Ingresa un numero comprendido entre 1 y 99")
    val numero = readln().toInt()

    val resultado = if (numero > 0 && numero < 100) {
        println("Número de dígitos: " + numero.toString().length)
    } else {
        println("Introduzca un valor correcto")
    }
    println(resultado)
}