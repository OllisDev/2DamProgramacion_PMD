package Tema1_Kotlin.sesion3010.ejerciciosKotlin.ejercicio8

class Estudiante(var nombre: String, var nota: Double ){

    override fun toString(): String {
        return "Estudiante(nombre='$nombre', nota=$nota)"
    }

    fun actualizarNota(nuevaNota: Double) {
        if (nuevaNota in 0.0.. 10.0) {
            nota = nuevaNota
            println("La nota se ha actualizado a $nota")
        } else {
            println("La nota debe esta entre 0 y 10")
        }
    }

    fun calificacionTexto() {
        when {
            nota < 5 -> println("Suspenso")
            nota >= 5 && nota < 7 -> println("Aprobado")
            nota >= 7 && nota < 9 -> println("Notable")
            nota >= 9 && nota <= 10 -> println("Sobresaliente")
            else -> println("Introduce un valor válido")
        }
    }
}

fun main(parametros: Array<String>) {
    val notaEstudiante = Estudiante("Iker", 8.5)
    val notaEstudiante2 = Estudiante("Aitor", 4.5)
    val notaEstudiante3 = Estudiante("Perejildo", 6.0)

    println(notaEstudiante)
    notaEstudiante.calificacionTexto()
    println(notaEstudiante2)
    notaEstudiante2.calificacionTexto()
    println(notaEstudiante3)
    notaEstudiante3.calificacionTexto()

    println("¿Quiere actualizar alguna nota? y/n")
    val notas = readln().toString()
    if (notas == "y") {
        println("¿Cuál de los alumnos quiere actualizar?")
        println("1. Estudiante Iker")
        println("2. Estudiante Aitor")
        println("3. Estudiante Perejildo")

        val opcion = readln().toInt()

        when(opcion) {
            1 -> notaEstudiante.actualizarNota(7.5)
            2 -> notaEstudiante2.actualizarNota(6.5)
            3 -> notaEstudiante3.actualizarNota(5.4)
            else -> println("Introduce un valor válido")
        }
    } else if (notas == "n") {
        println("Saliendo del programa...")
    } else {
        println("Introduce un valor válido")
    }




}



