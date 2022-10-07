// Constantes del programa
const val TARIFA_DIURNA = 20
const val TARIFA_NOCTURNA = 30
const val INCREMENTO_DOMINGO_DIURNO = 10
const val INCREMENTO_DOMINGO_NOCTURNO = 15

fun main() {
    var dia = ""
    var numeroHoras = 0
    var turno = ""
    var salario = 0.0

    // Entrada de informacion
    dia = leerDia()
    numeroHoras = leerHoras()
    turno = leerTurno()

    // Procesamiento de informacion
    salario = calcularSalario(turno, dia, numeroHoras)

    // Salida de la información
    salidaSalario(salario, turno, dia, numeroHoras)
}

private fun salidaSalario(salario: Double, turno: String, dia: String, numeroHoras: Int) {
    var salario1 = salario
    println("Salario: $salario1")

    // Repetimos con if anidados
    if (turno == "diurno") {
        if (dia == "domingo") {
            salario1 = numeroHoras * (TARIFA_DIURNA + INCREMENTO_DOMINGO_DIURNO).toDouble()
        } else {
            salario1 = (numeroHoras * TARIFA_DIURNA).toDouble()
        }
    } else {
        if (dia == "domingo") {
            salario1 = (numeroHoras * (TARIFA_NOCTURNA + INCREMENTO_DOMINGO_NOCTURNO)).toDouble()
        } else {
            salario1 = (numeroHoras * TARIFA_NOCTURNA).toDouble()
        }
    }
}

private fun calcularSalario(
    turno: String,
    dia: String,
    numeroHoras: Int
): Double {
    var salario = 0.0
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
    return salario
}

private fun leerTurno(): String {
    var turno = ""
    do {
        println("Ingrese el turno: ")
        turno = readln()
        if (turno != "diurno" && turno != "nocturno") {
            println("El turno no es válido")
        }
    } while (turno != "diurno" && turno != "nocturno")
    return turno
}

private fun leerHoras(): Int {
    var numeroHoras = 0
    do {
        println("Ingrese el numero de horas: ")
        numeroHoras = readln().toInt()
        if (numeroHoras <= 0) {
            println("El numero de horas no puede ser menor a o igual 0")
        }
    } while (numeroHoras <= 0)
    return numeroHoras
}

private fun leerDia(): String {
    var dia = ""
    do {
        println("Ingrese el día: ")
        dia = readln()
        if (dia != "lunes" && dia != "martes" && dia != "miercoles" && dia != "jueves" && dia != "viernes" && dia != "sabado" && dia != "domingo") {
            println("El día no es válido")
        }
    } while (dia != "lunes" && dia != "martes" && dia != "miercoles" && dia != "jueves" && dia != "viernes" && dia != "sabado" && dia != "domingo")
    return dia
}