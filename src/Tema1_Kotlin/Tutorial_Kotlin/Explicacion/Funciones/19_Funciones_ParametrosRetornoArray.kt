package Tema1_Kotlin.Tutorial_Kotlin.Explicacion.Funciones


fun cargar(arreglo: IntArray) {
    for(i in arreglo.indices) {
        print("Ingrese elemento:")
        arreglo[i] = readln().toInt()
    }
}

fun imprimir(arreglo: IntArray) {
    for(elemento in arreglo)
        println(elemento)
}

fun main(parametro: Array<String>) {
    val arre = IntArray(5)
    cargar(arre)
    imprimir(arre)
}

// Los parametros de una funcion pueden ser de tipo Int, Char, Float, etc. Tambien pueden ser de tipo Array