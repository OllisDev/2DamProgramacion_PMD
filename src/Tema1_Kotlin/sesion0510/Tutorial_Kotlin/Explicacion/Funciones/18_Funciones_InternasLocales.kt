package PMD.Kotlin.Practicas.Tutorial.Explicacion.Funciones

fun multiplos2y5() {
    fun multiplo(numero: Int, valor: Int) = numero % valor == 0

    var mult2 = 0
    var mult5 = 0
    for(i in 1..10) {
        print("Ingrese valor:")
        val valor = readln().toInt()
        if (multiplo(valor, 2))
            mult2++
        if (multiplo(valor, 5))
            mult5++
    }
    println("Cantidad de múltiplos de 2 : $mult2")
    println("Cantidad de múltiplos de 5 : $mult5")
}

fun main(parametro: Array<String>) {
    multiplos2y5()
}

/*
En este problema hemos definido una función llamada multiplos2y5 que tiene por objetivo cargar 10 enteros por teclado y verificar cuantos son múltiplos de 2 y cuantos múltiplos de 5.

Para verificar si un número es múltiplo de otro definimos una función local llamada "multiplo", la misma retorna true si el resto de dividir el primer parámetro con respecto al segundo es cero (Ej. 10 % 2 == 0 retorna true ya que el resto de dividir 10 con respecto a 2 es 0)

A una función interna solo la podemos llamar desde la misma función donde se la define, es decir la función multiplo solo puede ser llamada dentro de la función multiplos2y5. Si desde la función main tratamos de llamar a la función multiplo se genera un error en tiempo de compilación.
 */