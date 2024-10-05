package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_Variables

fun main(parametros: Array<String>) {
    val peso1 = 85.8f
    val peso2 = 56.7f
    val peso3 = 103.4f

    val promedio = (peso1 + peso2 + peso3)/3

    println("Persona 1: $peso1 kg")
    println("Persona 2: $peso2 kg")
    println("Persona 3: $peso3 kg")
    println("Promedio: $promedio kg")
}