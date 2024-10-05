package Tema1_Kotlin.Tutorial_Kotlin.Ejercicios.EJ_OperadoresLogicos

fun main(parametros:Array<String>) {
    println("Introduce un numero")
    val num1 = readln().toInt()
    println("Introduce otro numero")
    val num2 = readln().toInt()
    println("Introduce otro numero")
    val num3 = readln().toInt()

    if (num1 < 10 || num2 < 10 || num3 < 10) {
        println("Alguno de los números es menor a diez")
    } else {
        println("Ningún número es menor a diez")
    }
}