package Tema1_Kotlin.Tutorial_Kotlin.Explicacion

fun main(parametros: Array<String>) {
    // Array: estructura de datos que se almacenan en un conjunto de datos del mismo tipo. Para poder recorrer un Array necesitamos utilizar un bucle For
    // IMPORTANTE: en programación, un array siempre empieza por la posición 0

// Declaracion tipos de dato de Array //
    /*

    ByteArray
    ShortArray
    LongArray
    FloatArray
    DoubleArray
    BooleanArray
    CharArray

     */

    val sueldos: IntArray
    sueldos = IntArray(5)
    //carga de sus elementos por teclado
    for(i in 0..4) {
        print("Ingrese sueldo:")
        sueldos[i] = readln().toInt()
    }
    //impresion de sus elementos
    for(i in 0..4) {
        println(sueldos[i])
    }
}