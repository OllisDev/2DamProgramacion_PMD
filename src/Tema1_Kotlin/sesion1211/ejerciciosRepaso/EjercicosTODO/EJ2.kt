package Tema1_Kotlin.sesion1211.ejerciciosRepaso.EjercicosTODO

fun filterEvens(numbers: List<Int>): List<Int> {
    // TODO: Filtra y devuelve solo los números pares de la lista
    return numbers.filter { it % 2 == 0 } // Devuelv con la lista de pares
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    println(filterEvens(numbers))  // Debería imprimir [2, 4, 6]
}
