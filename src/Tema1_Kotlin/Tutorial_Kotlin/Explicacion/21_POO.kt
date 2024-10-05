package Tema1_Kotlin.Tutorial_Kotlin.Explicacion

// Enumerado para definir los tipos de combustible
enum class TipoCombustible {
    GASOLINA, DIESEL, ELECTRICO, HIBRIDO
}

// Interfaz que define el comportamiento de cualquier vehículo conducible
// Una interfaz es un contrato que las clases deben cumplir al implementarlo.
interface Conducible {
    fun arrancar()
    fun detener()
}

// Clase base o superclase que representa un Vehículo
// Abstracción: Nos centramos solo en las características esenciales de un vehículo.
open class Vehiculo(val marca: String, val modelo: String, var velocidad: Int, val combustible: TipoCombustible) : Conducible {

    // Método que será sobrescrito (polimorfismo)
    open fun acelerar(incremento: Int) {
        velocidad += incremento
        println("El vehículo ha acelerado. Velocidad actual: $velocidad km/h")
    }

    // Método para frenar el vehículo
    fun frenar(decremento: Int) {
        if (velocidad - decremento >= 0) {
            velocidad -= decremento
        } else {
            velocidad = 0
        }
        println("El vehículo ha frenado. Velocidad actual: $velocidad km/h")
    }

    // Método para obtener una descripción del vehículo
    open fun descripcion() {
        println("Marca: $marca, Modelo: $modelo, Velocidad: $velocidad km/h, Combustible: $combustible")
    }

    // Implementación de la interfaz Conducible
    override fun arrancar() {
        println("El vehículo $marca $modelo ha arrancado.")
    }

    override fun detener() {
        println("El vehículo $marca $modelo se ha detenido.")
    }
}

// Clase Coche que hereda de Vehiculo
// Herencia: La clase Coche hereda atributos y métodos de la clase Vehiculo
class Coche(marca: String, modelo: String, velocidad: Int, combustible: TipoCombustible, val puertas: Int) : Vehiculo(marca, modelo, velocidad, combustible) {

    // Polimorfismo: Sobrescribimos el método acelerar para adaptarlo a la clase Coche
    override fun acelerar(incremento: Int) {
        super.acelerar(incremento) // Llamamos al método de la superclase
        println("El coche ha acelerado más rápido. Velocidad actual: $velocidad km/h")
    }

    // Sobrescribimos el método descripcion para añadir más información específica de Coche
    override fun descripcion() {
        super.descripcion()
        println("Número de puertas: $puertas")
    }
}

// Clase Moto que también hereda de Vehiculo
// Herencia: La clase Moto también hereda de Vehiculo
class Moto(marca: String, modelo: String, velocidad: Int, combustible: TipoCombustible, val tipo: String) : Vehiculo(marca, modelo, velocidad, combustible) {

    // Polimorfismo: Sobrescribimos el método acelerar para adaptarlo a la clase Moto
    override fun acelerar(incremento: Int) {
        super.acelerar(incremento)
        println("La moto ha acelerado. Velocidad actual: $velocidad km/h")
    }

    // Sobrescribimos el método descripcion para añadir más información específica de Moto
    override fun descripcion() {
        super.descripcion()
        println("Tipo de moto: $tipo")
    }
}

// Clase principal donde se crea el programa
fun main() {
    // Instanciación de objetos de diferentes clases usando el enumerado para tipo de combustible
    val miCoche = Coche("Toyota", "Corolla", 0, TipoCombustible.HIBRIDO, 4)
    val miMoto = Moto("Yamaha", "R1", 0, TipoCombustible.GASOLINA, "Deportiva")

    // Uso de los métodos de la interfaz Conducible
    miCoche.arrancar()
    miCoche.descripcion()
    miCoche.acelerar(50)
    miCoche.frenar(20)
    miCoche.detener()

    println("---------------------------")

    miMoto.arrancar()
    miMoto.descripcion()
    miMoto.acelerar(60)
    miMoto.frenar(30)
    miMoto.detener()
}
