package modular

fun main() {
    var numAciertos = 0
    var numRondas = 0
    println("Juego de las apuestas")
    do {
        numRondas++
        val secreto = valorAleatorio()
        val apuesta = leerValor("Ingrese su apuesta (1,X,2): ")

        if (secreto == apuesta) {
            println("Ganaste, el resultado era $secreto")
            numAciertos++
        } else {
            println("Perdiste, el resultado era $secreto")
        }
    } while (continuar("¿Desea seguir jugando? s/n: "))

    println("Ha acertado $numAciertos veces en $numRondas rondas")

}

/**
 * Genera un valor aleatorio entre 1 y 2
 * @param mensaje Mensaje a mostrar
 * @return Verdadero si es "S" o "s", falso en caso contrario
 */
fun continuar(mensaje: String): Boolean {
    print(mensaje)
    val respuesta = readln()
    return respuesta == "s" || respuesta == "S"
}

fun leerValor(mensaje: String): String {
    print(mensaje)
    return readln().uppercase()
}

/**
 * Genera un valor aleatorio entre 1, X y 2
 * @return Valor aleatorio: 1, X o 2
 */
fun valorAleatorio(): String {
    return when ((1..3).random()) {
        1 -> "1"
        2 -> "X"
        else -> "2"
    }
}