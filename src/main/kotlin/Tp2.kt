fun tp2ej1() {
    var i = 1
    while (i <= 100) {
        println("$i")
        i++
    }
}

fun tp2ej2() {
    var total = 0f
    var pares = 0
    var i = 0
    while (true) {
        print("Ingrese un número positivo (negativo para salir): ")
        val n = readLine()!!.toInt()
        if (n < 0) break

        total += n
        if (n % 2 == 0) pares++
        i++
    }

    println("Total: \t$total")
    println("Pares: \t$pares")
    println("Promedio: \t${total / i.toFloat()}")
}

fun tp2ej3() {
    var bajoCero = 0
    var suma = 0
    var sumaPositivas = 0
    var i = 0

    while (true) {
        print("Ingrese la temperatura (-100 para salir): ")
        val n = readLine()!!.toInt()
        if (n == -100) break

        i++
        suma += n
        if (n < 0) bajoCero++
        else sumaPositivas += n
    }

    println("Suma positiva: \t$sumaPositivas°C")
    println("Cant. bajo 0: \t$bajoCero")
    println("Promedio: \t${suma / i.toFloat()}°C")
    println("Cant. ingresada: \t$i")
}

fun tp2ej4() {
    var seccionMasProdValor = Int.MIN_VALUE
    var seccionMasProd = 0
    var total = 0
    var masDe20Pares = 0

    for (i in 1..10) {
        var prod = 0

        do {
            if (prod % 2 != 0) println("¡¡ingrese un numero par!!")
            print("Cuanto produció la sección #$i?: ")
            prod = readLine()!!.toInt()
        } while (prod % 2 != 0)

        if (prod > seccionMasProdValor) {
            seccionMasProdValor = prod
            seccionMasProd = i
        }
        if (prod > 40) masDe20Pares++
        total += prod
    }

    println("La sección que más produjo fue la #$seccionMasProd con ${seccionMasProdValor / 2} pares")
    println("El promedio de producción es de ${total / 10f}")
    println("Y $masDe20Pares secciones produjeron más de 20 pares")
}


fun tp2ej5() {
    var kgTotal = 0
    var masPesadoID = 0
    var masPesadoKg = 0
    var p1 = 0
    var p2 = 0
    var p3 = 0

    for (i in 1..100) {
        print("Ingrese el ID del contenedor (0 para salir): ")
        val id = readLine()!!.toInt()
        if (id == 0) break

        print("Peso (en kg) del contenedor: ")
        val kg = readLine()!!.toInt()
        var puerto = 0
        while (true) {
            print("Puerto de arribo: ")
            puerto = readLine()!!.toInt()

            when (puerto) {
                1 -> p1 ++
                2 -> p2 ++
                3 -> p3 ++
                else -> {
                    println("... ¡¿ese puerto no existe?!")
                    continue
                }
            }

            break
        }
        kgTotal += kg
        if (kg > masPesadoKg) {
            masPesadoID = id
            masPesadoKg = kg
        }
    }

    println("El buque trasladará ${p1+p2+p3} containers de $kgTotal kg en total, con el container mas pesado siendo el #$masPesadoID ($masPesadoKg kg)")
    println("$p1 van al puerto 1, $p2 al puerto 2 y $p3 al 3")
}

