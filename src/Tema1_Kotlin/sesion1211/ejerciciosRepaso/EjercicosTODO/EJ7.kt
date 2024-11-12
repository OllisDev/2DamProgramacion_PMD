package Tema1_Kotlin.sesion1211.ejerciciosRepaso.EjercicosTODO

fun filterByLength(words: List<String>, minLength: Int): List<String> {
    // TODO: Filtra las palabras que tienen una longitud mayor o igual a `minLength`
    return words.filter { it.length >= minLength } // Reemplaza con la lista filtrada
}

fun main() {
    val words = listOf("kotlin", "es", "increíble", "y", "muy", "poderoso")
    println(filterByLength(words, 4))  // Debería imprimir ["kotlin", "increíble", "poderoso"]
}
