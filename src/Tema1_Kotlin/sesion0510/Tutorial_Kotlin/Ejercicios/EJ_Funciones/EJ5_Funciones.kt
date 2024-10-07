package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_Funciones

fun invertirCadena(cadena:String): String {
    return cadena.reversed()
}

fun main(parametros: Array<String>) {
    println("Introduce una cadena de texto")
    val cad = readln().toString()

    println(invertirCadena(cad))
}