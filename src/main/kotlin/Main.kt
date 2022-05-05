import kotlin.math.pow

fun ej1() {
    println("hola mundo!!! nashe")
}

fun ej2() {
    val n1: Int = 24
    val n2: Int = 6
    var suma = n1 + n2
    println("La suma es $suma")
    var producto = n1 * n2
    println("y el producto $producto")
}

fun ej3() {
    val alturaEnMetrosA: Float
    val alturaEnMetrosB: Float
    val alturaEnMetrosC: Float
    // la f hace falta si o si :/
    alturaEnMetrosB = 1.71f
    alturaEnMetrosA = 1.58f
    alturaEnMetrosC = 1.66f
    val promedio: Float = (alturaEnMetrosA + alturaEnMetrosB + alturaEnMetrosC) / 3 // pero acá no¿? :/
    println("El promedio es $promedio")
}

fun ej4() {
    val ancho = 20
    val alto = 35

    val perimetro = ancho * 2 + alto * 2
    val superficie = ancho * alto

    println("El perimetro del rectángulo es $perimetro y tiene una superficie de $superficie")
}

fun ej5() {
    print("Ingrese el número 1: ")
    val n1 = readLine()!!.toInt()
    print("Ingrese el número 2: ")
    val n2 = readLine()!!.toInt()
    val suma = n1 + n2
    println("La suma es $suma")
    val producto = n1 * n2
    println("y el producto $producto")
}

fun ej6() {
    print("Ingrese el precio del artículo: ")
    val precio = readLine()!!.toInt()
    print("Ingrese la cantidad que piensa comprar: ")
    val cantidad = readLine()!!.toInt()
    val total = precio * cantidad
    println("El cliente debe abonar $total")
}

fun ej7() {
    var total = 0
    for (n in 1..4) {
        print("Ingrese el número $n: ")
        total += readLine()!!.toInt()
    }
    val promedio = total / 4f
    println("El total es $total")
    println("Y el promedio $promedio")
}

fun ej8() {
    print("Ingrese su sueldo: ")
    val sueldo = readLine()!!.toInt()

    if (sueldo > 100_000) {
        println("tiene que pagar impuestos :(")
    } else {
        println("No tiene que pagar impuestos \uD83D\uDE0E")
    }
}

fun ej9() {
    print("Ingrese número 1: ")
    val n1 = readLine()!!.toInt()
    print("Ingrese número 2: ")
    val n2 = readLine()!!.toInt()

    val mayor = if (n1 > n2) n1 else n2

    println("El más grande es el $mayor")
}

fun ej10() {
    print("Ingrese el número 1: ")
    val n1 = readLine()!!.toInt()
    print("Ingrese el número 2: ")
    val n2 = readLine()!!.toInt()

    if (n1 < n2) {
        println("La suma es ${n1 + n2}")
        println("y la resta ${n2 - n1}")
    } else {
        println("El producto es ${n1 * n2}")
        println("y la división ${n1 / n2}")
    }
}

fun ej11() {
    var total = 0
    for (n in 1..3) {
        print("Ingrese la nota $n: ")
        total += readLine()!!.toInt()
    }
    val promedio = total / 3f
    if (promedio >= 7) {
        println("Promocionado")
    }
}

fun ej12() {
    var total = 0
    for (n in 1..3) {
        print("Ingrese el número $n: ")
        total += readLine()!!.toInt()
    }
    val promedio = total / 3f
    val nota =
        if (promedio >= 7) "Promocionado"
        else if (promedio >= 4) "Regular"
        else "Reprobado \uD83D\uDE2D\uD83D\uDE2D\uD83D\uDE2D"

    println(nota)
}

fun ej13() {
    print("Ingrese la cantidad total de preguntas: ")
    val total = readLine()!!.toInt() // se convierte después a float, no puede haber media pregunta
    print("Ingrese la cantidadd de correctas: ")
    val correctas = readLine()!!.toInt()
    val porc = correctas / total.toFloat()

    val nivel =
        if (porc >= .9f) "Nivel máximo"
        else if (porc >= .75f) "Nivel medio"
        else if (porc >= .5f) "Nivel regular"
        else if (porc >= .25f) "Nivel muy bajo"
        else "Fuera de nivel"

    println(nivel)
}


fun ej14() {
    print("Ingrese el día: ")
    val dia = readLine()!!.toInt()
    print("y el mes: ")
    val mes = readLine()!!.toInt()

    if (dia == 25 && mes == 12) {
        println("Merry christmas!! \uD83C\uDF85")
    } else {
        println("no es navidad :(")
    }
}

fun ej15() {
    print("Ingrese un número: ")
    val n1 = readLine()!!.toInt()
    print("y otro: ")
    val n2 = readLine()!!.toInt()
    print("y otro más...: ")
    val n3 = readLine()!!.toInt()

    if (n1 == n2 && n2 == n3) {
        val cubo = n1.toFloat().pow(3)
        println("El cubo es $cubo")
    } else {
        println("Los números no son iguales :P")
    }
}

fun ej16() {
    var algunoDeLosNumerosEsMenorADiez = false

    for (i in 1..3) {
        print("Ingrese el número $i: ")
        val n = readLine()!!.toInt()
        if (n < 10) algunoDeLosNumerosEsMenorADiez = true
    }

    if (algunoDeLosNumerosEsMenorADiez) {
        println("Alguno de los números es menor a diez... ඞ")
    } else {
        println("Ninguno de los números es menor a diez!!")
    }
}

fun main() {
    ej16()
}