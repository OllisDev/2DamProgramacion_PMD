package Tema1_Kotlin.sesion3010.ejerciciosKotlin.ejercicio10

class CuentaAhorros(numCuenta: String, titular: String, Saldo: Double, var TasaIntereses: Double) : Cuenta(numCuenta, titular, Saldo) {
    override fun depositar(dineroDepositado: Double) {
        Saldo = Saldo + dineroDepositado
        println("Se ha depositado $dineroDepositado en tu cuenta de ahorros")
    }

    override fun retirar(dineroDepositado: Double) {
        if ((Saldo - dineroDepositado) < 0) {
            println("Error - No se puedo retirar el dinero depositado de tu cuenta de ahorros, debido al insuficiente saldo de la cuenta")
        } else {
            Saldo = Saldo - dineroDepositado
            println("Se ha retirado $dineroDepositado en tu cuenta de ahorros")
        }
    }

    fun calcularIntereses(): Double {
        return Saldo * TasaIntereses/100
    }

    override fun mostrarSaldo() {
        super.mostrarSaldo()
        val interes = calcularIntereses()
        println("Interes acumulados: $interes")
    }


}