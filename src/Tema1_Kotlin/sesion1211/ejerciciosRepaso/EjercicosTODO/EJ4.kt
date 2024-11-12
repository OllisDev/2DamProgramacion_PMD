package Tema1_Kotlin.sesion1211.ejerciciosRepaso.EjercicosTODO

fun findMax(numbers: List<Int>): Int? {
    // TODO: Devuelve el número más grande de la lista o null si está vacía
    return numbers.maxOrNull() // Reemplaza con el valor máximo o null
}

fun main() {
    val numbers = listOf(10, 20, 30, 40, 50)
    println(findMax(numbers))  // Debería imprimir 50
    println(findMax(emptyList()))  // Debería imprimir null
}
