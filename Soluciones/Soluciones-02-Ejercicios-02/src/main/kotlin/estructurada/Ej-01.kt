fun main() {
    // Variables del programa
    var lado = 0.0
    var perimetro = 0.0
    var superficie = 0.0

    do{
        print("Introduce el lado: ")
        lado = readln().toDouble()
        if (lado <= 0) {
            println("El lado debe ser mayor que 0")
        }
    }while(lado <= 0)

    perimetro = lado * 4
    superficie = lado * lado

    println("El perimetro es: $perimetro")
    println("La superficie es: $superficie")

    println("Fin")
}
