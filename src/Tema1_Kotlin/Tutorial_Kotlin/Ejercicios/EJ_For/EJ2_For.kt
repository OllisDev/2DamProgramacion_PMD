package Tema1_Kotlin.Tutorial_Kotlin.Ejercicios.EJ_For

fun main(parametros:Array<String>) {
    var numeros = 10
    var suma = 0
    for(i in 1..numeros) {
        println("Introduce un numero: ")
        val num = readln().toInt()

        if (i > 5) {
            suma += num
        }
    }
    println("La suma de los últimos 5 números es: $suma")
}