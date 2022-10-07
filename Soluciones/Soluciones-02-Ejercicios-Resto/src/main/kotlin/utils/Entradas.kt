package utils

// Funciones de utilidad para resolver los ejercicios

/**
 * Lee un double por consola
 * @param mensaje Mensaje que se muestra al usuario
 * @return double leido
 */
fun leerDouble(mensaje: String): Double {
    do {
        print(mensaje)
        val entrada = readln().toDoubleOrNull()
        if (entrada != null) {
            return entrada // --> Me hace escapar del bucle
        } else {
            println("Entrada inválida. No es un Double")
        }
    } while (true) // Parezco infinito pero hay un return!!
}

fun leerEntero(mensaje: String): Int {
    do {
        print(mensaje)
        val entrada = readln().toIntOrNull()
        if (entrada != null) {
            return entrada // --> Me hace escapar del bucle
        } else {
            println("Entrada inválida. No es un Int")
        }
    } while (true) // Parezco infinito pero hay un return!!
}

fun continuar(mensaje: String): Boolean {
    do {
        print(mensaje)
        val entrada = readln()
        when (entrada) {
            "S", "s" -> return true
            "N", "n" -> return false
            else -> println("Entrada inválida. Debe ingresar S o N")
        }
    } while (true) // Parezco infinito pero hay un return!!
}