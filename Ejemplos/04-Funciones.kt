/**
 * Programa o función principal
 * Siempre tiene que existir al menos 1
 */
fun main(){
  // Procedimiento
  presentacion("Numeros Pares o Impares")
  
  do {
    // Función para leer un numero entero
    val numero = readInt("Ingrese un numero: ")

    // Función
    var res = isPar(numero)
    
    when (res) {
      true -> println("El numero $numero es par")
      false -> println("El numero $numero es impar")
    }

    // Función
    val continuar = continuar("Deseas continuar?")

  } while (continuar)

}

/**
 * Función que devuelve si un numer es par o impar
 */
fun isPar(numero: Int): Boolean {
  // var res = false
  // if (numero % 2 == 0) {
  //   res = true
  // } else {
  //   res = false
  // }
  // return res
  return numero % 2 == 0
}

/**
 * Función que indica si queremos continuar o no
 */
fun continuar(mensaje: String): Boolean {
  print("$mensaje (s/n): ")
  val continuar = readln()
  return continuar == "s"
}

fun presentacion(mensaje: String): Unit {
  println(mensaje)
}

fun readInt(mensaje: String): Int {
  print(mensaje)
  return readln().toInt()
}