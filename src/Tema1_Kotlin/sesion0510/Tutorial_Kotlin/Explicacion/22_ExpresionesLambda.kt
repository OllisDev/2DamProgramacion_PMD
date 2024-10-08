package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Explicacion

fun main() {
    // Expresión lambda básica
    // Una expresión lambda es una función anónima que puedes almacenar en una variable
    val saludo = { println("Hola desde una expresión lambda") }
    saludo()  // Llamamos a la lambda como si fuera una función regular

    // Expresión lambda con parámetros
    // La lambda recibe dos parámetros (a y b) y retorna su suma
    val sumar = { a: Int, b: Int -> a + b }
    println("Suma de 3 y 5: ${sumar(3, 5)}")  // Resultado: 8

    // Expresión lambda con un solo parámetro usando 'it'
    // Si la lambda tiene un solo parámetro, no es necesario declararlo, se puede usar 'it'
    val duplicar = { it: Int -> it * 2 }
    println("Duplicar 4: ${duplicar(4)}")  // Resultado: 8

    // Lambda aplicada a un Array
    // Creamos un array y usamos una lambda con la función 'forEach' para iterar sobre sus elementos
    val numeros = arrayOf(1, 2, 3, 4, 5)

    // forEach aplica la lambda a cada elemento del array
    numeros.forEach { numero -> println("Número: $numero") }

    // Lambda que transforma los elementos de un Array
    // Usamos 'map' para aplicar una transformación a cada elemento y generar un nuevo Array
    val numerosMultiplicados = numeros.map { it * 3 }  // Multiplicamos cada número por 3
    println("Números multiplicados por 3: $numerosMultiplicados")

    // Acceso a variables externas en una lambda
    // Las lambdas pueden acceder a variables definidas fuera de su contexto
    val factor = 5  // Variable externa a la lambda

    // Esta lambda usa 'factor', aunque la variable no está definida dentro de la lambda
    val multiplicarConFactor = { numero: Int -> numero * factor }
    println("Multiplicar 4 por el factor $factor: ${multiplicarConFactor(4)}")  // Resultado: 20

    // Ejemplo práctico con un array y acceso a variable externa
    val resultadosConFactor = numeros.map { it * factor }
    println("Array multiplicado por el factor $factor: $resultadosConFactor")
}
