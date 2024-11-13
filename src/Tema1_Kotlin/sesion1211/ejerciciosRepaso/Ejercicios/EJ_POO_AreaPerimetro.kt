package Tema1_Kotlin.sesion1211.ejerciciosRepaso.Ejercicios

/*
jercicio: Sistema de Gestión de Figuras Geométricas
El objetivo es crear un sistema que gestione diferentes tipos de figuras geométricas, como círculos y rectángulos, y permita calcular su área y perímetro.

Requerimientos:

Crea una clase abstracta Figura con métodos abstractos:
- calcularArea() - Devuelve el área de la figura (Double).
- calcularPerimetro() - Devuelve el perímetro de la figura (Double).

Crea dos subclases de Figura:
- Circulo, que tiene una propiedad radio (Double).
- Rectangulo, que tiene las propiedades largo (Double) y ancho (Double).

Implementa los métodos calcularArea() y calcularPerimetro() en cada subclase:
- Para un circulo, el area es π * radio al cuadrado y el perimetro es 2 * π * radio.
- Para un rectangulo, el área es largo * ancho y el perimetro es 2 * (largo + ancho)

En la función main, rea instancias de Circulo y Rectangulo, y muestra el área y el perímetro de cada figura.
 */

abstract class Figura() {
    abstract fun calcularArea(): Double
    abstract fun calcularPerimetro(): Double
}

class Circulo (var radio: Double) : Figura() {
    override fun calcularArea(): Double {
        return 3.14 * (radio * radio)
    }

    override fun calcularPerimetro(): Double {
        return 2 * 3.14 * radio
    }
}

class Rectangulo (var largo: Double, var ancho: Double) : Figura() {
    override fun calcularArea(): Double {
        return largo * ancho
    }

    override fun calcularPerimetro(): Double {
        return 2 * (largo + ancho)
    }
}

fun main() {
    val circulo = Circulo(2.4)
    println("Circulo")
    println("-------")
    println("Radio del circulo: ${circulo.radio} cm")
    println("Área del circulo: ${circulo.calcularArea()} cm2")
    println("Perímetro del circulo: ${circulo.calcularPerimetro()} cm")
    println("---------------------------")
    val rectangulo = Rectangulo(10.0, 5.0)
    println("Rectangulo")
    println("----------")
    println("Longitud de largo del rectángulo: ${rectangulo.largo}")
    println("Longitud de ancho del rectángulo: ${rectangulo.ancho}")
    println("Area del rectangulo: ${rectangulo.calcularArea()} cm2")
    println("Perimetro del rectangulo: ${rectangulo.calcularPerimetro()} cm")

}

