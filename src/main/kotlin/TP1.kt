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
    print("Ingrese la cantidad de correctas: ")
    val correctas = readLine()!!.toInt()
    val porcentaje = correctas / total.toFloat()

    val nivel =
        if (porcentaje >= .9f) "Nivel máximo"
        else if (porcentaje >= .75f) "Nivel medio"
        else if (porcentaje >= .5f) "Nivel regular"
        else if (porcentaje >= .25f) "Nivel muy bajo"
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

fun ej17() {
    var total = 0
    for (i in 1..10) {
        print("Ingrese el número $i: ")
        total += readLine()!!.toInt()
    }

    println("El total ingresado es $total")
    println("y el promedio ${total / 10f}")
}

fun ej18() {
    val alumnos = 5
    var aprobados = 0
    for (i in 1..alumnos) {
        print("Ingrese la nota del alumno ($i/$alumnos): ")
        val nota = readLine()!!.toFloat()
        if (nota >= 7) aprobados++
    }

    when (aprobados) {
        0 -> println("No aprobó ninguno... Desaprobaron los $alumnos")
        alumnos -> println("Aprobaron todos ($alumnos alumnos)!!")
        else -> println("Aprobaron $aprobados y desaprobaron ${alumnos - aprobados}")
    }
}

fun ej19() {
    for (i in 0..20 step 2) println("- $i")
}

fun ej20() {
    for (i in 20 downTo 0 step 2) println("- $i")
}

fun ej21() {
    print("Cuantos números son: ")
    val cantidad = readLine()!!.toInt()
    var pares = 0
    for (i in 1..cantidad) {
        print("Ingrese el número $i: ")
        val n = readLine()!!.toInt()
        if (n % 2 == 0) pares++
    }

    when (pares) {
        0 -> println("Ninguno es par")
        1 -> println("Uno solo es par")
        else -> println("$pares son par")
    }
}

fun ej22() {
    print("Cuantos números son: ")
    val cantidad = readLine()!!.toInt()

    var menor = Int.MAX_VALUE
    var menorPos = 0

    for (i in 1..cantidad) {
        print("Ingrese el número $i: ")
        val n = readLine()!!.toInt()
        if (n < menor) {
            menor = n
            menorPos = i
        }
    }

    when (menorPos) {
        0 -> println("no pusiste ningún número \uD83E\uDD28️\uD83E\uDD28️\uD83E\uDD28️")
        1 -> println("El primero es el más chico")
        else -> println("El más chico está en la posición $menorPos")
    }
}

fun ej23() {
    print("Ingrese las horas trabajadas: ")
    val horas = readLine()!!.toInt()
    print("Ingrese el valor por la hora: ")
    val valorHora = readLine()!!.toFloat()
    print("Ingrese los meses de antigüedad: ")
    val antiguedad = readLine()!!.toInt() / 12f // convierte a años

    val sueldoBasico = horas * valorHora
    val sueldoNeto = sueldoBasico + sueldoBasico * .015f * antiguedad

    println("Sueldo neto: $$sueldoNeto")
}

fun ej24() {
    print("Ingrese el monto presupuestal: ")
    val presupuesto = readLine()!!.toInt()

    println("Cardiología: ${presupuesto * .4f}")
    println("Traumatología: ${presupuesto * .3f}")
    println("Pediatría: ${presupuesto * .3f}")
}

fun ej25() {
    print("Ingrese las horas trabajadas: ")
    var horas = readLine()!!.toInt()
    var total = 0
    if (horas > 40) {
        total += 450 * (horas - 40)
        horas = 40
        println("Trabajó horas extra")
    }
    total += 300 * horas
    println("El total es $total")
}

fun ej26() {
    print("Ingrese cuantos minutos se usó: ")
    val min = readLine()!!.toInt()
    print("Ingrese cuantas hojas se imprimieron: ")
    val hojas = readLine()!!.toInt()

    println("Uso de la computadora: $min minutos — $${min * .9f}")
    println("Impresión: $hojas hojas $${hojas * .07f}")
    println("Seguro: $${min * .05f / 100}")
}

fun ej27() {
    print("Ingrese las horas trabajadas: ")
    val horas = readLine()!!.toInt()
    print("Ingrese el valor por la hora: ")
    val valorHora = readLine()!!.toFloat()
    print("Ingrese los meses de antigüedad: ")
    val antiguedad = readLine()!!.toInt() / 12f // convierte a años

    val sueldoBasico = horas * valorHora

    val sueldoNeto = when {
        sueldoBasico > 50000 && antiguedad <= 10 -> sueldoBasico - 3000
        sueldoBasico <= 50000 && antiguedad >= 10 -> sueldoBasico * 1.3f
        else -> sueldoBasico
    }

    println("Sueldo básico: $$sueldoBasico")
    println("Sueldo neto: $$sueldoNeto")

}

fun ej28() {
    val dias = arrayOf("lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo")

    print("Ingrese el nombre de la localidad: ")
    val localidad = readLine()

    var mayor = Int.MIN_VALUE
    var diaMayor = ""
    var menor = Int.MAX_VALUE
    var diaMenor = ""
    var bajo0 = 0
    var sumaSobre0 = 0
    var suma = 0

    for (dia in dias) {
        print("Ingrese la temperatura del $dia: ")
        val temp = readLine()!!.toInt()

        if (temp > mayor) {
            mayor = temp
            diaMayor = dia
        }
        if (temp < menor) {
            menor = temp
            diaMenor = dia
        }
        if (temp < 0) {
            bajo0++
        }
        if (temp > 0) sumaSobre0 += temp
        suma += temp
    }

    println("")
    println("CLIMA EN $localidad")
    println("-    Día más calido registrado: el $diaMayor con $mayor°C")
    println("-    Día más frio registrado: el $diaMenor con $menor°C")
    println("-    Dias con temperaturas bajo 0°C: $bajo0")
    println("-    Suma de las temperaturas sobre 0°C: $sumaSobre0")
    println("-    Promedio en la semana: ${suma / 7f}")
}

fun ej29() {

    print("Ingrese la cantidad de productos: ")
    val n = readLine()!!.toInt()

    var damas = 0f
    var caballeros = 0f
    var nenes = 0f

    var total = 0f

    for (i in 1..n) {
        print("Código del producto (D/C/N): ")
        val cod = readLine()!!
        print("Ganancia: ")
        val ganancia = readLine()!!.toFloat()

        total += ganancia
        when (cod) {
            "D", "d" -> damas += ganancia
            "C", "c" -> caballeros += ganancia
            "N", "n" -> nenes += ganancia
        }
    }

    val porcDamas = damas / total * 100f
    val porcCaballeros = caballeros / total * 100f
    val porcNenes = nenes / total * 100f

    println("Ganancia total: $total\n")
    println("         Damas: $porcDamas%")
    println("    Caballeros: $porcCaballeros%")
    println("         Niños: $porcNenes%\n")

    val mayor = (
            if (damas > caballeros)
                if (nenes > damas) "nenes"
                else "damas"
            else
                if (nenes > caballeros) "nenes"
                else "caballeros"
            )

    val menor = (
            if (damas < caballeros)
                if (nenes < damas) "nenes"
                else "damas"
            else
                if (nenes < caballeros) "nenes"
                else "caballeros"
            )

    println("El que más recaudo fue $mayor")
    val masDel20 = when (menor) {
        "damas" -> porcDamas > 20f
        "caballeros" -> porcCaballeros > 20f
        "nenes" -> porcNenes > 20f
        else -> false // qué????????????
    }

    if (masDel20) println("Y el que menos recaudo fue $menor")
}

fun ej30() {
    print("Ingrese la cantidad de clientes: ")
    val n = readLine()!!.toInt()
    var total = 0f

    for (i in 1..n) {
        print("Ingrese el monto: ")
        val precio = readLine()!!.toFloat()
        val iva = precio * .21f

        print("Cuanto paga el cliente: ")
        val pago = readLine()!!.toFloat()

        println()
        println("COMPRA $i")
        println()
        println("MONTO:\t$$precio")
        println("IVA:\t$$iva")
        println()
        println("TOTAL:\t$${precio + iva}")
        println("VUELTO:\t$${pago - (precio + iva)}")
        println()
    }
}

fun ej31() {
    print("¿Cuantos corredores son?: ")
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        print("¿Cuanto pesa el corredor $i en kilos?: ")
        val kg = readLine()!!.toFloat()
        print("Metros recorridos: ")
        val m = readLine()!!.toFloat()
        print("¿En cuantos segundos?: ")
        val s = readLine()!!.toFloat()

        val perdio = m / 50f * 100f

        println("Perdió $perdio gramos. Ahora pesa ${kg - perdio / 1000f}.")

        if (perdio > 300) print("Necesita vitamina A")
        if (perdio > 450) print(" y C")
        println(".")

        if (m >= 400 && s < 25) println("Rompió el record del circuito olímpico de 400m 00:25s!")
        if (m >= 250 && s < 15) println("Rompió el record del circuito panamericano de 250m 00:15s!")
    }
}

fun ej32() {
    print("Ingrese el saldo: ")
    val saldo = readLine()!!.toInt()

    val prestamo = when {
        saldo < 0 -> 10_000 - saldo
        saldo > 20_000 -> 0
        else -> 20_000
    }

    if (prestamo != 0) println("Tendrá que pedir un prestamo de $prestamo")

    val mitad = (saldo + prestamo - 7_000) / 2f

    println("$5000.0 para el equipo de computo")
    println("$2000.0 para el mobiliario")
    println("$$mitad para la compra de insumos")
    println("$$mitad para el incentivo del presonal")
}

fun ej33() {
    print("Día: ")
    val dia = readLine()!!.toInt()
    print("Mes: ")
    val mes = readLine()!!.toInt()

    val signo = when {
        mes == 1 && dia < 21 -> "Capricornio"
        mes == 1 -> "Acuario"
        mes == 2 && dia < 20 -> "Acuario"
        mes == 2 -> "Piscis"
        mes == 3 && dia < 21 -> "Piscis"
        mes == 3 -> "Aries"
        mes == 4 && dia < 21 -> "Aries"
        mes == 4 -> "Tauro"
        mes == 5 && dia < 21 -> "Tauro"
        mes == 5 -> "Géminis"
        mes == 6 && dia < 22 -> "Géminis"
        mes == 6 -> "Cáncer"
        mes == 7 && dia < 23 -> "Cáncer"
        mes == 7 ->  "Leo"
        mes == 8 && dia < 24 -> "Leo"
        mes == 8 -> "Virgo"
        mes == 9 && dia < 23 -> "Virgo"
        mes == 9 -> "Libra"
        mes == 10 && dia < 23 -> "Libra"
        mes == 10 -> "Escorpio"
        mes == 11 && dia < 23 -> "Escorpio"
        mes == 11 -> "Sagitario"
        mes == 12 && dia < 22 -> "Sagitario"
        mes == 12 -> "Capricornio"
        else -> return
    }

    println("Tu signo es $signo")
}
