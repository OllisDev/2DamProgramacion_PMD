package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_OperadoresLogicos

fun main (parametros:Array<String>) {
    println("Introduce un numero")
    val num1 = readln().toInt()
    println("Introduce otro numero")
    val num2 = readln().toInt()
    println("Introduce otro numero")
    val num3 = readln().toInt()

    if(num1 < 10 && num2 < 10 && num3 < 10) {
        println("Todos los números son menores a diez")
    } else {
        println("Todos los numeros NO son menores a diez")
    }

}