package Tema1_Kotlin.Tutorial_Kotlin.Explicacion

fun main(parametros: Array<String>) {
    //Do While: bucle que permite ejecutar al menos una vez el bloque repetitivo, es decir, se utiliza cuando conocemos de antemano que por lo menos una vez se ejecutará el bloque repetitivo
    fun main(parametro: Array<String>) {
        do {
            print("Ingrese un valor comprendido entre 0 y 999:")
            val valor = readln().toInt()
            if (valor < 10)
                println("El valor ingresado tiene un dígito")
            else
                if (valor < 100)
                    println("El valor ingresado tiene dos dígitos")
                else
                    println("El valor ingresado tiene tres dígitos")
        } while (valor != 0)
    }

    // Acotaciones //

    /*
    ++ = incrementar una variable
    -- = disminuir una variable
    += = acumular
     */
}