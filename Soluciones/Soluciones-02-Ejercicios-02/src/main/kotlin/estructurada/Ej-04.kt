fun main() {
    var numero01 = 14.0
    var numero02 = 126.0
    var numero03 = 9.0
    var media = 0.0
    var mediaRedondeada = 0
    var mediaRedondeadaDosDecimales = 0.0

    println("Introduce el primer número")
    numero01 = readln().toDouble()
    println("Introduce el segundo número")
    numero02 = readln().toDouble()
    println("Introduce el tercer número")
    numero03 = readln().toDouble()

    media = (numero01 + numero02 + numero03) / 3
    var entera = media.toInt()
    var decimal = media - entera
    mediaRedondeadaDosDecimales = ((media * 100).toInt() / 100.0)


    if (decimal >= 0.5) {
        mediaRedondeada = entera + 1
    } else {
        mediaRedondeada = entera
    }


    println("La media es $media")
    println("La media redondeada es $mediaRedondeada")
    println("La media redondeada a dos decimales es $mediaRedondeadaDosDecimales")

    println("Fin")
}
