package Tema1_Kotlin.sesion1211.ejerciciosRepaso.Ejercicios

/*
Ejercicio: Sistema de Inventario de Productos
Vamos a crear un sistema para gestionar un inventario de productos en una tienda. Tendremos una clase base Producto y subclases para diferentes tipos de productos. Cada tipo de producto tendrá propiedades específicas y un metodo para calcular el precio final, considerando posibles descuentos.

Requerimientos:

Crea una clase abstracta Producto con las propiedades:
- nombre (String)
- precio (Double)
- También incluye: un metodo abstracto calcularPrecioFinal() para que cada tipo de producto implemente el cálculo de precio específico.

Crea dos subclases de Producto:
- ProductoElectronico, que incluye una propiedad descuento (Double) para aplicar un porcentaje de descuento sobre el precio base.
- ProductoAlimenticio, que tiene una propiedad caducidadDias (Int). Si el producto tiene menos de 5 días para caducar, aplica un descuento del 20% en el precio final.

En la función main, crea instancias de ProductoElectronico y ProductoAlimenticio, y muestra el precio final de cada uno.
 */

abstract class Producto(val nombre: String, var precio: Double) {
    abstract fun calcularPrecioFinal() : Double
}

class ProductoElectronico (nombre: String, precio: Double, val descuento: Double) : Producto(nombre, precio) {
    override fun calcularPrecioFinal() : Double {
        return precio - (descuento / 100) * precio
    }
}
class ProductoAlimenticio(nombre: String, precio: Double, val caducidadDias: Int) : Producto(nombre, precio) {
    override fun calcularPrecioFinal(): Double {
        return if (caducidadDias < 5) {
            precio * 0.8
        } else {
            precio
        }
    }
}

fun main() {
    val ordenador = ProductoElectronico("ordenador", 500.55, 20.0)
    println("Ordenador")
    println("----------")
    println("Precio base: ${ordenador.precio} €")
    println("Descuento: ${ordenador.descuento}%")
    println("Precio final: ${ordenador.calcularPrecioFinal()} €")
    println("----------------------------------")
    val platano = ProductoAlimenticio("platano", 2.5, 3)
    println("Platano")
    println("-------")
    println("Precio base: ${platano.precio} €")
    println("Dias de caducidad: ${platano.caducidadDias} días")
    println("Precio final: ${platano.calcularPrecioFinal()} €")
    println("----------------------------------")
    val manzana = ProductoAlimenticio("manzana", 1.5, 6)
    println("Manzana")
    println("-------")
    println("Precio base: ${manzana.precio} €")
    println("Dias de caducidad: ${manzana.caducidadDias} días")
    println("Precio final: ${manzana.calcularPrecioFinal()} €")
    println("----------------------------------")
}
