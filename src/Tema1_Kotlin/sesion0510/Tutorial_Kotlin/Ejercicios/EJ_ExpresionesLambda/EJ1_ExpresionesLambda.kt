package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_ExpresionesLambda

fun main(parametros: Array<String>) {
    val lista = FloatArray(10)

    for(i in lista.indices) {
        println("Introduce elemento:")
        lista[i] = readln().toFloat()
    }

    println("Listado completo del Array")
    for(elemento in lista) {
        println("$elemento")
    }
    println()
    val contador = lista.count {it < 50}
    println("Cantidad de elementod ingresados menores a 50: $contador")

    if (lista.all {it < 50}) {
        println("Todos los valores son menores a 50")
    } else {
        println("No todos los valores son menores a 50")
    }
}