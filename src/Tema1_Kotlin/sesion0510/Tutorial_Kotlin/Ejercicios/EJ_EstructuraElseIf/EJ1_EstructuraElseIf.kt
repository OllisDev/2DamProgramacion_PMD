package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_EstructuraElseIf

fun main(parametros:Array<String>) {
    println("Ingresa tres numeros")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()

    if (num1 > num2) {
        if (num1 > num3) {
            println(num1)
        } else {
            println(num3)
        }

    } else {
        if (num2 > num3) {
            println(num2)
        } else {
            println(num3)
        }

    }    }


