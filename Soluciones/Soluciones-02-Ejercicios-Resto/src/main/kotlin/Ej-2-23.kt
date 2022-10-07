// Experimento con factorial

fun main() {
    val num = 20L

    val iniT = System.nanoTime()
    val res = factorialIterativo(num)
    val finT = System.nanoTime()
    println("Iterativo: $res, tiempo: ${finT - iniT} ns")

    val iniT2 = System.nanoTime()
    val res2 = factorialRecursivo(num)
    val finT2 = System.nanoTime()
    println("Recursivo: $res2, tiempo: ${finT2 - iniT2} ns")
    
}

fun factorialIterativo(num: Long): Long {
    var res = 1L
    for (i in 1..num) {
        res *= i
    }
    return res
}

fun factorialRecursivo(num: Long): Long {
    return if (num == 1L) {
        1L
    } else {
        num * factorialRecursivo(num - 1L)
    }
}
