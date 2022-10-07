fun main() {
    var numero = 0.0

    println("Introduce el numero")
    numero = readln().toDouble()

    if (numero > 0) {
        // Raiz cuadrada algoritmo
        // var raiz = Math.sqrt(numero) // con esto no aprendemos!!!
        var raiz = numero
        var temp = 0.0
        while (temp != raiz) {
            temp = raiz
            raiz = (numero / raiz + raiz) / 2
        }
        println("La raiz cuadrada de $numero es $raiz")

    } else {
        println("No se puede calcular la raíz cuadrada de un número negativo")
    }

    println("Fin")
}
