package Tema1_Kotlin.sesion1211.ejerciciosRepaso.EjerciciosNormalesExplicados.ejercicio10
/*
10. Sistema bancario con herencia y funciones de orden superior.
Implementa un sistema bancario con herencia y funciones de orden superior. Crea una clase
abstracta Cuenta con métodos abstractos como depositar y retirar. Hereda de esta clase para
crear CuentaAhorros y CuentaCorriente con implementaciones específicas. Defina una
función de orden superior para recibir una lista de cuentas y aplique una operación (como
retirar una cantidad fija) a cada una de ellas.
 */
// Clase abstracta Cuenta con métodos abstractos 'depositar' y 'retirar'
abstract class Cuenta(var saldo: Double) {
    abstract fun depositar(cantidad: Double)
    abstract fun retirar(cantidad: Double)
}

// Clase CuentaAhorros hereda de Cuenta
class CuentaAhorros(saldoInicial: Double) : Cuenta(saldoInicial) {
    // Implementación de depositar
    override fun depositar(cantidad: Double) {
        saldo += cantidad
        println("Se ha depositado $cantidad. Saldo actual: $saldo")
    }

    // Implementación de retirar con verificación de saldo
    override fun retirar(cantidad: Double) {
        if (cantidad <= saldo) {
            saldo -= cantidad
            println("Se ha retirado $cantidad. Saldo actual: $saldo")
        } else {
            println("Saldo insuficiente para retirar $cantidad.")
        }
    }
}

// Clase CuentaCorriente hereda de Cuenta
class CuentaCorriente(saldoInicial: Double) : Cuenta(saldoInicial) {
    // Implementación de depositar
    override fun depositar(cantidad: Double) {
        saldo += cantidad
        println("Se ha depositado $cantidad. Saldo actual: $saldo")
    }

    // Implementación de retirar con verificación de saldo y comisiones
    override fun retirar(cantidad: Double) {
        val comision = 2.0  // Comisión fija por cada retiro
        if (cantidad + comision <= saldo) {
            saldo -= (cantidad + comision)
            println("Se ha retirado $cantidad con una comisión de $comision. Saldo actual: $saldo")
        } else {
            println("Saldo insuficiente para retirar $cantidad, incluyendo la comisión.")
        }
    }
}

// Función de orden superior que aplica una operación a cada cuenta
fun aplicarOperacionACuentas(cuentas: List<Cuenta>, operacion: (Cuenta) -> Unit) {
    cuentas.forEach { cuenta ->
        operacion(cuenta)
    }
}

// Función principal que crea cuentas y aplica operaciones
fun main() {
    // Crear cuentas
    val cuentaAhorros = CuentaAhorros(1000.0)
    val cuentaCorriente = CuentaCorriente(2000.0)

    // Lista de cuentas
    val cuentas = listOf<Cuenta>(cuentaAhorros, cuentaCorriente)

    // Aplicar una operación de retiro de 100 a cada cuenta
    println("Aplicando retiro de 100 a cada cuenta:")
    aplicarOperacionACuentas(cuentas) { cuenta ->
        cuenta.retirar(100.0)
    }

    // Aplicar una operación de depósito de 500 a cada cuenta
    println("\nAplicando depósito de 500 a cada cuenta:")
    aplicarOperacionACuentas(cuentas) { cuenta ->
        cuenta.depositar(500.0)
    }
}
