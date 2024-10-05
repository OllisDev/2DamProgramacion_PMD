package PMD.Kotlin.Practicas.Practica3_Kotlin

fun main (parametro: Array<String>) {
    println("Introduce un número")
    val numero1 = readln().toInt()
    println("Introduce otro número")
    val numero2 = readln().toInt()
    if (numero2 % numero1 == 0)
        println("$numero2 es multiplo de $numero1")
    else
        println("$numero2 no es múltimplo de $numero1")
}