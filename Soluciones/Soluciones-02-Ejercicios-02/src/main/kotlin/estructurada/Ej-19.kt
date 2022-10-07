fun main() {
    val TARIFA_DIURNA = 20
    val TARIFA_NOCTURNA = 30
    val INCREMENTO_DOMINGO_DIURNO = 10
    val INCREMENTO_DOMINGO_NOCTURNO = 15

    var dia = ""
    var numeroHoras = 0
    var turno = ""

    var salario = 0.0

    do {
        println("Ingrese el día: ")
        dia = readln()
        if (dia != "lunes" && dia != "martes" && dia != "miercoles" && dia != "jueves" && dia != "viernes" && dia != "sabado" && dia != "domingo") {
            println("El día no es válido")
        }
    } while (dia != "lunes" && dia != "martes" && dia != "miercoles" && dia != "jueves" && dia != "viernes" && dia != "sabado" && dia != "domingo")

    do {
        println("Ingrese el numero de horas: ")
        numeroHoras = readln().toInt()
        if (numeroHoras <= 0) {
            println("El numero de horas no puede ser menor a o igual 0")
        }
    } while (numeroHoras <= 0)

    do {
        println("Ingrese el turno: ")
        turno = readln()
        if (turno != "diurno" && turno != "nocturno") {
            println("El turno no es válido")
        }
    } while (turno != "diurno" && turno != "nocturno")

    when (turno) {
        "diurno" -> {
            when (dia) {
                "domingo" -> salario = numeroHoras * (TARIFA_DIURNA + INCREMENTO_DOMINGO_DIURNO).toDouble()
                else -> salario = (numeroHoras * TARIFA_DIURNA).toDouble()
            }
        }

        "nocturno" -> {
            when (dia) {
                "domingo" -> salario = (numeroHoras * (TARIFA_NOCTURNA + INCREMENTO_DOMINGO_NOCTURNO)).toDouble()
                else -> salario = (numeroHoras * TARIFA_NOCTURNA).toDouble()
            }
        }
    }

    println("Salario: $salario")

    // Repetimos con if anidados
    if (turno == "diurno") {
        if (dia == "domingo") {
            salario = numeroHoras * (TARIFA_DIURNA + INCREMENTO_DOMINGO_DIURNO).toDouble()
        } else {
            salario = (numeroHoras * TARIFA_DIURNA).toDouble()
        }
    } else {
        if (dia == "domingo") {
            salario = (numeroHoras * (TARIFA_NOCTURNA + INCREMENTO_DOMINGO_NOCTURNO)).toDouble()
        } else {
            salario = (numeroHoras * TARIFA_NOCTURNA).toDouble()
        }
    }
}