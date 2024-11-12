package Tema1_Kotlin.sesion1211.ejerciciosRepaso.EjercicosTODO

fun doubleNumbers(numbers: List<Int>): List<Int> {
    // TODO: Usa una expresión lambda para doblar cada número en la lista
    return numbers.map { it * 2 } // Reemplaza con la expresión lambda correcta
}

fun main() {
    val numbers = listOf(1, 2, 3, 4)
    println(doubleNumbers(numbers))  // Debería imprimir [2, 4, 6, 8]
}
