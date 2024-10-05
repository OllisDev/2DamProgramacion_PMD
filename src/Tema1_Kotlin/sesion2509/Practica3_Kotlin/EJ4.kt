package PMD.Kotlin.Practicas.Practica3_Kotlin

fun main (parametro: Array<String>) {
    println("Introduce el salario por hora de un trabajador")
    val salarioHoraTrabajador = readln().toInt()
    println("Introduce las horas trabajadas en una semana del trabajador")
    val horasTrabajadas = readln().toInt()

    val horasNormales = if (horasTrabajadas > 40) 40 else horasTrabajadas
    val horasExtras = if (horasTrabajadas >40) horasTrabajadas -40 else 0

    val salarioBase = horasNormales * salarioHoraTrabajador
    val salarioHorasExtras = horasExtras * salarioHoraTrabajador * 1.5
    val salarioTotal = salarioBase + salarioHorasExtras

    println("Salario base: $salarioBase")
    println("Salario por horas extras: $salarioHorasExtras")
    println("Salario total: $salarioTotal")
}