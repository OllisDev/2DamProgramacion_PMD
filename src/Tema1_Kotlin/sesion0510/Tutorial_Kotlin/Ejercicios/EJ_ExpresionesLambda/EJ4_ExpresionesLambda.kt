package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_ExpresionesLambda

fun main(parametros: Array<String>) {
    val lista = listOf(1,2,3,4,5,6,7,8,9,10)

    val suma = lista.sumOf { it }

    println(suma)
}