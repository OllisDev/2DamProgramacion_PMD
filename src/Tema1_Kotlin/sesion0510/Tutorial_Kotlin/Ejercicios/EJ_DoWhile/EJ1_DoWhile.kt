package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_DoWhile

fun main(parametros:Array<String>) {
    var suma = 0
    do {
        //Valor acumulado
        println("Introduce un número")
        val numero = readln().toInt()
        if (numero != 9999) {
            suma += numero
        }
    } while (suma != 9999)

    println("El valor acumulado es $suma")

    //Verificacion si el numero acumulado es un 0, un numero positivo o un numero negativo
    if(suma == 0) {
        println("El valor acumulado es cero")
    } else {
        if (suma > 0) {
            println("El valor acumulado es positivo")
        } else {
            println("El valor es acumulado es negativo")
        }
    }
}