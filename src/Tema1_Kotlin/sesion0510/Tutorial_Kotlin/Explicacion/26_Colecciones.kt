package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Explicacion

fun main() {
    // Lista inmutable: No podemos modificar sus elementos
    val listaInmutable = listOf(1, 2, 3, 4)
    println("Lista inmutable: $listaInmutable")

    // Lista mutable: Podemos agregar, eliminar o modificar elementos
    val listaMutable = mutableListOf(5, 6, 7)
    listaMutable.add(8)  // Agregar un elemento
    println("Lista mutable después de agregar un elemento: $listaMutable")

    // Conjunto (Set): No permite elementos duplicados
    val conjunto = setOf(1, 2, 2, 3)
    println("Conjunto: $conjunto")  // Resultado: [1, 2, 3]

    // Mapa: Almacena pares clave-valor
    val mapa = mapOf(1 to "Uno", 2 to "Dos", 3 to "Tres")
    println("Mapa: $mapa")

    // Algunas operaciones comunes en colecciones
    val numeros = listOf(1, 2, 3, 4, 5, 6)

    // Filtrar los números pares
    val pares = numeros.filter { it % 2 == 0 }
    println("Números pares: $pares")  // Resultado: [2, 4, 6]

    // Mapear o transformar los números multiplicándolos por 2
    val multiplicados = numeros.map { it * 2 }
    println("Números multiplicados por 2: $multiplicados")  // Resultado: [2, 4, 6, 8, 10, 12]
}
