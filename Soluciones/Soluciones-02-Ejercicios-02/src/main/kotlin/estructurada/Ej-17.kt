import kotlin.math.sqrt


fun main() {
    var a = 0.0
    var b = 0.0
    var c = 0.0
    var discriminante = 0.0

    do {
        println("Ingrese a: ")
        a = readln().toDouble()

    } while (a == 0.0)

    do {
        println("Ingrese b: ")
        b = readln().toDouble()
    } while (b == 0.0)

    do {
        println("Ingrese c: ")
        c = readln().toDouble()
    } while (c == 0.0)

    // Calculamos el discriminante
    discriminante = b * b - 4 * a * c

    when {
        discriminante > 0.0 -> {
            println("dos soluciones reales")
            val raiz = sqrt(discriminante)
            val cociente = 2 * a
            val sol1 = (-b + raiz) / cociente
            val sol2 = (-b - raiz) / cociente
            println("Solución 1: $sol1")
            println("Solución 2: $sol2")
        }

        discriminante == 0.0 -> {
            println("una solución real")
            val sol = -b / (2 * a)
            println("Solución: $sol")
        }

        else -> println("no tiene solución real")
    }

}