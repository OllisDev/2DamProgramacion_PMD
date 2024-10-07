package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_Funciones

fun factorial(n: Int): Int {
    return if (n == 0) 1 else n * factorial(n - 1)
}

fun main (parametros: Array<String>) {
    println("Introduce un número entero para calcular su factorial")
    val num = readln().toInt()
    val resultado = factorial(num)
    println("El factorial de $num es: $resultado")
}