// importamos lo que necesitemos
import utils.continuar
import utils.leerDouble


fun main() {
    var numNotas = 0
    var notaAcumulada = 0.0
    var media = 0.0
    println("Nota Media")

    do {
        do {
            val nota = leerDouble("Ingrese la nota: ")
            if (nota >= 0) {
                notaAcumulada += nota
                numNotas++
            } else {
                println("Nota inválida")
            }
        } while (nota < 0)
    } while (continuar("Desea ingresar mas notas? (S/N) "))
    media = notaAcumulada / numNotas
    println("La media de $numNotas notas es $media")
}