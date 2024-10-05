package Tema1_Kotlin.Tutorial_Kotlin.Ejercicios.EJ_For

fun main(parametros: Array<String>) {
    var cantidad = 0
    println("¿Cuantos triangulos quiere calcular?")
    val n = readln().toInt()
    for (i in 1..n ){
        println("Introduce la medida de la base del triángulo:")
        val baseTriangulo = readln().toInt()
        println("Introduce la altura del triángulo:")
        val alturaTriangulo = readln().toInt()

        val superficieTriangulo = (baseTriangulo * alturaTriangulo)/2

        println("La superficie del triangulo es: $superficieTriangulo")

        if(superficieTriangulo > 12) {
            cantidad++
        }
    }

    println("La cantidad de triángulos con superficie superior a 12 son: $cantidad")

}