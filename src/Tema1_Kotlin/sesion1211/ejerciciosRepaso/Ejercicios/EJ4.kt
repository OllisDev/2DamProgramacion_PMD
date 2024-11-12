package Tema1_Kotlin.sesion1211.ejerciciosRepaso.Ejercicios

/*
EJ4: Escribe un programa que imprima “¿Cómo es el clima de hoy?”, dependiendo del
número que insertes te imprima los siguientes valores
➢ 1 = “Soleado”
➢ 2 = “Nublado”
➢ 3 = “Lluvioso”
➢ 4 = “Tormentoso”
➢ 5 = “Nevado”
Si insertas cualquier otro valor debe imprimir “Pregúntale a Google”
Recomendación: Usa When.
 */

fun main(parametros: Array<String>) {
    println("¿Cómo es el clima de hoy?")
    println("1. Soleado")
    println("2. Nublado")
    println("3. Lluvioso")
    println("4. Tormentoso")
    println("5. Nevado")


    val respuesta = readln().toInt()
    println("Respuesta: $respuesta")

    when (respuesta) {
        1 -> println("Soleado")
        2 -> println("Nublado")
        3 -> println("Lluvioso")
        4 -> println("Tormentoso")
        5 -> println("Nevado")
        else -> println("Pregúntale a Google")
    }
}