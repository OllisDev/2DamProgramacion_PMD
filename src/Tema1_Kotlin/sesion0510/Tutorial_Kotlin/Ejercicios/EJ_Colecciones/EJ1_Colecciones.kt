package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_Colecciones

fun main(parametros:Array<String>) {
    val lista = listOf(15,23,45,12,59,8,30,22)

    println(lista.sorted())
    println(lista.sortedDescending())
}