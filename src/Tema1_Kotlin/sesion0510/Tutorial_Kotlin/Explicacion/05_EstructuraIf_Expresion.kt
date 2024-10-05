package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Explicacion

fun main (parametros: Array<String>) {
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    val mayor = if (valor1 > valor2) valor1 else valor2 //Expresion If: retornar un único valor para una única actividad permitiendo disponer mas de una instruccion por cada rama del If
    println("El mayor entre $valor1 y $valor2 es $mayor")
}