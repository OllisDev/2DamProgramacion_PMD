package Tema1_Kotlin.Tutorial_Kotlin.Explicacion

fun main(parametros:Array<String>) {
    //Estructura condicional simple (if)
    println("Ingresa el sueldo del empleado")
    val sueldo = readln().toFloat()

    if (sueldo > 3000) { //If: estructura condicional, si se cumple la condición pasará a la acción y si no cumple la condición, termina el programa
        println("Debe pagar impuestos")
    }

    //Estructura condicional compuesta (if-else)
    println("Ingresa un numero")
    val num1 = readln().toInt()
    println("Ingresa un segundo número")
    val num2 = readln().toInt()

    if (num1 > num2) //if-else: si se cumple la primera condición pasa por la primera acción si no pasará a la segunda acción
        println("El mayor número es $num1")
    else
        println("El mayor número es $num2")
}

    // Operadores //
    /*

    > --> mayor que
    < --> menor que
    >= --> mayor o igual que
    <= --> menor o igual que
    == --> igual que
    != --> distinto de
    + --> mas
    - --> menos
    * --> multiplicación
    / --> división
    % --> resto de la división

     */

