package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_DatosTeclado

fun main(parametros:Array<String>) {
    println("Ingresa cuatro números enteros para poder calcular la suma de los dos primeros y el producto del tercero y cuarto")
    val numero1 = readln().toInt()
    val numero2 = readln().toInt()
    val numero3 = readln().toInt()
    val numero4 = readln().toInt()

    val suma = numero1 + numero2
    println("El resultado de la suma es: $suma")
    val producto = numero3 * numero4
    println("El resultado del producto es: $producto")
}