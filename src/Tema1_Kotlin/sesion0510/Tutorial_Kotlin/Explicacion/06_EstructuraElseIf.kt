package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Explicacion

fun main(parametros: Array<String>) {
    print("Ingrese primer nota:")
    val nota1 = readln().toInt()
    print("Ingrese segunda nota:")
    val nota2 = readln().toInt()
    print("Ingrese tercer nota:")
    val nota3 = readln().toInt()
    val promedio = (nota1 + nota2 + nota3) / 3
    if (promedio >= 7)
        print("Promocionado")
    else
        if (promedio >= 4)
            print("Regular")
        else
            print("Libre")
}
//Estryctura condicional anidada: una estructura condicional que pasa a otra estructura condicional