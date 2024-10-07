package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_POO


class Estudiante(nombre: String, edad: Int, val carrera: String) : Persona(nombre, edad) {
    override fun saludar() {
        println("Hola, mi nombre es $nombre, tengo $edad años y estudio $carrera")
    }
}

fun main(parametros:Array<String>) {
    val estudiante = Estudiante("Perejildo", 25, "DAM")
    estudiante.saludar()
}