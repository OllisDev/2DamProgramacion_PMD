package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_Arrays

fun VerificacionElemento(enteros:Array<Int>, numero: Int): Boolean {
    return enteros.contains(numero)
}

fun main(parametros:Array<String>) {
    val lista = arrayOf(1, 2, 3, 4, 5)
    val listaVerificacion = VerificacionElemento(lista, 3)
    println(listaVerificacion)
}