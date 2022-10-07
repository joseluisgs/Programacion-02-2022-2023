package modular

fun main() {
    val numInicial = 967
    val numFinal = 1679

    cribaEratostenes(numInicial, numFinal)
}

fun cribaEratostenes(numInicial: Int, numFinal: Int) {
    println("Lista de números primos entre $numInicial y $numFinal")
    for (i in numInicial..numFinal) {
        // println("$i: ${esPrimo(i)}")
        when (esPrimo(i)) {
            true -> println("$i: primo")
            false -> println("$i: no primo")
        }
    }
}
