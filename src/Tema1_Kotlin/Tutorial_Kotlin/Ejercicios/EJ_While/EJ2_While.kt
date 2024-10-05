package Tema1_Kotlin.Tutorial_Kotlin.Ejercicios.EJ_While

fun main (parametros:Array<String>) {
    println("Introduzca cuantas alturas ingresará")
    var n = readln().toFloat()
    var x = 1
    var suma = 0.0
    while (x <= n) {
        println("Introduzca la altura de la persona")
        val altura = readln().toFloat()
        suma = suma + altura
        x = x + 1
    }
    val promedio = suma / n
    println("Promedio: $promedio")
}