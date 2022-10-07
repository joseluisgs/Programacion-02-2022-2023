// importamos lo que necesitemos
import utils.continuar
import utils.leerDouble


fun main() {
    var numAprobados = 0
    var numSuspensos = 0
    println("Contador de alumnos")

    do {
        do {
            val nota = leerDouble("Ingrese la nota del alumno: ")
            if (nota in 0.0..10.0) {
                if (nota >= 5) {
                    numAprobados++
                } else {
                    numSuspensos++
                }
            } else {
                println("Nota inválida")
            }
        } while (nota !in 0.0..10.0)
    } while (continuar("Desea ingresar mas alumnos? (S/N) "))
    println("Hay $numAprobados aprobados y $numSuspensos suspensos")
}