package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_When

fun main(parametros: Array<String>) {
    println("Introduce un numero entero")
    val num = readln().toInt()

    when {
        num < 0 -> println("$num es negativo")
        num > 0 -> println("$num es positivo")
        num == 0 -> println("$num es neutro")
    }
}