package Tema1_Kotlin.sesion3010.ejerciciosKotlin.ejercicio10

abstract class Cuenta(var numCuenta: String, var titular: String, var Saldo: Double) {

    override fun toString(): String {
        return "Cuenta(numCuenta='$numCuenta', titular='$titular', Saldo=$Saldo)"
    }

    abstract fun depositar(dineroDepositado: Double)

    abstract fun retirar(dineroDepositado: Double)

    open fun mostrarSaldo() {
        println("Saldo: $Saldo")
    }


}