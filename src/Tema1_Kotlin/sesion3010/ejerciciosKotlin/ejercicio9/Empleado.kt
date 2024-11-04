package Tema1_Kotlin.sesion3010.ejerciciosKotlin.ejercicio9

class Empleado (var nombre: String, var Edad: Int, var departamento: EDepartamentos) {
    override fun toString(): String {
        return "Empleado(nombre='$nombre', Edad=$Edad, departamento=$departamento)"
    }
}

fun listarEmpleados(): List<Empleado> {
    return listOf(
        Empleado("Iker", 19, EDepartamentos.Administracion),
        Empleado("Aitor", 21, EDepartamentos.Ventas),
        Empleado("Perejildo", 30, EDepartamentos.Produccion)
    )
}

fun filtrarEmpleados(empleados: List<Empleado>, nombre: String): List<Empleado> {
    return empleados.filter { it.nombre.equals(nombre, ignoreCase = true) } // ignoreCase: ignora las minusculas y las mayusculas
}
fun main(parametros: Array<String>) {
    println(listarEmpleados())

    val listaEmpleados = listarEmpleados()

    println("¿Quieres filtrar los empleados por departamento? y/n")
    val opcion = readln().toString()

    if (opcion == "y") {
        println("Introduce el nombre del empleado: ")
        val empleado = readln().toString()

        val empleadoFiltrado = filtrarEmpleados(listaEmpleados, empleado)

        if (empleadoFiltrado.isNotEmpty()) {
            println("Empleados encontrados: ")
            empleadoFiltrado.forEach { println(it)}
        } else {
            println("No se encontró el empleado")
        }
    } else if (opcion == "n") {
        println("Saliendo del programa...")
    } else {
        println("Opción no valida")
    }

}
