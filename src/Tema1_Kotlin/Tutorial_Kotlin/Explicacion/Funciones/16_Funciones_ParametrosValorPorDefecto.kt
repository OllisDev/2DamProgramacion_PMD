package Tema1_Kotlin.Tutorial_Kotlin.Explicacion.Funciones

// Parametros por defecto: crear funciones más flexibles y que se puedan emplear en distintas circunstancias

fun tituloSubrayado(titulo: String, caracter: String = "*") {
    println(titulo)
    for(i in 1..titulo.length)
        print(caracter)
    println()
}

fun main(parametro: Array<String>) {
    tituloSubrayado("Sistema de Administracion")
    tituloSubrayado("Ventas", "-")
}