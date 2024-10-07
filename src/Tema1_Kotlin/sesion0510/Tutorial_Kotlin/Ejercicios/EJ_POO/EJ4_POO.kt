package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_POO

open class Animal {
    open fun hacerSonido() {
    }
}

class Perro : Animal() {
    override fun hacerSonido() {
        println("Guau")
    }
}

class Gato : Animal() {
    override fun hacerSonido() {
        println("Miau")
    }
}

fun main(parametros:Array<String>) {
    val perro : Animal = Perro()
    val gato : Animal = Gato()

    perro.hacerSonido()
    gato.hacerSonido()
}