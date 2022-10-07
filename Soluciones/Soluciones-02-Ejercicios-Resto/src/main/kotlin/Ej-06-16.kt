import utils.continuar

fun main() {
    var puntosJugador = 0
    var puntosOrdenador = 0

    println("Bienvenido/a al juego de los dados")

    do {
        puntosJugador += tirarJugador()
        puntosOrdenador += tirarOrdenador()

    } while (continuar("¿Desea continuar? (S/N): "))

    // Escribir resultados
    mostrarResultados(puntosJugador, puntosOrdenador)

}

fun tirarOrdenador(): Int {
    var resultado = 0
    // Repetimos tres veces
    for (i in 1..3) {
        // Tiramos el dado
        val dado = tirarDado("Ordenador", i)
        // Mostramos el resultado
        // println("Dado $i: $dado")
        // Acumulamos el resultado
        resultado += dado
    }
    return resultado
}

fun tirarJugador(): Int {
    var resultado = 0
    // Repetimos tres veces
    for (i in 1..3) {
        // Tiramos el dado
        val dado = tirarDado("Jugador", i)
        // Mostramos el resultado
        println("Dado $i: $dado")
        // Acumulamos el resultado
        resultado += dado
    }
    return resultado
}

fun tirarDado(jugador: String, turno: Int): Int {
    println("Dado $jugador en turno $turno")
    return (1..6).random()
}

private fun mostrarResultados(puntosJugador: Int, puntosOrdenador: Int) {
    println("Resultados finales:")
    println("Puntos del jugador: $puntosJugador")
    println("Puntos del ordenador: $puntosOrdenador")
    if (puntosJugador > puntosOrdenador) {
        println("Ha ganado el jugador")
    } else if (puntosJugador < puntosOrdenador) {
        println("Ha ganado el ordenador")
    } else {
        println("Ha habido un empate")
    }
}