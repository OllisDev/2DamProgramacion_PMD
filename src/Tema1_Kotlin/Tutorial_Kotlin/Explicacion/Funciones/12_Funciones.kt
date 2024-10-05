package Tema1_Kotlin.Tutorial_Kotlin.Explicacion.Funciones

// funciones: conjunto de instrucciones que resuelven un problema específico. Nos permitirá tener un programa más ordenado y fácil de entender y mantener
fun presentacion() {
    println("Programa que permite cargar dos valores por teclado.")
    println("Efectua la suma de los valores")
    println("Muestra el resultado de la suma")
    println("*******************************")
}

fun cargarSumar() {
    print("Ingrese el primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor:")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("La suma de los dos valores es: $suma")
}

fun finalizacion() {
    println("*******************************")
    println("Gracias por utilizar este programa")
}

fun main(parametro: Array<String>) {
    presentacion()
    cargarSumar()
    finalizacion()
}



