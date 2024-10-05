package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Explicacion

fun main(parametros:Array<String>) {
    // Expresiones de rango //
    /*
    val rangoDigito = 1..9
     */

    //Si necesitamos conocer si un valor se encuentra dentro de un rango utilizamos el operador in
    val docena = 1..2

    if (5 in docena) {
        println("El 5 está en el rango docena")
    }

    if (18 !in docena) { // !in: distinto del rango
        println("El 18 no está en el rango docena")
    }

    // Ejemplo de for //

    for (i in 1..100) {
        println(i)
    }

    // Variantes del for //

    // step --> recibir valores del rango dependiendo del avance que queramos utilizar
    for(i in 1..10 step 2)
        println(i)

    // downTo --> recibir valores a la inversa
    for(i in 10 downTo 1)
        println(i)

    // until --> se utiliza para poder recorrer un Array
    for(x in 0 until 10)
        println(x)
}