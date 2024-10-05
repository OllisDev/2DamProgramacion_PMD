package Tema1_Kotlin.Tutorial_Kotlin.Explicacion.Funciones

// Funciones con retorno de datos: devolver un dato a quién invocó la función, para ello utilizamos la expresión return

fun retornarSuperficie(lado: Int): Int {
    val sup = lado * lado
    return sup // Retornamos la variable donde hemos guardado el calculo de la superficie del cuadrado
}

fun main(parametro: Array<String>) {
    print("Ingrese el valor del lado del cuafrado:")
    val la = readln().toInt()
    val superficie = retornarSuperficie(la) // Instaciamos la funcion retornarSuperficie y le metemos el parametro de la variable del numero que nos introduzca por teclado para retornar un entero
    println("La superficie del cuadrado es $superficie")
}