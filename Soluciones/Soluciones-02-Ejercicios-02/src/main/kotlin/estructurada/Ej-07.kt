
const val PI = 3.1416

fun main() {
    var año = 0

    println("Ingrese el año")
    año = readln().toInt()

    // Es bisiesto si es divisible por 4 y no por 100, o si es divisible por 400
    if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
        println("El año $año es bisiesto")
    } else {
        println("El año $año no es bisiesto")
    }


    println("Fin")
}
