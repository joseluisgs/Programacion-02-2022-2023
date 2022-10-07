// Mutiplicación y división entera en base a sumas y restas

fun main() {
    var a = 0
    var b = 0

    do {
        println("Ingrese el primer número: ")
        a = readln().toInt()
        if (a < 0) {
            println("El primer número no puede ser menor a 0")
        }
    } while (a <= 0)

    do {
        println("Ingrese el segundo número: ")
        b = readln().toInt()
        /*if (b <= 0) {
            println("El segundo número no puede ser menor o igual a 0")
        } else {if (b > a) {
            println("El segundo número no puede ser mayor al primero")*/
        when {
            b <= 0 -> println("El segundo número no puede ser menor o igual a 0")
            b > a -> println("El segundo número no puede ser mayor al primero")
        }
    } while (b <= 0 || b > a)

    // La multiplicacio es un bucle definido de sumas
    var i = 0
    var resultado = 0
    while (i < b) {
        resultado += a
        i++
    }
    // Mejor con un for
    resultado = 0
    for (i in 1..b) {
        resultado += a
    }
    println("$a * $b = $resultado")

    // División conciente y resto en base a restas y bucle while
    var cociente = 0
    var resto = a
    while (resto >= b) {
        resto -= b
        cociente++
    }
    println("$a / $b = $cociente, resto $resto")


}