package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_EstructuraIf_Expresion

fun main(parametro: Array<String>) {
    println("Ingresa un numero entero:")
    val num1 = readln().toInt()



    val condicion = if (num1%2 == 0) {
        println("Cuadrado: ")
        num1 * num1
    } else {
        println("Cubo: ")
        num1 * num1 * num1
    }
    println(condicion)

}