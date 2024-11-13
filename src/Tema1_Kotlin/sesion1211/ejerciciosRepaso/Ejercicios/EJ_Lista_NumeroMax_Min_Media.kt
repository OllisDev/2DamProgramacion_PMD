package Tema1_Kotlin.sesion1211.ejerciciosRepaso.Ejercicios

/*
Crea una lista de números enteros y encuentra el número máximo, el mínimo y la media de los elementos.
 */

fun main() {
   val listaEnteros = intArrayOf(10,12,3,24,1,21,4,56,87,13)
   println(listaEnteros.max())
   println(listaEnteros.min())
   println(listaEnteros.average())
}