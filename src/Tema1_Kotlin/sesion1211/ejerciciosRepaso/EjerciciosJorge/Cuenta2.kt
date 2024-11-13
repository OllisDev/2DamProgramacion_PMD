package Tema1_Kotlin.sesion1211.ejerciciosRepaso.EjerciciosJorge
/*
Declarar una clase abstracta Cuenta y dos subclases CajaAhorra y PlazoFijo. Definir las propiedades y métodos comunes entre una caja de ahorro y un plazo fijo y agruparlos en la clase Cuenta.
Una caja de ahorro y un plazo fijo tienen un nombre de titular y un monto. Un plazo fijo añade un plazo de imposición en días y una tasa de interés. Hacer que la caja de ahorro no genera intereses.
En la función main del programa definir un objeto de la clase CajaAhorro y otro de la clase PlazoFijo
 */
// Declaramos una clase abstracta llamada 'Cuenta' que será la clase base para 'CajaAhorro' y 'PlazoFijo'.
abstract class Cuenta(val titular: String, var monto: Double) {

    // Metodo abstracto que se implementará en cada subclase.
    // Este metodo calculará el monto final, permitiendo personalizar el cálculo en las subclases.
    abstract fun calcularMontoFinal(): Double
}

// Subclase 'CajaAhorro' que hereda de 'Cuenta'.
// Representa una cuenta de ahorro sin intereses.
class CajaAhorro(titular: String, monto: Double) : Cuenta(titular, monto) {

    // Implementación del método abstracto 'calcularMontoFinal'.
    // Como esta cuenta no genera intereses, simplemente devuelve el monto actual.
    override fun calcularMontoFinal(): Double {
        return monto
    }
}

// Subclase 'PlazoFijo' que hereda de 'Cuenta'.
// Representa una cuenta a plazo fijo que incluye un plazo de imposición y una tasa de interés.
class PlazoFijo(titular: String, monto: Double, val plazo: Int, val tasaInteres: Double) : Cuenta(titular, monto) {

    // Implementación del metodo abstracto 'calcularMontoFinal'.
    // Calcula el monto final aplicando el interés sobre el monto original.
    override fun calcularMontoFinal(): Double {
        return monto + (monto * tasaInteres * plazo / 36500)
        // Fórmula simple de interés: monto + (monto * tasa * plazo / 36500).
        // Dividimos entre 36500 para adaptar la tasa anual a los días del plazo.
    }
}

// Función principal del programa.
fun main() {
    // Creamos una instancia de 'CajaAhorro' y mostramos su monto final.
    val cajaAhorro = CajaAhorro("Juan Perez", 1000.0)
    println("Monto final en Caja de Ahorro: ${cajaAhorro.calcularMontoFinal()}")

    // Creamos una instancia de 'PlazoFijo' con plazo de 30 días y tasa de interés de 5%.
    val plazoFijo = PlazoFijo("Ana García", 1000.0, 30, 5.0)
    println("Monto final en Plazo Fijo: ${plazoFijo.calcularMontoFinal()}")
}
