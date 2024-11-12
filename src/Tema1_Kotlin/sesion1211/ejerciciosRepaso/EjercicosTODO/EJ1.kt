package Tema1_Kotlin.sesion1211.ejerciciosRepaso.EjercicosTODO

fun calculate(a: Int, b: Int, operation: String): Int {
    // TODO: Realiza la operación correspondiente según el valor de `operation`.

    // Usa when para las operaciones: suma, resta, multiplicación, división.
   return when (operation) { // Reemplaza con el resultado correcto
        "suma" -> a + b
        "resta" -> a - b
        "multiplica" -> a * b
        "divide" -> if (b != 0) a / b else 0
        else -> throw IllegalArgumentException("Operación no valida")
    }

}

fun main() {
    println(calculate(10, 5, "suma"))        // Debería imprimir 15
    println(calculate(10, 5, "resta"))       // Debería imprimir 5
    println(calculate(10, 5, "multiplica"))  // Debería imprimir 50
    println(calculate(10, 5, "divide"))      // Debería imprimir 2
}
