package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Explicacion

fun main(parametros:Array<String>) {
    // When: se utiliza para situaciones donde tenemos que verificar muchas condiciones que se resuelven con if anidados
    fun main(parametro: Array<String>) {
        print("Ingrese coordenada x del punto:")
        val x = readln().toInt()
        print("Ingrese coordenada y del punto:")
        val y = readln().toInt()
        when {
            x > 0 && y > 0 -> println("Primer cuadrate")
            x < 0 && y > 0 -> println("Segundo cuadrante")
            x < 0 && y < 0 -> println("Tercer cuadrante")
            x > 0 && y < 0 -> println("Cuarto cuadrante")
            else -> println("El punto se encuentra en un eje")
        }
    }

    // When como expresion: utilizamos when donde nos retorne un valor
        var total = 0
        for(i in 1..10) {
            print("ingrese sueldo del operario:")
            val sueldo = readln().toInt()
            total += when {
                sueldo > 5000 -> {
                    println("Sueldo alto")
                    sueldo
                }
                sueldo > 2000 -> {
                    println("Sueldo medio")
                    0
                }
                else -> {
                    println("Sueldo bajo")
                    0
                }
            }
        }
        println("Gastos totales en sueldos altos: $total")

    // When con argumento: pasar un argumento inmediatamente después del when
        print("Ingrese un valor entero entre 1 y 5:")
        val valor = readln().toInt()
        when (valor) {
            1 -> print("uno")
            2 -> print("dos")
            3 -> print("tres")
            4 -> print("cuatro")
            5 -> print("cinco")
            else -> print("valor fuera de rango")
        }
}