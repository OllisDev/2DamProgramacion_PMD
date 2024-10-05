package PMD.Kotlin.Practicas.Practica3_Kotlin

fun main (parametro: Array<String>) {
    val precio= 120.0
    val descuento = 0.20
    var precioFinal = precio - (precio * descuento)

    println("Precio original: $precio euros")
    println("Descuento: $descuento (20%)")
    println("Precio final: $precioFinal euros")


}