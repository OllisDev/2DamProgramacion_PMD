package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Explicacion

// Ejemplo de función de extensión en Kotlin
// Vamos a agregar una función a la clase String para contar las vocales en una cadena.

fun String.contarVocales(): Int {
    // La función cuenta cuántas vocales hay en la cadena.
    val vocales = "aeiouAEIOU"
    return this.count { it in vocales }
}

fun main() {
    // Usamos la nueva función de extensión en una cadena
    val texto = "Hola Mundo"
    println("El texto '$texto' tiene ${texto.contarVocales()} vocales.")  // Resultado: 4
}
