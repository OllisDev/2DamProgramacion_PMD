package Tema1_Kotlin.sesion1211.ejerciciosRepaso.EjerciciosNormalesExplicados.ejercicio8
/*
8. Gestión de notas con clases
Crea un sistema de gestión de notas con clases. Defina una clase Estudiante con propiedades
como nombre y nota. Agrega métodos para actualizar la nota y obtener la calificación como
texto. Crea varios objetos de esta clase y muestra los nombres y las calificaciones de cada
estudiante.
 */
// Definición de la clase Estudiante
class Estudiante(var nombre: String, var nota: Double ) {

    // Sobrescritura del método toString() para representar al estudiante como una cadena
    override fun toString(): String {
        return "Estudiante(nombre='$nombre', nota=$nota)"
    }

    // Mwtodo para actualizar la nota de un estudiante
    fun actualizarNota(nuevaNota: Double) {
        // Se comprueba si la nueva nota está en el rango válido de 0 a 10
        if (nuevaNota in 0.0..10.0) {
            nota = nuevaNota
            println("La nota se ha actualizado a $nota")
        } else {
            // Si la nota no está en el rango válido, se muestra un mensaje de error
            println("La nota debe estar entre 0 y 10")
        }
    }

    // Metodo para mostrar la calificación del estudiante según su nota
    fun calificacionTexto() {
        // Usamos un bloque `when` para determinar el estado de la calificación del estudiante
        when {
            nota < 5 -> println("Suspenso") // Si la nota es menor que 5, el estudiante está suspenso
            nota >= 5 && nota < 7 -> println("Aprobado") // Si la nota está entre 5 y 7, el estudiante está aprobado
            nota >= 7 && nota < 9 -> println("Notable") // Si la nota está entre 7 y 9, el estudiante tiene un notable
            nota >= 9 && nota <= 10 -> println("Sobresaliente") // Si la nota es entre 9 y 10, el estudiante tiene un sobresaliente
            else -> println("Introduce un valor válido") // Si la nota es fuera de este rango (por error), muestra este mensaje
        }
    }
}

// Función principal que gestiona la interacción con el usuario
fun main(parametros: Array<String>) {
    // Creación de tres objetos Estudiante con nombre y nota inicial
    val notaEstudiante = Estudiante("Iker", 8.5)
    val notaEstudiante2 = Estudiante("Aitor", 4.5)
    val notaEstudiante3 = Estudiante("Perejildo", 6.0)

    // Muestra la información de los estudiantes y su calificación
    println(notaEstudiante)
    notaEstudiante.calificacionTexto()

    println(notaEstudiante2)
    notaEstudiante2.calificacionTexto()

    println(notaEstudiante3)
    notaEstudiante3.calificacionTexto()

    // Pregunta al usuario si quiere actualizar alguna nota
    println("¿Quiere actualizar alguna nota? y/n")
    val notas = readln().toString() // Lee la respuesta del usuario

    // Si el usuario responde 'y' (sí), se procede a actualizar la nota
    if (notas == "y") {
        // Pregunta a qué estudiante quiere actualizar la nota
        println("¿Cuál de los alumnos quiere actualizar?")
        println("1. Estudiante Iker")
        println("2. Estudiante Aitor")
        println("3. Estudiante Perejildo")

        val opcion = readln().toInt() // Lee la opción seleccionada por el usuario

        // Dependiendo de la opción seleccionada, se actualiza la nota del estudiante correspondiente
        when(opcion) {
            1 -> notaEstudiante.actualizarNota(7.5) // Actualiza la nota de Iker
            2 -> notaEstudiante2.actualizarNota(6.5) // Actualiza la nota de Aitor
            3 -> notaEstudiante3.actualizarNota(5.4) // Actualiza la nota de Perejildo
            else -> println("Introduce un valor válido") // Si la opción no es válida, se muestra un mensaje de error
        }
    } else if (notas == "n") {
        // Si el usuario responde 'n' (no), se termina el programa
        println("Saliendo del programa...")
    } else {
        // Si la respuesta no es 'y' ni 'n', se muestra un mensaje de error
        println("Introduce un valor válido")
    }
}




