
var c = 10

fun main() {
  var a = 0 // Ambito es todo main
  println(a)

  System.exit(0)

  while (a<10) {
    var a = 23 // !! La vas a a cagar y por eso es Warning de que prestes atención!!
    var b = a // Ambito es el while
    println(b)
    a++
    println(a)
  }
  
  println(a)

  while (a<10) {
    var b = a // Ambito es el while
    println(b)
    a++
    println(a)
  }

  println(a)

  var b = 10
  println(b)
  
}

fun funcion(a: Int) {
  var b = 0 // Ambito es todo funcion
  println(a)
  println(b)
}


  