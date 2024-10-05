package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_While

fun main(parametros:Array<String>) {
    var x = 1
    var contador1 = 0
    var contador2 = 0
    while(x <= 10) {
        println("Introduzca la nota del alumno")
        val nota = readln().toFloat()
        if (nota >= 7) {
           contador1 = contador1 + 1
        } else {
            contador2 = contador2 + 1
        }
        x = x + 1
    }
    println("Número de alumnos con notas mayores o iguales a 7: $contador1")
    println("Número de alumnos con notas menores a 7: $contador2")
}
