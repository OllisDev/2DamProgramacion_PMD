package Tema1_Kotlin.Tutorial_Kotlin.Explicacion.Funciones

// Parametros de una funcion: comunicar algo a la funcion para hacerla más flexible.

fun mostrarMensaje(mensaje: String) {
    println("*************************************************")
    println(mensaje)
    println("*************************************************")
}

fun cargarSumar1() {
    print("Ingrese el primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor:")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("La suma de los dos valores es: $suma")
}

fun main(parametro: Array<String>) {
    mostrarMensaje("El programa calcula la suma de dos valores ingresados por teclado.")
    cargarSumar1()
    mostrarMensaje("Gracias por utilizar este programa")
}