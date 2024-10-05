package PMD.Kotlin.Practicas.Practica3_Kotlin

fun main (patametro: Array<String>) {
    println ("Introduce un numero entero")
    var numero = readln().toInt()

    if (numero > 0)
        println("$numero es positivo.")
    else if (numero < 0)
        println("$numero es negativo.")
    else
        println("$numero es 0.")
}