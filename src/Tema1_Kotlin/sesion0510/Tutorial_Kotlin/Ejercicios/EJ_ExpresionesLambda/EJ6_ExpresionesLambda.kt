package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_ExpresionesLambda

fun main(parametros:Array<String>) {
    val cadena = "Hola soy Iker"

    val frecuenciaLetra = cadena.filter { !it.isWhitespace() }

    println(frecuenciaLetra)
}