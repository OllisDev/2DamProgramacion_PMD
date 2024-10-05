package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_EstructuraIf

fun main(parametros:Array<String>) {
    println("Ingresa tres notas de un alumno")
    val nota1 = readln().toFloat()
    val nota2 = readln().toFloat()
    val nota3 = readln().toFloat()

    val promedio = (nota1 + nota2 + nota3)/3

    if (promedio >= 7) {
        println("Promocionado")
    }
}