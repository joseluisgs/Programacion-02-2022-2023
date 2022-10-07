fun main() {
    var a = 0
    var b = 0

    do {
        println("Ingrese a: ")
        a = readln().toInt()
        if (a < 0) {
            println("El valor de a no puede ser menor o igual a 0")
        }
    } while (a <= 0)

    do {
        println("Ingrese b: ")
        b = readln().toInt()
        if (b <= 0 || b > a) {
            println("El valor de b no puede ser menor o igual a 0 o menor que $a")
        }
    } while (b <= 0)

    // Sacamos los impares en este rango
    for (i in a..b) {
        if (i % 2 != 0) {
            println(i)
        }
    }
}