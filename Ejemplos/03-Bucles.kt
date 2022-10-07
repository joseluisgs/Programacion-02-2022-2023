fun main() {
  var tecla = ""
  var secreto ="a"
  var intentos = 0

  print("Adivina la tecla: ")
  tecla = readln()
  intentos = intentos + 1

  // Soy un bucle indefinido (while), me repito mienytras se cumpla la condicion
  while(tecla != secreto) {
    println("Has pulsa la tecla $tecla")
    intentos = intentos + 1
    print("Adivina la tecla: ")
    tecla = readln()
  }

  println("Has acertado en $intentos intentos que la tecla es $secreto")

  // Para no repetir lo de pedir las letras usamos do-while (indefinido)

  intentos = 0
  secreto = "b"
  do {
    print("Adivina la tecla: ")
    tecla = readln()
    println("Has pulsa la tecla $tecla")
    intentos = intentos + 1
  } while(tecla != secreto)

  println("Has acertado en $intentos intentos que la tecla es $secreto")

  // Bucle definido, indico las veces que se repite
  println("Bucle definido de 1 a 10")
  for (i in 1..10) {
    println("El valor de i es $i")
  }

  println("Bucle definido de 10 a 1")
  for (i in 10 downTo 1) {
    println("El valor de i es $i")
  }
  println("Bucle definido de 1 a 10 de 2 en 2")
  for (i in 1..10 step 2) {
    println("El valor de i es $i")
  }
  println("Bucle definido de 10 a 1 de 2 en 2")
  for (i in 10 downTo 1 step 2) {
    println("El valor de i es $i")
  }
  
}