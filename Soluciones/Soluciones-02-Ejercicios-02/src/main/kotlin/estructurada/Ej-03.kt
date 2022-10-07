fun main() {
    // constantes
    val PI = 3.1416
    // Variables del programa
    var radio = 0.0
    var area = 0.0
    var circunferencia = 0.0

    do {
        print("Introduce el radio: ")
        radio = readln().toDouble()
        if (radio <= 0) {
            println("El radio debe ser mayor que 0")
        }
    } while (radio <= 0)

    area = PI * radio * radio
    circunferencia = 2 * PI * radio

    println("El area es: $area")
    println("La circunferencia es: $circunferencia")

    println("Fin")
}
