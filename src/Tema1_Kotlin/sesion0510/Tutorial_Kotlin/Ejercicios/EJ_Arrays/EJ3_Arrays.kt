package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_Arrays

fun SumaEnteros(enteros:Array<Int>): Int {
    return enteros.sum()
}

fun main(parametros:Array<String>) {
    val lista = arrayOf(10, 15, 20, 25)
    val sumaLista = SumaEnteros(lista)
    println(sumaLista)
}