package Tema1_Kotlin.sesion0510.Tutorial_Kotlin.Explicacion

fun main(parametros:Array<String>) {
    // Operadores Lógicos //

    // && (AND): condiciones deben ser verdaderas para que el resultado de la condición compuesta de verdadero y continue por la rama del verdadero de la estructura condicional
    print("Ingrese primer valor:")
    val num1 = readln().toInt()
    print("Ingrese segundo valor:")
    val num2 = readln().toInt()
    print("Ingrese tercer valor:")
    val num3 = readln().toInt()
    if (num1 > num2 && num1 > num3) {
        print(num1)
    } else {
        if (num2 > num3) {
            print(num2)
        } else {
            print(num3);
        }
    }

    // || (OR): condiciones donde una de las condiciones sea verdadera alcanza para que el resultado de la condicion compuesta sea verdadera
    print("Ingrese día:")
    val dia = readln().toInt()
    print("Ingrese mes:")
    val mes = readln().toInt()
    print("Ingrese Año:")
    val año = readln().toInt()
    if (mes == 1 || mes == 2 || mes == 3) {
        print("Corresponde al primer trimestre");
    }
}



