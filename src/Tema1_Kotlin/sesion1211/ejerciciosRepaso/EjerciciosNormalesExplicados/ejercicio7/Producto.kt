package Tema1_Kotlin.sesion1211.ejerciciosRepaso.EjerciciosNormalesExplicados.ejercicio7
/*
7. Administración de inventario
Desarrolla un programa de administración de inventario donde se cree una lista de
productos. Escribe una función que permita añadir, eliminar o modificar elementos del
inventario. Solicita al usuario que elija una operación y muestre el inventario actualizado.
 */
// Definición de la clase Producto que tiene tres propiedades: nombre, precio y idProducto
class Producto(val nombre: String, var precio: Double, val idProducto: Int) {

    // Sobrescritura del metodo toString() para imprimir información detallada del producto
    override fun toString(): String {
        return "Producto(nombre='$nombre', precio=$precio, idProducto=$idProducto)"
    }
}

// Definición de la clase Inventario
class Inventario {

    // Lista mutable para almacenar los productos en el inventario
    private val productos = mutableListOf<Producto>()

    // Metodo para añadir un producto al inventario
    fun anadirElemento(producto: Producto) {
        productos.add(producto)
    }

    // Metodo para eliminar un producto del inventario por su ID
    fun eliminarElemento(idProducto: Int) {
        productos.removeIf { it.idProducto == idProducto} // Elimina el producto si su ID coincide
    }

    // Metodo para modificar el precio de un producto en el inventario por su ID
    fun modificarElemento(idProducto: Int, nuevoPrecio: Double) {
        // Busca el producto en la lista usando el ID
        val producto = productos.find { it.idProducto == idProducto}

        // Si el producto existe, se actualiza su precio
        if (producto != null) {
            producto.precio = nuevoPrecio
        }
    }

    // Metodo para mostrar todos los productos del inventario
    fun mostrarInventario() {
        // Se imprime cada producto del inventario usando el metodo toString() sobrescrito
        productos.forEach { println(it)}
    }
}

// Función principal que controla la interacción con el usuario
fun main(Parametros: Array<String>) {
    // Se crea un objeto Inventario para gestionar los productos
    val inventario = Inventario()
    var opcion: Int // Variable para almacenar la opción seleccionada por el usuario

    // Bucle que permite al usuario interactuar con el menú hasta que seleccione la opción de salir
    do {
        // Muestra el menú de opciones
        println("¡Bienvenido a mi inventario!")
        println("Elige una opción: ")
        println("1. Añadir producto")
        println("2. Eliminar producto")
        println("3. Modificar producto")
        println("4. Mostrar inventario")
        println("5. Salir")

        // Lee la opción ingresada por el usuario y la convierte a un número entero
        opcion = readln()?.toIntOrNull() ?: 0 // Si la entrada no es válida, se asigna 0

        // Dependiendo de la opción, se realiza una acción
        when (opcion) {
            // Opción 1: Añadir un producto
            1 -> {
                // Solicita los datos del producto (nombre, precio e ID)
                print("Ingrese el nombre del producto: ")
                val nombre = readLine() ?: "" // Lee el nombre del producto
                print("Ingrese el precio del producto: ")
                val precio = readLine()?.toDoubleOrNull() ?: 0.0 // Lee el precio del producto
                print("Ingrese el ID del producto: ")
                val idProducto = readLine()?.toIntOrNull() ?: 0 // Lee el ID del producto

                // Crea un nuevo producto y lo añade al inventario
                inventario.anadirElemento(Producto(nombre, precio, idProducto))
                println("Producto añadido.")
            }

            // Opción 2: Eliminar un producto
            2 -> {
                // Solicita el ID del producto a eliminar
                print("Ingrese el ID del producto a eliminar: ")
                val idProducto = readLine()?.toIntOrNull() ?: 0 // Lee el ID del producto
                // Elimina el producto con el ID ingresado
                inventario.eliminarElemento(idProducto)
                println("Producto eliminado.")
            }

            // Opción 3: Modificar un producto
            3 -> {
                // Solicita el ID del producto a modificar
                print("Ingrese el ID del producto a modificar: ")
                val idProducto = readLine()?.toIntOrNull() ?: 0 // Lee el ID del producto
                // Solicita el nuevo precio del producto
                print("Ingrese el nuevo precio del producto: ")
                val nuevoPrecio = readLine()?.toDoubleOrNull() ?: 0.0 // Lee el nuevo precio

                // Modifica el precio del producto con el ID ingresado
                inventario.modificarElemento(idProducto, nuevoPrecio)
                println("Producto modificado.")
            }

            // Opción 4: Mostrar el inventario
            4 -> {
                // Muestra todos los productos del inventario
                println("--- Inventario Actual ---")
                inventario.mostrarInventario()
            }

            // Opción 5: Salir del programa
            5 -> println("Saliendo del programa.")

            // Si el usuario ingresa una opción inválida
            else -> println("Opción inválida, por favor intente nuevamente.")
        }
    } while (opcion != 5) // El bucle sigue ejecutándose hasta que el usuario seleccione la opción 5 (salir)
}
