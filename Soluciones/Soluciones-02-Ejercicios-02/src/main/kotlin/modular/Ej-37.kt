package modular

fun main() {
    var numIntentos = 0
    val MAX_INTENTOS = 5
    val NUM_MAX = 100
    val NUM_MIN = 1

    do {
        val secreto = numeroAleatorio(NUM_MIN, NUM_MAX)
        var acertado = false
        numIntentos = 0
        do {
            numIntentos++
            val apuesta = leerEnteroIntervalo("Ingrese su apuesta ($NUM_MIN, $NUM_MAX): ", NUM_MIN, NUM_MAX)
            if (secreto == apuesta) {
                println("Has acertado, el número es $secreto")
                acertado = true
            } else if (secreto < apuesta) {
                println("El número es menor que $apuesta")
            } else {
                println("El número es mayor que $apuesta")
            }
        } while (numIntentos < MAX_INTENTOS && !acertado)

        if (!acertado) {
            println("Has agotado los $MAX_INTENTOS intentos. El número era $secreto")
        } else {
            println("Has acertado en $numIntentos intentos. El número era $secreto")
        }

    } while (continuarPartida("¿Desea seguir jugando? s/n: "))

}

/*
Usamos Try Catch cuando podemos tener una excepcioón, es decir un error en tiempo de ejecución
En este caso la excepción se produce cuando no puede realizar el paso de una cadena a entero
Solo debemos usarlo si creemos que va a existir una execpción porque es costoso manejarlo
Porque en el fondo estamos dejando que el programa "explote" para luego corregirlo

Esta esl a forma de Java

fun leerEnteroIntervalo(mensaje: String, numMin: Int, numMax: Int): Int {
    var num = 0
    var correcto = false
    do {
        print(mensaje)
        // num = readln().toIntOrNull() ?: 0
        try {
            num = readln().toInt()
            correcto = true
        } catch (e: NumberFormatException) {
            System.err.println(e.message)
            correcto = false
        }
    } while (num < numMin || num > numMax)
    return num
}*/

/**
 * Unsando los nulos
 */

fun leerEnteroIntervalo(mensaje: String, numMin: Int, numMax: Int): Int {
    var num: Int?
    do {
        print(mensaje)
        num = readln().toIntOrNull()
        if (num == null) println("No has metido un número")
    } while (num !in numMin..numMax)
    return num!!
}

/*
En kotlin tenemos el operador elvis que si el casting falla al intentarlo usando su varianete orNull
devuelve un valor por defecto que nos sirve para usarlo.
 */
/*fun leerEnteroIntervalo(mensaje: String, numMin: Int, numMax: Int): Int {
    var num: Int = 0
    do {
        print(mensaje)
        num = readln().toIntOrNull() ?: 0
    } while (num !in numMin..numMax)
    return num!!
}
*/


fun numeroAleatorio(numMin: Int, numMax: Int): Int {
    return (numMin..numMax).random()
}

private fun continuarPartida(mensaje: String): Boolean {
    print(mensaje)
    val respuesta = readln()
    return respuesta == "s" || respuesta == "S"
}