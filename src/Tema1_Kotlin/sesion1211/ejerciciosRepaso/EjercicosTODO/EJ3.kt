package Tema1_Kotlin.sesion1211.ejerciciosRepaso.EjercicosTODO

fun convertTemperature(value: Double, unit: String): Double {
    // Usa la fórmula (C * 9/5) + 32 para Celsius a Fahrenheit.
    val calculoF = (value * 9/5) + 32
    // Usa la fórmula (F - 32) * 5/9 para Fahrenheit a Celsius.
    val calculoC = (value - 32) * 5/9

// TODO: Convierte `value` de Celsius a Fahrenheit o viceversa según `unit`.
    if (unit == "CtoF") {
       return calculoF // Reemplaza con el valor convertido
    } else if (unit == "FtoC") {
       return calculoC // Reemplaza con el valor convertido
    } else {
       return throw IllegalArgumentException("Unidad desconocida")// Reemplaza con el valor convertido
    }
}

fun main() {
    println(convertTemperature(0.0, "CtoF"))   // Debería imprimir 32.0
    println(convertTemperature(32.0, "FtoC"))  // Debería imprimir 0.0
}
