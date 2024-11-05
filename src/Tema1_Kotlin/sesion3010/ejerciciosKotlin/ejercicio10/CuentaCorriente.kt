package Tema1_Kotlin.sesion3010.ejerciciosKotlin.ejercicio10

class CuentaCorriente(numCuenta: String, titular: String, Saldo: Double, var limite: Double) : Cuenta(numCuenta, titular, Saldo) {
    override fun depositar(dineroDepositado: Double) {
        Saldo = Saldo + dineroDepositado
        println("Se ha depositado $dineroDepositado en tu cuenta de corriente")
    }

    override fun retirar(dineroDepositado: Double) {
        if (Saldo + limite >= dineroDepositado) {
            Saldo = Saldo - limite
            println("Se ha retirado $dineroDepositado en tu cuenta corriente")
        } else {
            println("No se puede retirar más de lo permitido")
        }
    }

}