package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_ExpresionesLambda

fun main(parametros:Array<String>) {
   val lista = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)

    val numPares = lista.filter { it % 2 == 0 }

    println(numPares)
}