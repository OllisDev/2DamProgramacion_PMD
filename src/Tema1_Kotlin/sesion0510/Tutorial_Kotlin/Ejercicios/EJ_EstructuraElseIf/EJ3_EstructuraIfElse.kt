package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_EstructuraElseIf

fun main(parametros:Array<String>) {
    println("Introduce la cantidad de preguntas que has realizado")
    val preguntasRealizadas = readln().toFloat()
    println("Introduce la cantidad de preguntas que has contestado correctamente")
    val preguntasCorrectas = readln().toFloat()
    val porcentaje: Float = (preguntasCorrectas / preguntasRealizadas) * 100
    println("Porcentaje: $porcentaje")

    if (porcentaje < 90) {
        if (porcentaje >= 75 && porcentaje < 90) {
            println("Nivel medio")
        } else {
            if (porcentaje >= 50 && porcentaje < 75) {
                println("Nivel regular")
            } else {
                println("Fuera de nivel")
            }
        }
    } else {
        println("Nivel máximo")
    }
}