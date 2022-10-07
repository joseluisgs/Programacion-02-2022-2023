package modular

fun main() {
    imprimirNumerosLoteria(6)
}

fun imprimirNumerosLoteria(maxNumeros: Int) {
    val NUM_MIN = 1
    val NUM_MAX = 49
    for (i in 1..maxNumeros) {
        println("Número $i: ${generarNumeroLoteria(NUM_MIN, NUM_MAX)}")
    }
}

/**
 * Genera un número aleatorio entre min y max
 * @param numMin Número mínimo
 * @param numMax Número máximo
 * @return Número aleatorio entre numMin y numMax
 */
fun generarNumeroLoteria(numMin: Int, numMax: Int): Int {
    // usando Math.random() y Math.floor()
    // Es como se debe hacer en java
    // return Math.floor(Math.random() * (numMax - numMin + 1) + numMin).toInt()
    return (numMin until numMax).random()
}
