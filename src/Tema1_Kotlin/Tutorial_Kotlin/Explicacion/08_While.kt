package Tema1_Kotlin.Tutorial_Kotlin.Explicacion

fun main (parametros:Array<String>) {
    // While: se utiliza cuando queremos repetir más de una vez la misma instrucción hasta que la condición se compruebe como falsa
    // IMPORTANTE: Si la condición siempre retorna verdadero estamos en presencia de un ciclo repetitivo infinito. Dicha situación es un error de programación, nunca finalizará el programa.
    var x = 1
    while (x <= 100) {
        println(x)
        x = x + 1
    }
}
