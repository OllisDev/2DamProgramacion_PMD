package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_Colecciones

fun main(parammetros:Array<String>) {
    val lista = listOf("Iker", "Aitor", "Vinicius", "Mbappé")

    val mapList = lista.associateWith { it.length }

    println(mapList)
}