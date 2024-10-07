package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_When

fun main (parametros: Array<String>) {
    var trianguloEquilatero = 0
    var trianguloIsosceles = 0
    var trianguloEscaleno = 0

    println("¿Cuantos triangulos quieres?")
    val n = readln().toInt()
    for (i in 1..n ){
        println("Dime los lados del triangulo")
        val lado1 = readln().toInt()
        val lado2 = readln().toInt()
        val lado3 = readln().toInt()

        when {
            lado1 == lado2 && lado1 == lado3 -> {
                println("Es un triángulo equilatero")
                trianguloEquilatero++
            }
            lado1 == lado2 || lado1 == lado3 || lado2 == lado3 -> {
                println("Es un triángulo isósceles")
                trianguloIsosceles++
            }
            else -> {
                println("Es un triángulo escaleno")
                trianguloEscaleno++
            }
        }
    }
    println("Cantidad de triangulos equilateros: $trianguloEquilatero")
    println("Cantidad de triángulos isósceles: $trianguloIsosceles")
    println("Cantidad de triángulos escaleno: $trianguloEscaleno")
}