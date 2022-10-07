fun main() {
  val APROBADO = 5.0
  val NOTABLE = 7.0
  val SOBRESALIENTE = 9.0
   val MAYORIA_EDAD = 18


  var calificacion = 0.0
  var nombre = ""
  var edad = 0

  print("Introduce tu nombre: ")
  nombre = readln()
   print("Dime tu edad: ")
  edad = readln().toInt()

  // Condicional simple
  if (edad >= MAYORIA_EDAD) {
    println("Hola $nombre, eres mayor de edad")
  } else {
    println("Hola $nombre, eres menor de edad")
  }


  print("Introduce tu calificación: ")
  calificacion = readln().toDouble()

  println("Hola $nombre, tu calificación es $calificacion")

  // Condicional múltiple
  // Modo if-else-if-else-if-else-if-else-if-else-if-else
  if (calificacion < APROBADO) {
    println("Has suspendido")
  } else if (calificacion < NOTABLE) {
    println("Has aprobado")
  } else if (calificacion < SOBRESALIENTE) {
    println("Has sacado un notable")
  } else {
    println("Has sacado un sobresaliente")
  }

  if (calificacion<APROBADO) {
    println("Has suspendido")
  } else {
    if (calificacion<NOTABLE) {
      println("Has aprobado")
    } else {
      if (calificacion<SOBRESALIENTE) {
        println("Has sacado un notable")
      } else {
        println("Has sacado un sobresaliente")
      }
    }
  }

  if (calificacion<APROBADO) {
    println("Has suspendido")
  } else if (calificacion >= APROBADO && calificacion < NOTABLE) {
    println("Has aprobado")
  } else if (calificacion >= NOTABLE && calificacion < SOBRESALIENTE) {
    println("Has sacado un notable")
  } else {
    println("Has sacado un sobresaliente")
  }

  if (calificacion<APROBADO) {
    println("Has suspendido")
  } else if (calificacion >= APROBADO) {
    if (calificacion < NOTABLE) {
      println("Has aprobado")
    } else if (calificacion >= NOTABLE) {
      if (calificacion < SOBRESALIENTE) {
        println("Has sacado un notable")
      } else {
        println("Has sacado un sobresaliente")
      }
    }
  }

  // Condicional multiple con when
  when{
    calificacion < 0 || calificacion > 10 -> println("Calificación incorrecta")
    calificacion < APROBADO -> println("Has suspendido")
    calificacion >= APROBADO && calificacion < NOTABLE -> println("Has aprobado")
    calificacion >= NOTABLE && calificacion < SOBRESALIENTE -> println("Has sacado un notable")
    calificacion >= SOBRESALIENTE -> println("Has sacado un sobresaliente")
    else -> println("Calificación incorrecta")
  }

  println("Fin")
}