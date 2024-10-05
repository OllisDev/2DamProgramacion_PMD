package Tema1_Kotlin.Tutorial_Kotlin.Ejercicios.EJ_DatosTeclado

fun main(parametros:Array<String>) {
    println("Ingresa precio del articulo")
    val precio = readln().toFloat()
    println("Ingresa cantidad de ese articulo")
    val cantidad = readln().toInt()

    val abono = precio * cantidad
    println("Debe abonar lo siguiente: $abono $")
}