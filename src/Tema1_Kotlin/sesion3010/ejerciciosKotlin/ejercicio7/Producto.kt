package Tema1_Kotlin.sesion3010.ejerciciosKotlin.ejercicio7

class Producto(val nombre: String, var precio: Double, val idProducto: Int) {


    // Metodo toString()
    override fun toString(): String {
        return "Producto(nombre='$nombre', precio=$precio, idProducto=$idProducto)"
    }
}

class Inventario {

    private val productos = mutableListOf<Producto>()

    fun anadirElemento(producto: Producto) {
        productos.add(producto)
    }

    fun eliminarElemento(idProducto: Int) {
        productos.removeIf { it.idProducto == idProducto}
    }

    fun modificarElemento (idProducto: Int, nuevoPrecio: Double) {
        val producto = productos.find { it.idProducto == idProducto}

        if (producto != null) {
            producto.precio = nuevoPrecio
        }
    }

    fun mostrarInventario() {
        productos.forEach { println(it)}
    }
}



fun main(Parametros: Array<String>) {
    val inventario = Inventario()
    var opcion: Int

    do {
        println("¡Bienvenido a mi inventario!")
        println("Elige una opción: ")
        println("1. Añadir producto")
        println("2. Eliminar producto")
        println("3. Modificar producto")
        println("4. Mostrar inventario")
        println("5. Salir")

        opcion = readln()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> {
                print("Ingrese el nombre del producto: ")
                val nombre = readLine() ?: ""
                print("Ingrese el precio del producto: ")
                val precio = readLine()?.toDoubleOrNull() ?: 0.0
                print("Ingrese el ID del producto: ")
                val idProducto = readLine()?.toIntOrNull() ?: 0

                inventario.anadirElemento(Producto(nombre, precio, idProducto))
                println("Producto añadido.")
            }

            2 -> {
                print("Ingrese el ID del producto a eliminar: ")
                val idProducto = readLine()?.toIntOrNull() ?: 0
                inventario.eliminarElemento(idProducto)
                println("Producto eliminado.")
            }

            3 -> {
                print("Ingrese el ID del producto a modificar: ")
                val idProducto = readLine()?.toIntOrNull() ?: 0
                print("Ingrese el nuevo precio del producto: ")
                val nuevoPrecio = readLine()?.toDoubleOrNull() ?: 0.0

                inventario.modificarElemento(idProducto, nuevoPrecio)
                println("Producto modificado.")
            }

            4 -> {
                println("--- Inventario Actual ---")
                inventario.mostrarInventario()
            }

            5 -> println("Saliendo del programa.")
            else -> println("Opción inválida, por favor intente nuevamente.")
        }
    } while (opcion != 5)
}