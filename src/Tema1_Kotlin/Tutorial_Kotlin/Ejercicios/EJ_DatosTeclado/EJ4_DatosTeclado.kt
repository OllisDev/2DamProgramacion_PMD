package Tema1_Kotlin.Tutorial_Kotlin.Ejercicios.EJ_DatosTeclado

fun main(parametros:Array<String>) {
    println("Ingresa cuatros numeros enteros para poder hacer la suma y el promedio")
    val numero1 = readln().toInt()
    val numero2 = readln().toInt()
    val numero3 = readln().toInt()
    val numero4 = readln().toInt()

    val suma = numero1 + numero2 + numero3 + numero4
    println("La suma de los cuatro números es: $suma")

    val promedio = suma/4
    println("El promedio de los cuatro números es: $promedio")
}