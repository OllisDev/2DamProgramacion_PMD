package Tema1_Kotlin.sesion1211.ejerciciosRepaso.EjerciciosNormalesExplicados

import kotlin.random.Random

/*
6. Juego de adivinanza de números
Diseña un juego de adivinanza de números en el que se genera un número aleatorio entre 1
y 100. Crea un juego en el que el usuario intenta adivinar el número. Después de cada
intento, da pistas de si el número es "mayor" o "menor" hasta que el usuario acierte. Usa
do/while para repetir el ciclo hasta que adivine correctamente.
 */

// Función que verifica si el número ingresado es igual al número aleatorio
fun AdivinarNumero(num: Int, numAleatorio: Int): Boolean {
    // Se usa una expresión 'when' para comparar los dos números
    return when {
        // Si el número ingresado es igual al número aleatorio
        num == numAleatorio -> {
            println("¡Has adivinado el número!") // Muestra mensaje de éxito
            true // Devuelve 'true' indicando que se ha adivinado correctamente
        }
        // Si el número ingresado es menor que el número aleatorio
        num < numAleatorio -> {
            println("Pista: el número aleatorio es mayor. Intentalo de nuevo") // Muestra pista
            false // Devuelve 'false' para continuar el juego
        }
        // Si el número ingresado es mayor que el número aleatorio
        else -> {
            println("Pista: el número aleatorio es menor. Intentalo de nuevo") // Muestra pista
            false // Devuelve 'false' para continuar el juego
        }
    }
}

// Función principal 'main' que ejecuta el juego
fun main(parametros: Array<String>) {
    // Se genera un número aleatorio entre 1 y 100
    val numAleatorio = Random.nextInt(1, 100)
    var numero: Int // Variable para almacenar el número ingresado por el usuario
    var adivinar: Boolean // Variable para saber si el usuario ha adivinado el número

    // Bucle que sigue pidiendo números hasta que se adivine el número correcto
    do {
        // Solicita al usuario que ingrese un número entre 1 y 100
        println("Introduce un número entre 1 y 100")
        numero = readln().toInt() // Lee el número ingresado por el usuario y lo convierte a entero
        // Llama a la función 'AdivinarNumero' pasando el número ingresado y el número aleatorio
        adivinar = AdivinarNumero(numero, numAleatorio)
    } while (!adivinar) // El bucle continuará mientras 'adivinar' sea falso, es decir, mientras el usuario no haya adivinado el número
}
