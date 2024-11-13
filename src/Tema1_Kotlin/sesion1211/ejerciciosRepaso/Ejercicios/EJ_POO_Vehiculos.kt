package Tema1_Kotlin.sesion1211.ejerciciosRepaso.Ejercicios

/*
Ejercicio: Sistema de Gestión de Vehículos
En este ejercicio, vamos a crear un sistema para gestionar una flota de vehículos. Definiremos una clase base Vehiculo y subclases para diferentes tipos de vehículos, como Auto y Moto. Simularemos el funcionamiento de arranque y parada de cada tipo de vehículo.

Requerimientos:

Crea una clase abstracta Vehiculo con las propiedades:
marca (String)
modelo (String)
encendido (Boolean) - Indica si el vehículo está encendido o apagado.

Define métodos en la clase Vehiculo:
arrancar() - Cambia el estado a encendido si el vehículo está apagado.
apagar() - Cambia el estado a apagado si el vehículo está encendido.

Crea dos subclases de Vehiculo:
Auto - Representa un coche, y tiene una propiedad adicional cantidadPuertas (Int).
Moto - Representa una motocicleta, y tiene una propiedad adicional cilindrada (Int) que indica la capacidad del motor.

En la función main, crea instancias de Auto y Moto, y simula el arranque y apagado de cada uno.
 */

abstract class Vehiculo(val marca: String, val modelo: String) {
    var encendido = false
  fun arrancar() {
      if(!encendido) {
          encendido = true
          println("El vehículo se ha encendido")
      } else {
          println("El vehículo no se puede encender, ya que esta encendido")
      }
  }

  fun apagado() {
      if(encendido) {
          encendido = false
          println("El vehiculo se ha apagado")
      } else {
          println("El vehiculo no se puede apagar, ya que esta apagado")
      }
  }

    abstract fun mostrarInfo()
}

class Auto (marca: String, modelo: String, var cantidadPuertas: Int) : Vehiculo(marca, modelo) {
    override fun mostrarInfo() {
        println("Auto: $marca $modelo con $cantidadPuertas puertas")
    }
}

class Moto (marca: String, modelo: String, var cilindrada: Int) : Vehiculo(marca, modelo) {
    override fun mostrarInfo() {
        println("Moto: $marca $modelo con $cilindrada cc de cilindrada")
    }
}

fun main() {
   val auto1 = Auto("Audi", "A8",4)
    auto1.mostrarInfo()
    val moto1 = Moto("Yamaha", "YZF-R3", 321)
    moto1.mostrarInfo()

    auto1.arrancar()
    auto1.arrancar()
    moto1.apagado()
    moto1.apagado()

    moto1.arrancar()
    moto1.apagado()
}
