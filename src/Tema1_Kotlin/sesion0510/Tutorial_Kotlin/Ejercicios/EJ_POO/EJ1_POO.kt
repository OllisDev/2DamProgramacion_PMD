package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_POO

open class Persona(val nombre: String, val edad: Int) {

    open fun saludar() {
        println("Hola, mi nombre es $nombre y tengo $edad años")
    }
}
fun main(parametros:Array<String>) {
    val persona = Persona("Perejildo", 25)
    persona.saludar()
}