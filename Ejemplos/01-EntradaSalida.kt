fun main() {
  // Zona de declaración de variables y constantes
  val MAYORIA_EDAD = 18
  var edad = 18
  var nombre = ""

  // Dime tu edad
  // println escribe y salta de linea "\n"
  // print escribe y no salta de linea

  // leemos
  // readln lee una linea de texto
  // debemos hacer el cambio de Cadena a Entero

  print("Dime tu nombre: ")
  nombre = readln()
  print("Dime tu edad: ")
  edad = readln().toInt()

  // Proceso
  if (edad >= MAYORIA_EDAD) {
    println("Hola $nombre, eres mayor de edad")
  } else {
    println("Hola $nombre, eres menor de edad")
  }

  println("Fin del programa")

}