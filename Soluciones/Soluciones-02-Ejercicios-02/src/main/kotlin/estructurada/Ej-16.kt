fun main() {
    var horas = 0
    var minutos = 0
    var segundos = 0

    do {
        println("Ingrese las horas: ")
        horas = readln().toInt()
        if (horas < 0 || horas > 23) {
            println("Las horas no pueden ser menor a 0 o mayor a 23")
        }
    } while (horas < 0 || horas > 23)

    do {
        println("Ingrese las minutos: ")
        minutos = readln().toInt()
        if (minutos < 0 || minutos > 59) {
            println("Los minutos no pueden ser menor a 0 o mayor a 59")
        }
    } while (minutos < 0 || minutos > 59)

    do {
        println("Ingrese las segundos: ")
        segundos = readln().toInt()
        if (segundos < 0 || segundos > 59) {
            println("Los segundos no pueden ser menor a 0 o mayor a 59")
        }
    } while (segundos < 0 || segundos > 59)

    segundos++ // segundos = segundos + 1 // segundos += 1
    if (segundos == 60) {
        segundos = 0
        minutos++
        if (minutos == 60) {
            minutos = 0
            horas++
            if (horas == 24) {
                horas = 0
            }
        }
    }

    println("La hora es $horas:$minutos:$segundos")

}