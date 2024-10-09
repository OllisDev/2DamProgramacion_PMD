package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_Colecciones

fun main(parametros:Array<String>) {
    val lista = listOf("Iker", "Juan", "Juanlu", "Maria", "Perejildo")

    println(lista.filter { it.startsWith("J") })
}