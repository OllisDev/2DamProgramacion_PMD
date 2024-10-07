package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_Arrays

fun recibirListaEnteros(enteros:Array<Int>): Int {
    return enteros.max()
}

fun main(parametros: Array<String>) {
    val lista = arrayOf(10, 15, 2, 3, 50, 20)
    val maxEntero = recibirListaEnteros(lista)
    println(maxEntero)
}