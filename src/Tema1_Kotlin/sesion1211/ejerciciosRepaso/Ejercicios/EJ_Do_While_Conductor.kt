package Tema1_Kotlin.sesion1211.ejerciciosRepaso.Ejercicios

/*
EJ2: Escribe un programa que te diga si un carro de Uber puede iniciar su recorrido, para
esto se necesitan dos cosas, que el conductor esté cerca y que esté disponible, el
programa te pedirá dos valores, la distancia del conductor en kilómetros y su
disponibilidad, donde false = no disponible y true = disponible, según los datos que
insertes imprime lo siguiente:
➢ Si la distancia es menor o igual a 0.5 km y el conductor está disponible,
imprime “Listo para iniciar recorrido”
➢ Si la distancia es menor o igual a 0.5 km y el conductor NO está disponible,
imprime, “Conductor cercano, pero no disponible”
➢ Si la distancia es mayor a 0.5 km y el conductor está disponible, imprime,
“Conductor disponible pero muy lejos, aplicarán tarifas más altas”
➢ Si la distancia es mayor a 0.5 km y el conductor NO está disponible, imprime,
“No hay conductores disponibles”
➢ Usa if-else para esto
➢ Para negar una validación debes usar el símbolo !, por ejemplo if
(!isAvailable)
➢ No olvides imprimir las instrucciones antes de pedir las variables de entrada.
RETO OPCIONAL: Si no se cumplen las condiciones de “Listo para iniciar
recorrido” vuelve a pedir los datos de distancia y disponibilidad.
 */

fun main (parametros: Array<String>) {
    do {
        println("Introduce la distancia del conductor en KM")
        val distanciaConductor = readln().toDouble()
        println("¿Está disponible el conductor? true/false");
        val disponibilidadConductor = readln().toBoolean()

        if (distanciaConductor <= 0.5 && disponibilidadConductor == true) {
            println("Listo para iniciar recorrido")
        } else if (distanciaConductor <= 0.5 && disponibilidadConductor == false){
            println("Conductor cercano, pero no disponible")
        } else if (distanciaConductor > 0.5 && disponibilidadConductor == true) {
            println("Conductor disponible pero muy lejos, aplicarán tarifas más altas")
        } else if (distanciaConductor > 0.5 && disponibilidadConductor == false) {
            println("No hay conductores disponibles")
        }
    } while (distanciaConductor > 0.5 || !disponibilidadConductor == true)

}