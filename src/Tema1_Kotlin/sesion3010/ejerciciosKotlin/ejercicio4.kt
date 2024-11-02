package Tema1_Kotlin.sesion3010.ejerciciosKotlin

fun main(parametros: Array<String>) {
    println("Introduce tu calificación de tu examen:")
    val calificacion = readln().toDouble()

    when {
        calificacion < 5 ->  println("Suspenso")
        calificacion >= 5 && calificacion < 7 -> println("Aprobado")
        calificacion >= 7 && calificacion < 9 -> println("Notable")
        calificacion >= 9 && calificacion <= 10 -> println("Sobresaliente")
        else -> println("Introduce un valor dentro del rango")
    }
}