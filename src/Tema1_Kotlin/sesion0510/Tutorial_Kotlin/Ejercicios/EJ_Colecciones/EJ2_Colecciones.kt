package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_Colecciones

fun main(parametros:Array<String>) {
    val lista = listOf(12,12,34,56,78,40,40,23,45)

    val numDuplicados = lista.toSet()

    println(numDuplicados)
}