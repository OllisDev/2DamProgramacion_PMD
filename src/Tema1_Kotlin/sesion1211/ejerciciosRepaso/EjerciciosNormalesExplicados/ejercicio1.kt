package Tema1_Kotlin.sesion1211.ejerciciosRepaso.EjerciciosNormalesExplicados
/*
1. Calculadora básica
Crea una calculadora básica que solicita al usuario dos números enteros y le permite elegir
entre las operaciones de suma, resta, multiplicación o división. Utilice estructuras
condicionales if para realizar la operación seleccionada y muestra el resultado.
 */
fun main(parametros: Array<String>) {
    // Solicita al usuario que ingrese dos números enteros
    println("Introduce dos numeros enteros:")
    val num1 = readln().toInt()  // Lee el primer número y lo convierte a entero
    val num2 = readln().toInt()  // Lee el segundo número y lo convierte a entero
    var operacion: Int  // Declara una variable para almacenar la operación elegida

    // Inicia un bucle `do-while` que continúa hasta que se seleccione una operación válida (entre 1 y 4)
    do {
        // Muestra las opciones de operación disponibles al usuario
        println("Introduce la operación que desea realizar")
        println("1. Sumar")
        println("2. Restar")
        println("3. Multiplicar")
        println("4. Dividir")

        // Lee la opción elegida y la convierte a entero
        operacion = readln().toInt()
        println("Opción: $operacion")  // Muestra la opción seleccionada

        // Condicionales para realizar la operación seleccionada
        if (operacion == 1) {
            // Si la operación es 1 (suma), suma los dos números
            val resultado = num1 + num2
            println("Resultado: $resultado")
        } else if (operacion == 2) {
            // Si la operación es 2 (resta), resta el segundo número al primero
            val resultado = num1 - num2
            println("Resultado: $resultado")
        } else if (operacion == 3) {
            // Si la operación es 3 (multiplicación), multiplica los dos números
            val resultado = num1 * num2
            println("Resultado: $resultado")
        } else if (operacion == 4) {
            // Si la operación es 4 (división), divide el primer número por el segundo
            // Nota: Esto puede producir una excepción si `num2` es 0
            val resultado = num1 / num2
            println("Resultado: $resultado")
        } else {
            // Si la operación no es ninguna de las opciones anteriores, muestra un mensaje de error
            println("Error - valor incorrecto")
        }

        // El bucle continúa si la operación seleccionada está fuera del rango válido (menor que 1 o mayor que 4)
    } while (operacion < 1 || operacion > 4)
}
