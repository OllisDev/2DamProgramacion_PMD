package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Explicacion.Funciones

fun retornarSuperficie1(lado: Int) = lado * lado // En vez de guardar en una variable y retornarlo, podemos implementar la función con un parametro en una única línea de código

fun main(parametro: Array<String>) {
    print("Ingrese el valor del lado del cuafrado:")
    val la = readln().toInt()
    println("La superficie del cuadrado es ${retornarSuperficie1(la)}") // Para llamar a la función dentro de un String o print, necesitamos encerrarlo entre llaves y anteceder el $
}