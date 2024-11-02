package Tema1_Kotlin.sesion3010.ejerciciosKotlin

import kotlin.random.Random


fun AdivinarNumero(num: Int, numAleatorio: Int): Boolean {
    return when {
        num == numAleatorio -> {
            println("¡Has adivinado el número!")
            true
        }
        num < numAleatorio -> {
            println("Pista: el número aleatorio es mayor. Intentalo de nuevo")
            false
        }
        else -> {
            println("Pista: el número aleatorio es menor. Intentalo de nuevo")
            false
        }

    }
}

fun main(parametros: Array<String>) {
    val numAleatorio = Random.nextInt(1, 100)
    var numero: Int
    var adivinar: Boolean

    do {
        println("Introduce un número entre 1 y 100")
        numero = readln().toInt()
        adivinar = AdivinarNumero(numero, numAleatorio)
    } while (!adivinar)

}