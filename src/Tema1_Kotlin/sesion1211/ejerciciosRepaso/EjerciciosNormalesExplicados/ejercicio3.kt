package Tema1_Kotlin.sesion1211.ejerciciosRepaso.EjerciciosNormalesExplicados
/*
3. Generador de números pares
Desarrolla un generador de números pares que solicita un número al usuario y, usando un
bucle while, muestre todos los números pares desde 0 hasta el número ingresado.
 */
fun main(parametros: Array<String>) {
    // Inicializa la variable 'x' en 0
    var x = 0

    // Solicita al usuario que ingrese un número par
    println("Introduzca un numero par:")
    // Lee el número ingresado por el usuario y lo convierte a entero
    val num = readln().toInt()

    // Inicia un bucle `while` que continuará mientras 'x' sea menor o igual al número ingresado
    while (x <= num) {
        // Imprime el valor actual de 'x'
        println(x)
        // Incrementa 'x' en 2 (de modo que solo se imprimirán los números pares)
        x = x + 2
    }
}


