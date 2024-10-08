package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_ExpresionesLambda

fun main (parametros: Array<String>) {
    println("Introduce una lista de numeros decimales")
    for (i in 1..9) {
        val listaFloat = floatArrayOf(readln().toFloat())

        listaFloat.forEach { listaFloat }
    }

}