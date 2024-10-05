package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_EstructuraElseIf

fun main(parametros:Array<String>) {
    println("Ingresa un numero:")
    val num = readln().toInt()

    if (num == 0) {
        println("Se ingresó 0")

    } else {
        if (num > 0) {
            println("Se ingresó un numero positivo")
        } else {
            println("Se ingresó un número negativo")
        }
    }
}
