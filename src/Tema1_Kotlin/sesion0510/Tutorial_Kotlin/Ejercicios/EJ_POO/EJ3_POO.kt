package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Ejercicios.EJ_POO

class CuentaBancaria (private var saldo: Double, private val titular: String) {

    fun depositar(cantidad: Double) {
        if (cantidad > 0) {
            saldo += cantidad
            println("Se han depositado $cantidad. Saldo actual: $saldo$")
        } else {
            println("Cantidad inválida para depositar")
        }
    }

    fun retirar(cantidad: Double) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad
            println("Se han retirado $cantidad. Saldo actual: $saldo$")
        }
        else {
            println("Fondos insuficientes o cantidad inválida")
        }
    }

    fun consultarSaldo() {
        println("Este es su saldo actual: $saldo")
    }

}

fun main(parametros: Array<String>) {
    val cuenta = CuentaBancaria(5000.0, "Perejildo")
    cuenta.consultarSaldo()
    cuenta.depositar(500.0)
    cuenta.retirar(200.0)
    cuenta.retirar(6000.0)
}