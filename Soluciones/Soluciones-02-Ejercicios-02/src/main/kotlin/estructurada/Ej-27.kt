fun main() {
    val LIMITE: Int = 100
    val SALIR = "s"

    var salida: Boolean = false // Bandera
    do {
        println("Introd uzca un número o s para salir: ")
        val numero = readln()
        println("El número es: $numero")
        if (numero == SALIR || numero.toInt() > LIMITE) {
            salida = true
        }
    } while (!salida)

    println("Fin del programa")
}