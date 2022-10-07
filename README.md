# Programación - 02 Programación Estructurada y Modular

Tema 02 Programación Estructurada y Modular. 1DAM. Curso 2022/2023.

![imagen](https://raw.githubusercontent.com/joseluisgs/Programacion-00-2022-2023/master/images/programacion.png)


- [Programación - 02 Programación Estructurada y Modular](#programación---02-programación-estructurada-y-modular)
  - [Contenidos](#contenidos)
  - [Tipos y Operaciones](#tipos-y-operaciones)
    - [Lenguajes tipados y no tipados](#lenguajes-tipados-y-no-tipados)
    - [Operaciones](#operaciones)
    - [Variables y constantes](#variables-y-constantes)
  - [Algoritmo](#algoritmo)
  - [Programación Estructurada](#programación-estructurada)
    - [Secuencias](#secuencias)
    - [Condicionales](#condicionales)
    - [Bucles](#bucles)
    - [Comentarios](#comentarios)
  - [Programación Modular](#programación-modular)
    - [Funciones](#funciones)
    - [Procedimientos](#procedimientos)
    - [Parámetros](#parámetros)
    - [Paso por valor, copia y paso por referencia](#paso-por-valor-copia-y-paso-por-referencia)
    - [Ámbito de variables](#ámbito-de-variables)
    - [Paquete o módulo](#paquete-o-módulo)
    - [Recursividad](#recursividad)
  - [Referencias](#referencias)
  - [Recursos](#recursos)
  - [Autor](#autor)
    - [Contacto](#contacto)
    - [¿Un café?](#un-café)
  - [Licencia de uso](#licencia-de-uso)

## Contenidos
1. Tipos y Operaciones
2. Constantes y Variables
3. Algoritmos
4. Programación Estructurada
5. Programación Modular

## Tipos y Operaciones
Los tipos de datos nos sirven para clasificar nuestra información de entrada y salida y trabajar con ellos. Un tipo lo define en base al valor que puede almacenar y las operaciones que se pueden realizar con él.
- Tipos simples: Se llama tipo de dato a una clase concreta de objetos o valores: Números, Caracter, Lógicos, etc.
- Tipos compuestos: arrays, listas, etc, que los veremos más adelante.

```kotlin
// Tipos de datos
// Tipos simples
// Números
var numero: Int = 1
var numero: Double = 1.0
var numero: Float = 1.0f
var numero: Long = 1L
var numero: Short = 1
var numero: Byte = 1
// Caracteres
var caracter: Char = 'a'
// Lógicos
var logico: Boolean = true
// Cadenas
var cadena: String = "Hola"
// Tipos compuestos
// Arrays
var array: Array<Int> = arrayOf(1, 2, 3)
var array: IntArray = intArrayOf(1, 2, 3)
var array: Array<String> = arrayOf("Hola", "Adiós")
var array: Array<Boolean> = arrayOf(true, false)
// Matrices
var matriz: Array<Array<Int>> = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6))
var matriz: Array<IntArray> = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6))
```

### Lenguajes tipados y no tipados
- Lenguajes tipados: Los lenguajes tipados son aquellos que requieren que el programador declare el tipo de dato que se va a utilizar en cada variable. En estos lenguajes, el compilador o intérprete comprueba que el tipo de dato de cada variable coincida con el tipo de dato que se ha declarado. 
- Lenguajes débilmente tipados y/o tipado dinámico: Los lenguajes debilmente tipados son aquellos que no requieren que el programador declare el tipo de dato que se va a utilizar en cada variable. El compilador o intérprete deduce el tipo de dato de cada variable en tiempo de ejecución.

### Operaciones
- Aritméticas: +, -, *, /, %, ++, --
- Relacionales: ==, !=, >, <, >=, <=
- Lógicas: &&, ||, !
- Asignación: =, +=, -=, *=, /=, %=

### Variables y constantes
A la hora de almacenar datos en memoria, debemos analizar cómo vamos a utilizarlos. Si vamos a modificarlos, debemos utilizar variables, si no, debemos utilizar constantes.
- Constantes: Son valores que no cambian durante la ejecución del programa. Se declaran con la palabra reservada const/val. Son inmutables.
- Variables: Son valores que cambian durante la ejecución del programa. Se declaran con la palabra reservada let/var. Son mutables.

Se debe aplicar código limpio y buenas prácticas de programación. para nombrarlas.

```kotlin
// Constantes
const val NUMERO_PI = 3.1416
val NUMERO_E = 2.7182
// Variables
var nombreAlumno = "José Luis"
var edadAlumno = 18
```
## Algoritmo
Un algoritmo es una secuencia ordenada de pasos que conducen a la solución de un problema. Tienen tres características:
- Son precisos en el orden de realización de los pasos.
- Están bien definidos de forma que usando un algoritmo varias veces con los mismos datos, dé la misma solución.
- Son finitos, deben acabarse en algún momento.

Los algoritmos deben representarse de forma independiente del lenguaje de programación que luego usaremos.

Usaremos ordinogramas o diagramas de flujo para representarlos y pseudocódigo

![diagrama](https://www.economia360.org/wp-content/uploads/2020/11/simbolog%C3%ADa-600x420.jpg)

![pseudocodigo](https://i.pinimg.com/474x/ce/c0/9c/cec09c70e1076353e80e41fa74df0dc8.jpg)

## Programación Estructurada
La programación estructurada es un paradigma de programación que se basa en la estructuración de los programas en tres elementos básicos:
- Secuencia: Los programas se ejecutan secuencialmente, es decir, una instrucción tras otra.
- Condicionales: Los programas pueden ejecutar una parte de código u otra dependiendo de una condición.
- Bucles: Los programas pueden ejecutar una parte de código varias veces.

![secuencia](https://www.edix.com/es/wp-content/uploads/sites/2/2021/07/estructuras-programacion-estructurada-1024x352.jpg)

### Secuencias
Las secuencias son la base de la programación estructurada. Se ejecutan una tras otra, de arriba a abajo. 

```kotlin
// Secuencia
println("Hola")
println("¿Cómo estás?")
// leemos el nombre
val nombre = readln()
println("Encantado de conocerte $nombre")
```
### Condicionales
Los condicionales nos permiten ejecutar una parte de código u otra dependiendo de una condición. 

Pueden ser:
- Condicionales simples: Se ejecuta una parte de código u otra dependiendo de una condición (if). La parte de código que se ejecuta se llama rama verdadera y la otra rama falsa. La parte asociada a else es opcional.

```kotlin
// Condicionales simples
if (edadAlumno >= 18) {
    println("Eres mayor de edad")
} else {
    println("Eres menor de edad")
}
```
- Condicionales múltiples: Pueden tener varios casos (if-else-if-else). Se ejecuta una parte de código u otra dependiendo de una condición. 

```kotlin
// Condicionales múltiples
if (edadAlumno >= 18) {
    println("Eres mayor de edad")
} else if (edadAlumno >= 16) {
    println("Casi eres mayor de edad")
} else {
    println("Eres menor de edad")
}
```

Tambien podemos usar switch-case o when para simplificar el if else y evitar efecto Hoduken.
```kotlin
// Condicionales múltiples
when (edadAlumno) {
    18 -> println("Eres mayor de edad")
    16 -> println("Casi eres mayor de edad")
    else -> println("Eres menor de edad")
}
```

### Bucles
Los bucles nos permiten ejecutar una parte de código varias veces. Existen varios tipos
- Indefinidos: Se ejecutan hasta que se cumple una condición (while). Se ejecuta una parte de código mientras se cumpla una condición. Si queremos que se ejecute al menos una vez, debemos usar do-while. Es importante manejar correctamente las variables que se usan en la condición (banderas o flags) para evitar bucles infinitos.

```kotlin

```kotlin 
// Bucles indefinidos
// Ejemplo while
var i = 0
while (i < 10) {
    println(i)
    i++
}

// Ejemplo do-while
var i = 0
do {
    println(i)
    i++
} while (i < 10)
```

![bucle](https://preview.redd.it/6wksqjmmyw321.jpg?width=640&crop=smart&auto=webp&s=d7a1c5d72af69db7c22ec6e662ec020ff267549c)

- Definidos: Se ejecutan un número determinado de veces (for) en base a un paso de iteración. Si el paso es 1 no se suele indicar. 

```kotlin
// Bucles definidos
// Ejemplo for
for (i in 0..10) {
    println(i)
}

// Con paso 2
for (i in 0..10 step 2) {
    println(i)
}

// descedente
for (i in 10 downTo 0) {
    println(i)
}

// Descedente con paso 3
for (i in 10 downTo 0 step 3) {
    println(i)
}
```

### Comentarios
Los comentarios son fragmentos de código que no se ejecutan. Se usan para documentar el código y explicar lo que hace. Pueden ser de una línea o de varias. 

```kotlin
// Comentarios
// Comentario de una línea

/*
Comentario de varias líneas
Para que los veas
*/
```

## Programación Modular
La programación modular es un paradigma de programación que se basa en la modularización de los programas en funciones (y procedimientos). Las funciones son bloques de código que realizan una tarea concreta y devuelven un valor. Los procedimientos son bloques de código que realizan una tarea concreta pero no devuelven ningún valor.
Las ventajas que ofrece la programación modular son:
- Facilita la resolución del problema.
- Aumenta la claridad y legibilidad de todo el programa.
- Permite que varios programadores trabajen en el mismo proyecto.
- Reduce el tiempo de desarrollo ya que se pueden reutilizar esos módulos en varios programas.
- Aumenta la fiabilidad porque es más sencillo diseñar y depurar módulos y el mantenimiento en mas fácil.

La descomposición modular se basa en la técnica “Divide y Vencerás” (DAC o Divide And Conquer), esta técnica tiene dos pasos:
- Identificación de los subproblemas y construcción de los módulos que lo resuelven.
- Combinación de los módulos para resolver el problema original.

![DAC](https://aprendiendoarduino.files.wordpress.com/2015/03/3c62c-dibujo-bmp.jpg)

### Funciones
Las funciones son bloques de código que realizan una tarea concreta y devuelven un valor. 

```kotlin
// Funciones
fun suma(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    println(suma(2, 3))
}
```

### Procedimientos
Los procedimientos son bloques de código que realizan una tarea concreta pero no devuelven ningún valor. 

```kotlin
// Procedimientos
fun suma(a: Int, b: Int) {
    println(a + b)
}

fun main() {
    suma(2, 3)
}
```

### Parámetros
Los parámetros son variables que se pasan a una función o procedimiento. Con ellos podemos modificar el comportamiento de la función o procedimiento y devolver un resultado diferente. Desde el lugar donde llamamos a la función se les asigna los valores a estos parámetros

```kotlin
// Parámetros son a y b
fun suma(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    // Los valores 2 y 3 se asignan a los parámetros a y b
    println(suma(2, 3))
}
```
### Paso por valor, copia y paso por referencia
- Paso por valor: Se crea una copia del valor del parámetro y se pasa a la función. Si se modifica el valor del parámetro dentro de la función, no se modifica el valor original. Es el modelo que hemos estado utilizando hasta ahora y significa que las variables del algoritmo principal que le pasamos al subalgoritmo, no pueden ser modificadas en su valor por dicho subalgoritmo.

```kotlin
// Paso por valor
fun suma(a: Int, b: Int): Int {
    a = a + 1
    return a + b
}
fun main() {
    var a = 2
    var b = 3
    println(suma(a, b))
    println(a) // El valor de a no ha cambiado, porque pasa por valor
}
```
- Paso por referencia: Se pasa la dirección de memoria, por lo tanto si modificamos el parámetro dentro de la función, se modifica el valor original. El parámetro del subalgoritmo, es decir, las modificaciones que sufra el parámetro, se reflejan en la variable que usamos en la llamada. En pseudocódigo reflejaremos esta situación con la palabra “Ref”. En los lenguajes actuales los tipos de datos simples pasan siempre por valor y los tipos compuestos pueden pasar por referencia. El paso por referencia se usa sobre todo cuando el subalgoritmo tiene que devolver más de un valor o trabajamos con objetos o estructuras de almacenamiento o colecciones, donde no es necesario indicar el Ref (lo veremos más adelante).

```kotlin 
// Paso por referencia, simulamos una llamada con Ref, que no existe en todos los lenguajes
fun suma(a: Ref(Int), b: Ref(Int)): Int {
    a = a + 1
    return a + b
}

fun sumElementosArrray(array: Array<Int>): Int {
    var suma = 0
    for (i in array) {
        suma += i
    }
    // Cambio un elemento del array
    array[0] = 100
    return suma
}

fun main() {
    var a = 2
    var b = 3
    println(suma(a, b))
    println(a) // El valor de a ha cambiado, porque pasa por referencia

    var array = arrayOf(1, 2, 3, 4, 5)
    println(sumElementosArrray(array))
    println(array[0]) // El valor del array ha cambiado, porque pasa por referencia
}
```
![Paso por valor y paso por referencia](https://i.stack.imgur.com/8XAQ1.gif)

### Ámbito de variables
El ámbito de una variable es el lugar donde se puede utilizar. Las variables pueden tener ámbito local o global. Las variables locales solo se pueden utilizar dentro de la función o procedimiento donde se han declarado. Las variables globales se pueden utilizar en cualquier parte del programa.
Se deben intentar no abusar de las variables globales ya que pueden provocar errores en el programa.

```kotlin
// Ámbito de variables
fun suma(a: Int, b: Int): Int {
    var c = 0 // Variable local
    var d = 0 // Variable local
    return a + b
}

var c = 0 // Variable global
fun main() {
    var a = 2 // Variable local
    var b = 3 // Variable local
    println(suma(a, b))
    println(c) // La variable c es global y se puede utilizar en cualquier parte del programa
}
```
### Paquete o módulo
Un paquete o módulo es un conjunto de funciones y procedimientos que realizan una tarea concreta. Por ejemplo, un paquete de funciones matemáticas, un paquete de funciones de entrada y salida, un paquete de funciones de gestión de arrays, etc. Usamos estos paquetes para agrupar funciones y procedimientos que realizan una tarea concreta y que podemos reutilizar en otros programas o en otras partes del mismo. 

```kotlin
// Paquete o módulo
import kotlin.math.* // importamos el paquete kotlin.math

fun main() {
    println(sqrt(4.0))
}
```

### Recursividad
La recursividad es una técnica que consiste en llamar a una función o procedimiento dentro de sí mismo. La función o procedimiento se llama a sí misma hasta que se cumple una condición que hace que la función o procedimiento deje de llamarse a sí misma (condición de parada o salida). 
Muchos problemas son mucho más sencillos de resolver con recursividad que con iteración. Por ejemplo, el cálculo de un factorial es mucho más sencillo de resolver con recursividad que con iteración.

```kotlin
// Recursividad factorial de un número
fun factorialRec(n: Int): Int {
    if (n == 0) {
        return 1
    } else {
        return n * factorialRec(n - 1)
    }
}

// Iteración factorial de un número
fun factorialIter(n: Int): Int {
    var factorial = 1
    for (i in 1..n) {
        factorial *= i
    }
    return factorial
}

fun main() {
    println(factorialRec(5))
    println(factorialIter(5))
}
```


## Referencias
- https://es.wikipedia.org/wiki/Tipo_de_dato
- https://es.wikipedia.org/wiki/Programaci%C3%B3n_estructurada
- https://es.wikipedia.org/wiki/Programaci%C3%B3n_modular
- https://es.stackoverflow.com/questions/1493/cu%C3%A1l-es-la-diferencia-entre-paso-de-variables-por-valor-y-por-referencia
- https://es.wikipedia.org/wiki/Recursi%C3%B3n



## Recursos
- Twitter: https://twitter.com/joseluisgonsan
- GitHub: https://github.com/joseluisgs
- Web: https://joseluisgs.github.io
- Discord del módulo: https://discord.gg/RRGsXfFDya
- Aula DAMnificad@s: https://discord.gg/XT8G5rRySU


## Autor

Codificado con :sparkling_heart: por [José Luis González Sánchez](https://twitter.com/joseluisgonsan)

[![Twitter](https://img.shields.io/twitter/follow/joseluisgonsan?style=social)](https://twitter.com/joseluisgonsan)
[![GitHub](https://img.shields.io/github/followers/joseluisgs?style=social)](https://github.com/joseluisgs)

### Contacto
<p>
  Cualquier cosa que necesites házmelo saber por si puedo ayudarte 💬.
</p>
<p>
 <a href="https://joseluisgs.github.io/" target="_blank">
        <img src="https://joseluisgs.github.io/img/favicon.png" 
    height="30">
    </a>  &nbsp;&nbsp;
    <a href="https://github.com/joseluisgs" target="_blank">
        <img src="https://distreau.com/github.svg" 
    height="30">
    </a> &nbsp;&nbsp;
        <a href="https://twitter.com/joseluisgonsan" target="_blank">
        <img src="https://i.imgur.com/U4Uiaef.png" 
    height="30">
    </a> &nbsp;&nbsp;
    <a href="https://www.linkedin.com/in/joseluisgonsan" target="_blank">
        <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/LinkedIn_logo_initials.png/768px-LinkedIn_logo_initials.png" 
    height="30">
    </a>  &nbsp;&nbsp;
    <a href="https://discordapp.com/users/joseluisgs#3560" target="_blank">
        <img src="https://logodownload.org/wp-content/uploads/2017/11/discord-logo-4-1.png" 
    height="30">
    </a> &nbsp;&nbsp;
    <a href="https://g.dev/joseluisgs" target="_blank">
        <img loading="lazy" src="https://googlediscovery.com/wp-content/uploads/google-developers.png" 
    height="30">
    </a>    
</p>

### ¿Un café?
<p><a href="https://www.buymeacoffee.com/joseluisgs"> <img align="left" src="https://cdn.buymeacoffee.com/buttons/v2/default-blue.png" height="50" alt="joseluisgs" /></a></p><br><br><br>

## Licencia de uso

Este repositorio y todo su contenido está licenciado bajo licencia **Creative Commons**, si desea saber más, vea la [LICENSE](https://joseluisgs.github.io/docs/license/). Por favor si compartes, usas o modificas este proyecto cita a su autor, y usa las mismas condiciones para su uso docente, formativo o educativo y no comercial.

<a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/4.0/"><img alt="Licencia de Creative Commons" style="border-width:0" src="https://i.creativecommons.org/l/by-nc-sa/4.0/88x31.png" /></a><br /><span xmlns:dct="http://purl.org/dc/terms/" property="dct:title">JoseLuisGS</span> by <a xmlns:cc="http://creativecommons.org/ns#" href="https://joseluisgs.github.io/" property="cc:attributionName" rel="cc:attributionURL">José Luis González Sánchez</a> is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/4.0/">Creative Commons Reconocimiento-NoComercial-CompartirIgual 4.0 Internacional License</a>.<br />Creado a partir de la obra en <a xmlns:dct="http://purl.org/dc/terms/" href="https://github.com/joseluisgs" rel="dct:source">https://github.com/joseluisgs</a>.
