package Tema1_Kotlin.sesion1211.ejerciciosRepaso.Ejercicios

/*
Escribe una función que reciba un número entero y devuelva true si es un número primo, o false en caso contrario.
 */

fun devolverNumeroPrimo(numero: Int) : Boolean {
    if (numero <= 1 ) return false
        for( i in 2 until numero) {
            if (numero % i == 0) return false
        }
    return true
}

fun main() {
    val num = 13
    println("¿$num es primo? ${devolverNumeroPrimo(num)}")
}
