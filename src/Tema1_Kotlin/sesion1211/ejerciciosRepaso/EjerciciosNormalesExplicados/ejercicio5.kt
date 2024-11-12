package Tema1_Kotlin.sesion1211.ejerciciosRepaso.EjerciciosNormalesExplicados
/*
5. Cálculo de factorial
Crea una función llamada calcularFactorial que recibe un número entero y devuelva su
factorial. Solicita al usuario que introduzca un número y muestra el resultado llamando a la
función.
 */
// Definición de la función que calcula el factorial de un número
fun calcularFactorial(numeroEntero: Int) {
    // Inicializa la variable 'factorial' en 1, que es el valor inicial para calcular el factorial
    var factorial = 1

    // Bucle 'for' que itera desde 1 hasta el número ingresado (inclusive)
    for (i in 1..numeroEntero) {
        // En cada iteración, se multiplica el valor actual de 'factorial' por 'i'
        factorial *= i
    }

    // Imprime el resultado del cálculo del factorial
    println("El factorial de $numeroEntero es $factorial")
}

// Función principal 'main' que ejecuta el programa
fun main (parametros: Array<String>) {
    // Solicita al usuario que ingrese un número
    println("Introduce un numero:")

    // Lee el número ingresado por el usuario, lo convierte a entero y lo almacena en 'num'
    val num = readln().toInt()

    // Llama a la función 'calcularFactorial' pasando el número ingresado por el usuario
    calcularFactorial(num)
}
