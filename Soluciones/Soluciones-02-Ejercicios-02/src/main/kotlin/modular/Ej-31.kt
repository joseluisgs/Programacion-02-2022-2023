package modular

import kotlin.math.sqrt

fun main() {
    val num = 13841

    val res = esPrimo(num)
    println("¿¡El número $num es primo?: $res")
}


fun esPrimo(num: Int): Boolean {
    // Early return, descartamos al principio los casos que no son primos
    // De esta manera ahorramos if elses anidados
    if (num < 2) {
        return false
    }
    if (num == 2) {
        return true
    }
    if (num % 2 == 0) {
        return false
    }
    for (i in 3..sqrt(num.toDouble()).toInt() step 2) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}