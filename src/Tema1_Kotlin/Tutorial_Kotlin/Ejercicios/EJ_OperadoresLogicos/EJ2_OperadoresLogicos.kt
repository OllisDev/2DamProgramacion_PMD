package Tema1_Kotlin.Tutorial_Kotlin.Ejercicios.EJ_OperadoresLogicos

fun main(parametros:Array<String>) {
    println("Introduce un numero")
    val num1 = readln().toInt()
    println("Introduce otro numero")
    val num2 = readln().toInt()
    println("Introduce otro numero")
    val num3 = readln().toInt()

    val cubo = num1 * num2 * num3

    if (num1 == num2 && num1 == num3 && num2 == num3) {
        println("Cubo del número: $cubo")
    } else {
        println("No se puede realiza el cubo del número, ya que los tres números no son iguales")
    }
}