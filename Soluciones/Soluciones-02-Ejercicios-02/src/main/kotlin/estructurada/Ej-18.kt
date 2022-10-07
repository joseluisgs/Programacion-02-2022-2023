fun main() {
    val PRECIO_KM = 2.5
    val ESTANCIA_MAX = 7
    val DISTANCIA_MAX = 800
    val REBAJA = 0.7
    var precio = 0.0
    var distancia = 0.0
    var estancia = 0

    do {
        println("Ingrese la distancia: ")
        distancia = readln().toDouble()
        if (distancia < 0) {
            println("La distancia no puede ser menor a 0")
        }
    } while (distancia < 0)

    do {
        println("Ingrese la estancia: ")
        estancia = readln().toInt()
        if (estancia < 0) {
            println("La estancia no puede ser menor a 0")
        }
    } while (estancia < 0)

    precio = distancia * PRECIO_KM

    if (estancia > ESTANCIA_MAX && distancia > DISTANCIA_MAX) {
        precio *= REBAJA
    }

    println("Precio: $precio")
}