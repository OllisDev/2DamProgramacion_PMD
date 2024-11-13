package Tema1_Kotlin.sesion1211.ejerciciosRepaso.Ejercicios

open class Libro (val titulo: String, autor: String,  var disponible: Boolean = true) {

}

class Usuario (val nombre: String) {
    private var librosPrestados = mutableListOf<Libro>()

    fun prestarLibro(libro: Libro) {
        if (libro.disponible) {
            libro.disponible = false
            librosPrestados.add(libro)
            println("$nombre ha tomado prestado el libro: ${libro.titulo}")
        } else {
            println("El libro no está disponible")
        }
    }

    fun devolverLibro(libro: Libro) {
        if (librosPrestados.contains(libro)) {
            libro.disponible = true
            librosPrestados.remove(libro)
            println("$nombre ha devuelto el libro: ${libro.titulo}")
        } else {
            println("$nombre no tiene prestado el libro: ${libro.titulo}")
        }
    }
}

fun main() {
    val libro1 = Libro("Kotlin para principiantes", "Juán Perez")
    val libro2 = Libro("POO Avanzado en Kotlin", "Ana García")
    val libro3 = Libro("Fundamentos de Kotlin", "Carlos Ruíz")

    val usuario1 = Usuario("Iker")

    usuario1.prestarLibro(libro1)
    usuario1.prestarLibro(libro2)

    usuario1.prestarLibro(libro1)
    usuario1.devolverLibro(libro1)

    usuario1.devolverLibro(libro3)
}