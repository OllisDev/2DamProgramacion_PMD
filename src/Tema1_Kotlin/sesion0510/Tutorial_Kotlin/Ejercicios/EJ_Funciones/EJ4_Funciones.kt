package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_Funciones

fun calcularMedia(num1: Float, num2: Float, num3: Float): Float {
    return (num1 + num2 + num3) / 3
}

fun main(parqmetros: Array<String>) {
    println("Introduce tres numeros decimales")
    val numero1 = readln().toFloat()
    val numero2 = readln().toFloat()
    val numero3 = readln().toFloat()

    val resultado = calcularMedia(numero1, numero2, numero3)

    println("La media de los tres numeros es: $resultado")
}