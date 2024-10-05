package Tema1_Kotlin.Tutorial_Kotlin.Ejercicios.EJ_OperadoresLogicos

fun main(parametros:Array<String>) {
    println("Introduce una fecha cualquiera del año")
    val dia = readln().toInt()
    val mes = readln().toInt()
    val ano = readln().toInt()
    println("Fecha: $dia-$mes-$ano")

    if(dia == 25 && mes == 12) {
        println("Es navidad")
    } else {
        println("No es navidad")
    }
}