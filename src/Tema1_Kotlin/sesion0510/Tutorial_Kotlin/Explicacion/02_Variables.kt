package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Explicacion

fun main(parametros: Array<String>) {
    //Tipos de variable
    /*
    val: variable inmutable, es decir, variable que no va a cambiar más a lo largo del programa
    val edad: Int = 19 //Int: numero entero
    val peso: Float = 85.6f //Float: numero decimal (después de poner el numero decimal hay que poner al final f)
    val peso2: Double = 59.4 //Double: numero decimal (más preciso que Float)
    val nombre: String = "Iker" //String: cadena de texto
    val letra: Char = 'I' //Char: un único caracter (se pone comillas simples)
    val opcion: Boolean = true //Boolean: verdadero o falso

    //var: variable mutable, es decir, variable que si puede cambiar el valor almacenado durante el programa
    var mes: Int = 1
    mes = 2
    */

    //EJ
    /*
    val num1 : Int = 10
    val num2 : Int = 15
    println("Numero 1: $num1") //$: mostrar el contenido de la variable
    println("Numero 2: $num2")
    var resultado : Int = num1 + num2
    println("Suma de los dos numeros: $resultado")
    resultado = 10 * 15
    println("Producto de los dos números: $resultado")
    */

    //CONCISO: expresar el codigo de la forma más corta y breve posible
    val num1 = 10
    val num2 = 15
    println("Numero 1: $num1")
    println("Numero 2: $num2")
    var resultado = num1 + num2
    println("Suma de los dos números: $resultado")
    resultado = 10 * 15
    println("Producto de los dos números: $resultado")
}