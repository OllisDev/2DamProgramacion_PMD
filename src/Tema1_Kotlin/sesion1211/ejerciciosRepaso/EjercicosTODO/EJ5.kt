package Tema1_Kotlin.sesion1211.ejerciciosRepaso.EjercicosTODO

class Persona(val nombre: String, val edad: Int) {
    // TODO: Crea una función llamada `saludar` que imprima un saludo con el nombre y la edad de la persona.
    fun saludar() {
        println("Hola, soy Ana y tengo 25 años")
    }
}

fun main() {
    val persona = Persona("Ana", 25)
    persona.saludar()  // Debería imprimir "Hola, soy Ana y tengo 25 años"
}
