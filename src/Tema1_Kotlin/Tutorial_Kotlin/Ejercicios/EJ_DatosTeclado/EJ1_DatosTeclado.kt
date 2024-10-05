package Tema1_Kotlin.Tutorial_Kotlin.Ejercicios.EJ_DatosTeclado

fun main(parametros:Array<String>) {
    println("Introduce el numero de cm del lado de tu cuadrado")
    val ladoCuadrado = readln().toInt()

    val perimetro = ladoCuadrado * 4
    println("El perímetro del cuadrado es: $perimetro cm")
}