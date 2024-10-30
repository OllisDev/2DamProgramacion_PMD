package Tema1_Kotlin.sesion3010.ejerciciosKotlin

fun main(parametros:Array<String>) {
    println("Introduce dos numeros enteros:")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    var operacion: Int


    do {
        println("Introduce la operación que desea realizar")
        println("1. Sumar")
        println("2. Restar")
        println("3. Multiplicar")
        println("4. Dividir")

        operacion = readln().toInt()
        println("Opción: $operacion")


        if (operacion == 1) {
            val resultado = num1 + num2
            println("Resultado: $resultado")
        } else if (operacion == 2) {
            val resultado = num1 - num2
            println("Resultado: $resultado")
        } else if (operacion == 3) {
            val resultado = num1 * num2
            println("Resultado: $resultado")
        } else if (operacion == 4) {
            val resultado = num1 / num2
            println("Resultado: $resultado")
        } else {
            println("Error - valor incorrecto")
        }
    } while(operacion < 1 || operacion > 4)

}