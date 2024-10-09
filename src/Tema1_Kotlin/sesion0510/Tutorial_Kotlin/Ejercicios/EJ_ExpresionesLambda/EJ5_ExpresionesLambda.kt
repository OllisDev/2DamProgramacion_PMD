package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_ExpresionesLambda

fun main(parametros:Array<String>) {
   val lista = listOf("Iker", "Federico", "Alejandro", "Lucas", "Perejildo", "Arantxa")

    val filtroCadenas = lista.filter { it.length > 5}

    println(filtroCadenas)
}