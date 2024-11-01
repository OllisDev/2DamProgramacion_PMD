package Tema1_Kotlin.sesion3010.ejerciciosKotlin

fun main(parametros: Array<String>) {
    var x = 0
    println("Introduzca un numero par:")
    val num = readln().toInt()

    while (x <= num) {
        println(x)
        x = x + 2
      }
    }

