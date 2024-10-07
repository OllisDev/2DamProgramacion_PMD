package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_Funciones

fun sumar(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun main (parametros: Array<String>) {
    println("Introduce dos numeros enteros:")
    val num1 = readln().toInt()
    val num2 = readln().toInt()

    val resultado = sumar(num1, num2)
    println("Resultado de la suma: $resultado")
}