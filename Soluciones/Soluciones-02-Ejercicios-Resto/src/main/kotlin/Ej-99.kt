package utils

// Problemas de redondeo

fun main(args: Array<String>) {
    var i = 10.0
    while (i >= 0.0) {
        println(i)
        i -= 0.1
    }

    /* var j = BigDecimal("10")
     while (j.compareTo(BigDecimal("0")) != 0) {
         println(j)
         j = j.subtract(BigDecimal("0.1"))
     }*/
}
