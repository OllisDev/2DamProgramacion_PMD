package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Explicacion

fun main(parametros:Array<String>) {
    //Para introducir datos por teclado y que se muestre en consola necesitamos utilizar la función readln
    print("Introduce un número")
    val num1 = readln().toInt() //Pedir al usuario que te introduzca un entero
    print("Introduce otro número")
    val num2 = readln().toInt()

    val suma = num1 + num2
    println("La suma de $num1 y $num2 es: $suma")
}