package Tema1_Kotlin.sesion1211.ejerciciosRepaso.EjerciciosNormalesExplicados.ejercicio9
/*
9. Sistema de clasificación de empleados
Escribe un sistema de clasificación de empleados que define una data class llamada
Empleado con propiedades como nombre, edad y departamento. Crea un enum class para
los departamentos, como "Administración", "Ventas" y "Producción". Organiza una lista de
empleados en una List y permite al usuario filtrar empleados por departamento.
 */
// Definición de la clase 'Empleado'
class Empleado(var nombre: String, var Edad: Int, var departamento: EDepartamentos) {
    // Sobrescritura del método 'toString()' para personalizar la representación del objeto Empleado
    override fun toString(): String {
        return "Empleado(nombre='$nombre', Edad=$Edad, departamento=$departamento)"
    }
}

// Función que devuelve una lista de empleados
fun listarEmpleados(): List<Empleado> {
    // Crea y devuelve una lista de empleados con diferentes departamentos
    return listOf(
        Empleado("Iker", 19, EDepartamentos.Administracion),
        Empleado("Aitor", 21, EDepartamentos.Ventas),
        Empleado("Perejildo", 30, EDepartamentos.Produccion)
    )
}

// Función para filtrar empleados según su nombre
fun filtrarEmpleados(empleados: List<Empleado>, nombre: String): List<Empleado> {
    // Filtra la lista de empleados, buscando el nombre dado (ignorando mayúsculas/minúsculas)
    return empleados.filter { it.nombre.equals(nombre, ignoreCase = true) }
}

// Función principal
fun main(parametros: Array<String>) {
    // Imprime todos los empleados
    println(listarEmpleados())

    // Guarda la lista de empleados en una variable para usar más tarde
    val listaEmpleados = listarEmpleados()

    // Pregunta al usuario si quiere filtrar los empleados por nombre
    println("¿Quieres filtrar los empleados por nombre? y/n")
    val opcion = readln().toString() // Lee la opción del usuario

    // Si el usuario responde "y", filtra la lista de empleados por nombre
    if (opcion == "y") {
        println("Introduce el nombre del empleado: ")
        val empleado = readln().toString() // Lee el nombre del empleado a filtrar

        // Llama a la función para filtrar los empleados por nombre
        val empleadoFiltrado = filtrarEmpleados(listaEmpleados, empleado)

        // Si la lista filtrada no está vacía, muestra los empleados encontrados
        if (empleadoFiltrado.isNotEmpty()) {
            println("Empleados encontrados: ")
            empleadoFiltrado.forEach { println(it) }
        } else {
            // Si no se encuentra ningún empleado, muestra un mensaje indicando que no se encontró
            println("No se encontró el empleado")
        }
    } else if (opcion == "n") {
        // Si el usuario responde "n", muestra un mensaje de salida
        println("Saliendo del programa...")
    } else {
        // Si el usuario ingresa una opción no válida, muestra un mensaje de error
        println("Opción no valida")
    }
}