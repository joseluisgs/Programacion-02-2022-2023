/**
 * Programa o función principal
 * Siempre tiene que existir al menos 1
 */
fun main(){
  // Procedimiento
  var num1 = 10
  var num2 = 20
  var res = sumar(num1, num2)
  println("1.- La suma de $num1 + $num2 = $res")

  res = sumar(10, 20)
  println("2.- La suma es: $res")

  val numero = 10
  res = pasoValor(numero)
  println("3.- paso por valor: $res")

  val numeros = intArrayOf(10)
   println(numeros[0])
  res = pasoReferencia(numeros)
  println("3.- paso por valor: $res")
  println(numeros[0])

}

fun sumar(a: Int, b: Int): Int{
  println("Funcion sumar")
  println("a: $a")
  println("b: $b")
  return a + b
}

fun pasoValor(num: Int): Int {
  println("Paso valor")
  //return num * 2
  // val res = num * 2
  // return num
  // No se puede hacer porque se bloquea por el compilador de Kotlin
  // Al ser un paso por valor
  // num = num * 2
  // return num

  // Esto sí deja, si queremos modificar el valor debemos copiarlo a una variable local
  // val res = num * 2
  // return res

  // Esto también
  return num * 2
}

fun pasoReferencia(num: IntArray): Int {
  println("Paso referencia")
  num[0] = num[0] + 2
  return num[0]
}
  
  