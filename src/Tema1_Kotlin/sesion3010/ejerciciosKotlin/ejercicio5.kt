package Tema1_Kotlin.sesion3010.ejerciciosKotlin

fun calcularFactorial(numeroEntero: Int) {
    var factorial = 1
    for (i in 1..numeroEntero) {
        factorial *= i
    }
    println("El factorial de $numeroEntero es $factorial")
}

fun main (parametros: Array<String>) {
    println("Introduce un numero:")
    val num = readln().toInt()
    calcularFactorial(num)
}