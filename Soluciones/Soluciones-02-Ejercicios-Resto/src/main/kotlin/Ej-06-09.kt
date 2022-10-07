fun main() {
    val a = 'a'
    // Valor de a es 97
    println(a.code)
    val b = 97
    // Valor de b en caracter es
    println(b.toChar())
    val c = '~'
    // Valor de c es 126
    println(c.code)
    val d = 126
    // Valor de d en caracter es
    println(d.toChar())

    val letaInicial = 67
    val letraFinal = 90
    for (i in letaInicial..letraFinal) {
        println(i.toChar())
    }

    for (i in 0..255) {
        println(i.toChar())
    }
}