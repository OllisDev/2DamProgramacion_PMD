package Tema1_Kotlin.sesion1211.ejerciciosRepaso.EjerciciosNormalesExplicados
/*
2. Clasificación por edades
Escribe un programa que pida al usuario su edad y clasifique la edad en las categorías de
"Infantil", "Adolescente", "Adulto" o "Mayor" usando if como expresión. Muestra el grupo
de edad correspondiente.
 */

fun main(parametros: Array<String>) {
    // Solicita al usuario que ingrese su edad
    println("Introduzca su edad: ")
    val edad = readln().toInt()  // Lee la edad ingresada por el usuario y la convierte a entero

    // Usamos una estructura `if-else` para clasificar la edad en categorías
    val categorias = if (edad > 1 && edad <= 9) {
        // Si la edad está entre 1 y 9 años, se clasifica como infantil
        "Eres infantil"
    } else if (edad >= 10 && edad < 18) {
        // Si la edad está entre 10 y 17 años, se clasifica como adolescente
        "Eres adolecescente"
    } else if (edad >= 18 && edad < 59) {
        // Si la edad está entre 18 y 58 años, se clasifica como adulto
        "Eres adulto"
    } else if (edad > 59) {
        // Si la edad es mayor a 59 años, se clasifica como mayor
        "Eres mayor"
    } else {
        // Si la edad es menor o igual a 0, se muestra un mensaje pidiendo un valor correcto
        "Introduce un valor correcto"
    }

    // Muestra en consola la categoría correspondiente según la edad ingresada
    println("Categoría que perteneces según tu edad: $categorias")
}
