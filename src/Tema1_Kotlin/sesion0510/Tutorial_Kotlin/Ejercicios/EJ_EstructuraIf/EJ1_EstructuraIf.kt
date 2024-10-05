package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_EstructuraIf

fun main(parametros:Array<String>) {
    println("Ingresa dos números enteros")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val suma = num1 + num2
    val resta = num1 - num2
    val producto = num1 * num2
    val division = num1 / num2

    if (num1 < num2) {
        println("La suma de ambos números es: $suma")
        println("La resta de ambos números es: $resta")
    } else {
        println("El producto de ambos números es: $producto")
        println("La división de ambos números es: $division")
    }
}
