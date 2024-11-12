package Tema1_Kotlin.sesion1211.ejerciciosRepaso.Ejercicios

/*
EJERCICIO RETO SUPER SAYAYÍN NIVEL ULTRA INSTINCT: Escribe un
programa que para un número N, imprima los números pares desde 1 hasta N, por
ejemplo si N = 6, debe imprimir “2, 4, 6”. Hazlo con un for o un while. Si el número es
menor o igual a 0, debes imprimir “Inserta un número positivo”
TIP: Para saber si un número es par, debes obtener el residuo de ese número al ser
dividido entre 2, si el residuo es 0, entonces el número es par. Por ejemplo si quieres
saber si 4 es par, divides 4/2 = 2 y te sobran 0, entonces 4 es par, en cambio para
5/2 = 2 y sobra 1, entonces es impar, para obtener el residuo de una división en Java
puedes utilizar %, ejemplo: 4 % 2 = 0 y 5 % 2 = 1.
 */

fun main(parametros: Array<String>) {
    println("Introduce un numero entero: ")
    val n = readln().toInt()
    if (n == 0) {
        println("Inserta un numero positivo y entero")
    } else {
        for (i in 1 ..n ) {
            if (i % 2 == 0) {
                println(i)
            }
        }
    }

}