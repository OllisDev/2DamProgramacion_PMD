package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_Arrays

import Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_Funciones.invertirCadena

fun listaEnteros(arr:Array<Int>): Array<Int> {
    return arr.reversedArray()
}

fun main(parametros: Array<String>) {
    val arr = arrayOf(1, 2, 3, 4, 5)
    val invertido = listaEnteros(arr)
    println(invertido.joinToString(", "))
}