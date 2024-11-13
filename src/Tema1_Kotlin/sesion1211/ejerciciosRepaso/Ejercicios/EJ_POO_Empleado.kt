package Tema1_Kotlin.sesion1211.ejerciciosRepaso.Ejercicios

/*
Ejercicio: Sistema de Gestión de Empleados
Vamos a crear un sistema para gestionar empleados en una empresa. Definiremos una clase base Empleado y dos subclases EmpleadoTiempoCompleto y EmpleadoMedioTiempo para diferentes tipos de empleados. Cada tipo de empleado tendrá un metodo para calcular su salario mensual.

Requerimientos:

Crea una clase abstracta Empleado con las propiedades:
- nombre (String)
- salarioBase (Double) - Salario base del empleado.
- Además, incluye: Un metodo abstracto calcularSalarioMensual() para que cada tipo de empleado implemente su cálculo de salario específico.

Crea dos subclases de Empleado:
- EmpleadoTiempoCompleto, donde el salario mensual es igual al salarioBase.
- EmpleadoMedioTiempo, que incluye una propiedad adicional horasTrabajadas (Int) y una tarifa tarifaHora (Double), y donde el salario se calcula en función de las horas trabajadas.

En la función main, crea instancias de EmpleadoTiempoCompleto y EmpleadoMedioTiempo, y muestra el salario mensual de cada uno.
 */

abstract class Empleado( val nombre: String, var salarioBase: Double) {
    abstract fun calcularSalarioMensual(): Double
}

class EmpleadoTiempoCompleto(nombre: String, salarioBase: Double) : Empleado(nombre, salarioBase) {

    override fun calcularSalarioMensual(): Double {
        return  salarioBase
    }
}

class EmpleadoMedioTiempo(nombre: String, salarioBase: Double, private val horasTrabajadas: Int, private val tarifaHora: Double) : Empleado(nombre, salarioBase) {
    override fun calcularSalarioMensual(): Double {
        return horasTrabajadas * tarifaHora
    }
}

fun main() {
    val empleado1 = EmpleadoTiempoCompleto("Iker", 1050.0)
    println("Empleado Nº1")
    println("------------")
    println("Nombre: ${empleado1.nombre}")
    println("Salario base: ${empleado1.salarioBase}")
    println("Salario mensual (Empleado a tiempo completo): ${empleado1.calcularSalarioMensual()}")
    println("------------------------------------------")
    val empleado2 = EmpleadoMedioTiempo("Perejido", 0.0, horasTrabajadas = 80, tarifaHora = 15.0)
    println("Empleado Nº2")
    println("------------")
    println("Nombre: ${empleado2.nombre}")
    println("Salario mensual (Empleado a medio tiempo): ${empleado2.calcularSalarioMensual()}")
    println("------------------------------------------")
}