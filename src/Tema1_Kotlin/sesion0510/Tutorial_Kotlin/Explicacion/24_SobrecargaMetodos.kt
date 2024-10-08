package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Explicacion

// Sobrecarga de métodos en Kotlin
class Calculadora {
    // Sobrecargamos el método 'sumar' con diferentes versiones que aceptan distintos tipos de parámetros.

    // Suma dos enteros
    fun sumar(a: Int, b: Int): Int {
        return a + b
    }

    // Suma tres enteros
    fun sumar(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }

    // Suma dos números de tipo Double
    fun sumar(a: Double, b: Double): Double {
        return a + b
    }
}

fun main() {
    val calc = Calculadora()

    // Llamamos a las diferentes versiones del método 'sumar'
    println("Suma de 2 enteros: ${calc.sumar(2, 3)}")       // Resultado: 5
    println("Suma de 3 enteros: ${calc.sumar(1, 2, 3)}")   // Resultado: 6
    println("Suma de 2 dobles: ${calc.sumar(2.5, 3.5)}")   // Resultado: 6.0
}
