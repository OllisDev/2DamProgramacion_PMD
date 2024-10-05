package Tema1_Kotlin.Tutorial_Kotlin.Ejercicios.EJ_While

fun main (parametros: Array<String>) {
    var empleados1 = 0
    var empleados2 = 0
    println("Cuantos empleados tiene la empresa")
    var n = readln().toInt()
    var x = 1
    var gastos = 0.0
    while (x <= n) {
        println("Introduce el sueldo del empleado")
        val sueldo = readln().toInt()
        x = x + 1

        if (sueldo >= 100 && sueldo <= 300) {
            empleados1++
        } else {
            empleados2++
        }
        gastos = gastos + sueldo
    }

    println("Numero de empleados que cobran entre 100 y 300 dolares: $empleados1")
    println("Numero de empleados que cobran más de 300 dolares: $empleados2")
    println("Gasto total de la empresa en sueldos: $gastos")
}