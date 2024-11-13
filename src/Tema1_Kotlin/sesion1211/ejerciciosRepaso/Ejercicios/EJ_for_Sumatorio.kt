package Tema1_Kotlin.sesion1211.ejerciciosRepaso.Ejercicios

/*
EJ3: Haz un ciclo for y while que obtenga la sumatoria de los números hasta n, ejemplo,
para 5 debes obtener 15 (1+2+3+4+5), para 3 debes obtener 6. Imprime el resultado
así: “La suma es 15” usando formatos de String
 */

fun main(parametros: Array<String>) {
    val n = 5
    var total = 0

    for (i in 0 .. n) {
        total += i
    }
    println("Total: $total")
}