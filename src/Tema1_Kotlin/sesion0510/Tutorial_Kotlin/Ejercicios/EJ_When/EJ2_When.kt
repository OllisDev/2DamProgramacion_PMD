package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_When

fun main (parametros: Array <String>) {
    var suma = 0
    for (i in 1..5) {
        println("Introduce 3 valores enteros")
        val numero1 = readln().toInt()
        val numero2 = readln().toInt()
        val numero3 = readln().toInt()

        suma += when {
            numero1 > numero2 && numero1 > numero3 -> numero1
            numero2 > numero3 -> numero2
            else -> numero3
        }

    }
    println("El numero acumulado de los mayores de cada lista es: $suma")
}