package Tema1_Kotlin.sesion1211.ejerciciosRepaso.Ejercicios

/*
Para un Arreglo de String de títulos de películas, imprime el título de la película con
el título más largo. Por ejemplo si tenemos un arreglo con los valores:
{“Jumanji”, “Toy Story”, “Pulp Fiction”, “Batman: El caballero de la noche”, “Kill Bill”}
Debería imprimir “Batman: El caballero de la noche”.
RETO OPCIONAL: Imprime el índice del título más largo, para el ejemplo anterior,
debería imprimir el 3, porque es el índice de “Batman: El caballero de la noche”
 */

fun main(parametros: Array <String>) {
   val listaPeliculas = arrayOf("Jumanji", "Toy Story", "Pulp Fiction", "Batman: El caballero de la noche", "Kill Bill")
    val longestTitle = listaPeliculas.maxBy { it.length }
    println(longestTitle)
}