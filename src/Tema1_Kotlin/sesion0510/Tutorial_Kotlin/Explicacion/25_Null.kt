package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Explicacion

fun main() {
    // Una variable que puede ser nula debe declararse con el tipo seguido de `?`
    var nombre: String? = "Juan"

    // Si intentamos acceder directamente a la variable sin comprobar si es nula, dará un error
    // println(nombre.length)  // Esto da error porque 'nombre' podría ser nulo

    // Usamos el operador de llamada segura `?.` para acceder a la propiedad solo si no es nula
    println("La longitud del nombre es: ${nombre?.length}")  // Resultado: 4

    // Podemos proporcionar un valor por defecto en caso de que la variable sea nula usando `?:`
    nombre = null
    println("Nombre: ${nombre ?: "Desconocido"}")  // Resultado: "Desconocido"

    // Otra forma de manejar nulos es usando el operador `!!`, que lanzará una excepción si el valor es nulo
    // println(nombre!!.length)  // Esto lanzará una excepción si 'nombre' es nulo
}
