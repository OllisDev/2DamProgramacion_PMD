package Tema1_Kotlin.sesion1211.ejerciciosRepaso.EjerciciosNormalesExplicados
/*
4. Calificaciones de estudiantes
Realice un programa que pida al usuario una calificación entre 0 y 10. Utilice when para
clasificar la calificación en "Suspenso", "Aprobado", "Notable" o "Sobresaliente". Verifique
también que el número esté dentro del rango usando operadores lógicos.
 */
fun main(parametros: Array<String>) {
    // Solicita al usuario que ingrese la calificación de su examen
    println("Introduce tu calificación de tu examen:")
    // Lee la calificación ingresada por el usuario y la convierte a un número decimal (Double)
    val calificacion = readln().toDouble()

    // Usamos la expresión `when` para clasificar la calificación en diferentes categorías
    when {
        // Si la calificación es menor que 5, se imprime "Suspenso"
        calificacion < 5 ->  println("Suspenso")

        // Si la calificación está entre 5 (inclusive) y 7 (sin incluir), se imprime "Aprobado"
        calificacion >= 5 && calificacion < 7 -> println("Aprobado")

        // Si la calificación está entre 7 (inclusive) y 9 (sin incluir), se imprime "Notable"
        calificacion >= 7 && calificacion < 9 -> println("Notable")

        // Si la calificación está entre 9 (inclusive) y 10 (inclusive), se imprime "Sobresaliente"
        calificacion >= 9 && calificacion <= 10 -> println("Sobresaliente")

        // Si la calificación no está en el rango de 0 a 10, se imprime un mensaje de error
        else -> println("Introduce un valor dentro del rango")
    }
}
