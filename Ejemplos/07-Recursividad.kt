fun main() {
    var res = factorialIterativo(5)
    println(res)
    res = factorialRecursivo(5)
    println(res)

    res = fibonacciIterativo(5)
    println(res)
    res = fibonacciRecursivo(5)
    println(res)
}

fun factorialIterativo(num: Int): Int {
    var res = 1
    for (i in 1..num) {
        res *= i
    }
    return res
}

fun factorialRecursivo(num: Int): Int {
    if (num == 1) {
        return 1
    }
    return num * factorialRecursivo(num - 1)
}

fun fibonacciIterativo(num: Int): Int {
    var a = 0
    var b = 1
    var c = 0
    for (i in 1..num-1) {
        c = a + b
        a = b
        b = c
    }
    return c
}

fun fibonacciRecursivo(num: Int): Int {
    if (num == 1 || num == 2) {
        return 1
    }
    return fibonacciRecursivo(num - 1) + fibonacciRecursivo(num - 2)
}