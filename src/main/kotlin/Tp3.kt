import kotlin.math.max
import kotlin.math.sqrt

class TP3 {
    companion object {

        // Ejercicio 1 //

        fun suma(a: Int, b: Int): Int = a + b
        fun resta(a: Int, b: Int): Int = a - b
        fun multi(a: Int, b: Int): Int = a * b
        fun divi(a: Int, b: Int): Float = a.toFloat() / b

        fun ej1() {
            print("Ingrese número A: ")
            val a = readLine()!!.toInt()
            print("Ingrese número B: ")
            val b = readLine()!!.toInt()

            println("Suma: ${suma(a, b)}")
            println("Resta: ${resta(a, b)}")
            println("Multiplicación: ${multi(a, b)}")
            println("División: ${divi(a, b)}")
        }

        // Ejercicio 2 //

        fun readAddPrint() {
            print("Ingrese número A: ")
            val a = readLine()!!.toInt()
            print("Ingrese número B: ")
            val b = readLine()!!.toInt()

            println("a + b = ${a + b}")
        }

        fun ej2() {
            for (i in 1..5) {
                readAddPrint()
                println("— - · - — - · - — - · - — - · - — - · - —")
            }
        }

        // Ejercicio 3 //

        fun tripleMax(a: Int, b: Int, c: Int): Int {
            return max(max(a, b), c)
        }

        fun ej3() {
            print("Ingrese número A: ")
            val a = readLine()!!.toInt()
            print("Ingrese número B: ")
            val b = readLine()!!.toInt()
            print("Ingrese número C: ")
            val c = readLine()!!.toInt()

            val maxest = tripleMax(a, b, c)

            println("$maxest es el máximo definitivo")
        }

        // Ejercicio 4 //

        fun area(l: Int): Int {
            return l * l
        }

        fun perimeter(l: Int): Int {
            return l * 4
        }

        fun ej4() {
            print("Ingrese el lado del cuadrado: ")
            val l = readLine()!!.toInt()

            while (true) {
                print("Calcular [P]erimetro o [A]rea: ")
                val res = when (readLine()!!.lowercase()) {
                    "a" -> area(l)
                    "p" -> perimeter(l)
                    else -> continue
                }
                println("El resultado es $res")
                break
            }
        }

        // Ejercicio 5 //

        fun areaRect(w: Int, h: Int): Int = w * h

        fun ej5() {
            print("Ingrese el ancho del rectángulo: ")
            val w = readLine()!!.toInt()
            print("Y el alto: ")
            val h = readLine()!!.toInt()

            println("El rectángulo tiene una superficie de ${areaRect(w, h)}")
        }

        // Ejercicio 6 //

        fun maxCasero(a: Int, b: Int): Int = if (a > b) {
            a
        } else {
            b
        }

        fun ej6() {
            print("Ingrese el número A: ")
            val a = readLine()!!.toInt()
            print("Ingrese el número B: ")
            val b = readLine()!!.toInt()

            println("El más grande es el ${maxCasero(a, b)}")
        }

        // Ejercicio 7 //

        fun lengthCasero(str: String): Int = str.length

        fun ej7() {
            print("Ingrese un nombre: ")
            val a = readLine()!!
            print("Ingrese otro nombre: ")
            val b = readLine()!!

            val maxLargo = if (lengthCasero(a) > lengthCasero(b)) {
                a
            } else {
                b
            }
            println("El nombre más largo es $maxLargo")
        }

        // Ejercicio 8 //

        fun multiSum(a: Int, b: Int, c: Int): Float {
            println("La suma es ${a + b + c}")
            return (a + b + c).toFloat() / 3f
        }

        fun ej8() {
            print("Ingrese el número A: ")
            val a = readLine()!!.toInt()
            print("Ingrese el número B: ")
            val b = readLine()!!.toInt()
            print("Ingrese el número C: ")
            val c = readLine()!!.toInt()

            val res = multiSum(a, b, c)
            println("El promedio es $res")
        }

        // Ejercicio 9 //

        fun promedio(a: Int, b: Int, c: Int) = (a + b + c).toFloat() / 3f

        fun ej9() {
            print("Ingrese el número A: ")
            val a = readLine()!!.toInt()
            print("Ingrese el número B: ")
            val b = readLine()!!.toInt()
            print("Ingrese el número C: ")
            val c = readLine()!!.toInt()

            val res = promedio(a, b, c)
            println("El promedio es $res")
        }

        // Ejercicio 10 //

        fun perimetro(w: Int, h: Int) = (w + h) * 2

        fun ej10() {
            print("Ingrese el ancho del rectángulo: ")
            val w = readLine()!!.toInt()
            print("Y el alto: ")
            val h = readLine()!!.toInt()

            println("El rectángulo tiene un perimetro de ${perimetro(w, h)}")
        }

        // Ejercicio 11 //

        fun lengthCasero1X(text: String) = text.length

        fun ej11() {
            print("Ingrese un nombre: ")
            val a = readLine()!!
            print("Ingrese otro nombre: ")
            val b = readLine()!!

            val maxLargo = if (lengthCasero1X(a) > lengthCasero1X(b)) {
                a
            } else {
                b
            }
            println("El nombre más largo es $maxLargo")
        }

        // Ejercicio 12 //

        fun condicion(nota1: Int, nota2: Int) = if (nota1 >= 6 && nota2 >= 6)
        // en vez de dividir para averiguar el promedio simplemente
        // comparar la suma con 14 (que equivale a 7 * 2).
        // el resultado es exactamente el mismo.
            if (nota1 + nota2 >= 14) "P"
            else "R"
        else "L"

        fun ej12() {
            while (true) {
                print("Legajo N°: ")
                val legajo = readLine()!!.toInt()
                if (legajo < 0) break

                print("Ingrese la nota del 1er parcial: ")
                val nota1 = readLine()!!.toInt()
                print("Ingrese la nota del 2er parcial: ")
                val nota2 = readLine()!!.toInt()

                val cond = when (condicion(nota1, nota2)) {
                    "P" -> "promocionó"
                    "R" -> "regularizó"
                    "L" -> "quedó libre"
                    else -> "??????"
                }


                println("Estado de alumn@: $cond")
            }
        }

        fun menuSuma(a: Int, b: Int) = println("La suma es ${a + b}")
        fun menuResta(a: Int, b: Int) = println("La resta es ${a - b}")
        fun menuMulti(a: Int, b: Int) = println("El producto es ${a * b}")
        fun menuDivi(a: Int, b: Int) = println("La división es ${a / b.toFloat()}")
        fun menuCuadrado(a: Int, b: Int) = println("Los cuadrados son ${a * a} y ${b * b}")
        fun menuRaiz(a: Int, b: Int) = println("Las raices son ${sqrt(a.toFloat())} y ${sqrt(b.toFloat())}")

        fun ej13() {
            print("Ingrese el número A: ")
            val a = readLine()!!.toInt()
            print("Ingrese el número B: ")
            val b = readLine()!!.toInt()

            while (true) {
                print(
                    """======== Menú ==========
                |[1] Suma
                |[2] Resta
                |[3] Multiplicación
                |[4] División
                |[5] Potencia de 2
                |[6] Raíz cuadrada
                |[7] Salir
                |=== Elija una opción ===
                |> """.trimMargin()
                )

                when (val r = readLine()) {
                    "1" -> menuSuma(a, b)
                    "2" -> menuResta(a, b)
                    "3" -> menuMulti(a, b)
                    "4" -> menuDivi(a, b)
                    "5" -> menuCuadrado(a, b)
                    "6" -> menuRaiz(a, b)
                    "7" -> break
                    else -> println("$r no es una opción")
                }
            }
        }

        fun obtenerSexo(): String {
            while (true) {
                print("Ingrese sexo: ")
                when (readLine()) {
                    "M", "m" -> return "m"
                    "F", "f" -> return "f"
                    "X", "x" -> return "x"
                }
                println("Ese no es una sexo que nuestro sistema soporte")
            }
        }

        fun obtenerNum(msg: String, err: String): Int {
            while (true) {
                print(msg)
                val n = readLine()!!.toIntOrNull()
                if (n != null) return n
                println(err)
            }
        }

        fun obtenerEdad(sex: String): Int {
            while (true) {
                var edad = obtenerNum("Ingrese la edad: ", "Ingrese una edad válida")
                when (sex) {
                    "m" -> if (edad > 70) return edad
                    "f" -> if (edad > 60) return edad
                }
                println("Ingrese una edad válida")
            }
        }

        fun ej14() {
            val sex = obtenerSexo()
            val edad = obtenerEdad(sex)
            val sem = obtenerNum("Ingrese el número de semanas: ", "Ingrese un número válido")

            var importe = sem * when (sex) {
                "m" -> 7000
                "f" -> 5000
                else -> 0
            }

            importe += when {
                sex == "m" && edad > 75 -> 2000
                sex == "f" && edad > 65 -> 2500
                else -> 0
            }

            println("El importe es $importe")
        }

        fun ej15() {
            var mul2 = 0
            var mul5 = 0
            for (i in 1..10) {
                val n = obtenerNum("Ingrese un número: ", "Ingrese un número válido")

                if (n % 2 == 0) mul2++
                if (n % 5 == 0) mul5++
            }
            println("Múltiplos de 2: $mul2")
            println("Múltiplos de 5: $mul5")
        }

        fun mayoresQue(n1: Int, n2: Int, n3: Int, que: Int) = n1 >= que && n2 >= que && n3 >= que
        fun plural(n: Int, sing: String, plur: String) = if (n == 1) sing else plur

        fun ej16() {
            var total = 0
            var admitidos = 0
            var mayor8 = 0

            while (true) {
                val err = "No es una nota válida"
                val n1 = obtenerNum("Ingrese la nota del examen de física: ", err)
                val n2 = obtenerNum("Ingrese la nota del examen de química: ", err)
                val n3 = obtenerNum("Ingrese la nota del examen de matemática: ", err)

                if (n1 == 0 && n2 == 0 && n3 == 0) break

                total++

                if (mayoresQue(n1, n2, n3, 6)) {
                    println("Admitido")
                    admitidos++
                } else println("Debe recuperar")

                if (mayoresQue(n1, n2, n3, 8)) mayor8++
            }
            val sacar = plural(mayor8, "sacó", "sacaron")
            val porcAdmitidos = admitidos / total.toFloat() * 100
            val porcRecupera = 100 - porcAdmitidos
            println("$mayor8 se $sacar más de 8 8 en los 3 exámenes")
            println("El $porcAdmitidos% fue admitido")
            println("El $porcRecupera% tiene que recuperar")
        }

        fun obtenerInfracción(): Int {
            val err = "Ingrese una infracción válida"
            while (true) {
                val n = obtenerNum("Ingrese el tipo de infracción: ", err)
                if (n in 0..4) return n
                println(err)
            }
        }

        fun obtenerGravedad(): String {
            while (true) {
                print("Ingrese la gravedad: ")
                when (readLine()) {
                    "L", "l" -> return "l"
                    "M", "m" -> return "m"
                    "G", "g" -> return "g"
                }
                println("No es una gravedad válida")
            }
        }

        fun ej17() {
            var valorLeve = 0
            var valorMedio = 0
            var valorGrave = 0
            var menorTipo = 0
            var menorValor = Int.MAX_VALUE
            var strike = 0

            while (true) {
                val tipo = obtenerInfracción()
                if (tipo == 0) break

                val gravedad = obtenerGravedad()
                val valor = obtenerNum("Ingrese el valor de la multa: ", "No es un valor válido")


                when (gravedad) {
                    "l" -> valorLeve += valor
                    "m" -> valorMedio += valor
                    "g" -> valorGrave += valor
                }

                if (tipo in 3..4 && gravedad == "g") {
                    strike++
                }

                if (valor < menorValor) {
                    menorTipo = tipo
                    menorValor = valor
                }
            }

            println("Total multas leves: $$valorLeve")
            println("Total multas intermedias: $$valorMedio")
            println("Total multas graves: $$valorGrave")

            if (strike >= 3) print("¡CLAUSUREN LA FÁBRICA!")

            println("La multa menor fue de tipo $menorTipo y costó $$menorValor")
        }



/*
Ejercicio 18

Realizar un programa que calcule el sueldo líquido de un empleado a comisión. Utilizar las siguientes condiciones:
- Sueldo básico (Ingresado por teclado)
- Monto de ventas del empleado en el mes (Ingresado por teclado)
- La comisión de ventas es:
  - hasta $10.000 → 2 %
  - entre $10.000 y $50.000 → 3,5 %
  - entre $50.000 y $100.000 → 5 %
- Los descuentos por Obra Social y Aporte Jubilatorio son del 6% sobre el básico. (se cobra siempre)
- Se suma el 10% del básico en caso de cumplir con el “Presentismo” (se debe consultar si cumple dicha condición).
- Luego de realizar los cálculos correspondientes, mostrar:
  - Sueldo Básico
  - Porcentaje de comisión
  - Importe que representa el descuento
  - Sueldo líquido
El programa debe permitir hacer este cálculo para una cantidad de N empleados. Utilizar funciones en la forma que crea adecuada.
*/


fun obtenerSiNo(msg: String, default: Boolean = true): Boolean {
    while (true) {
        val cartel = if (default) " [Y/n]: " else " [y/N]: "
        print(msg + cartel)
        val n = readLine()!!
        if (n == "") return default
        when (n[0]) {
            'Y', 'y', 'S', 's' -> return true
            'N', 'n' -> return false
        }
    }
}

fun ej18() {
    val sueldoBasico = obtenerNum("Ingrese el sueldo básico: ", "No es un número").toFloat()
    var descuento = sueldoBasico * .06f
    if (obtenerSiNo("Cumple con el presentismo?"))
        descuento -= sueldoBasico * 1.10f
    val montoVentas = obtenerNum("Ingrese el monto mensual de ventas del empleado: ", "No es un mono válido")

    val comision = when {
        montoVentas < 10_000 -> .02f
        montoVentas < 50_000 -> .035f
        else -> .05f
    }

    println("Sueldo básico $$sueldoBasico")
    println("Comisión de ventas ${comision * 100}%")
    println("Descuento del sueldo $$descuento")
    println("Sueldo líquido $${sueldoBasico - descuento}")
}

/*
Un censador recopila ciertos datos aplicando encuestas para el Censo Nacional de Población y Vivienda. Diseñe un
programa que le permita al censador ingresar los datos de N encuestas y, como fin del proceso, genere un informe
con los resultados obtenidos. Cada tarjeta contiene la siguiente información:
- Nº de censo (nro de dni)
- sexo: (‘F’ o ‘M’)
- edad (en números)
- estado civil: (1) soltero, (2)casado, (3) viudo, (4) divorciado.
- estudio: (1) primaria, (2)secundaria, (3)universitario, (4) posgrado.
- vivienda: (1) alquila, (2) propia (3) prestada.
Informar porcentaje por sexo, estudio y estado de la vivienda sobre el total de encuestas procesadas. Utilizar
funciones como crea conveniente.
 */

fun obtenerRango(rango: IntRange, msg: String, err: String): Int {
    while (true) {
        val n = obtenerNum(msg, err)
        if (rango.contains(n)) return n
        println(err)
    }
}

fun printPorcentaje(msg: String, valor: Int, total: Int) {
    val porc = valor / total.toFloat() * 100;
    println("$msg: $porc%")
}


fun ej19() {
    val encuestas = obtenerNum("Cuantas encuestas son: ", "No es un número")

    var m = 0
    var f = 0
    val estudios = arrayOf(0, 0, 0, 0)
    val viviendas = arrayOf(0, 0, 0)

    for (i in 1..encuestas) {
        val dni = readLine()!!
        val sexo = obtenerSexo()
        val edad = obtenerNum("Edad nidel encuestado: ", "No es un número")
        val estado =
            obtenerNum("Estado civil (1: soltero, 2: casado, 3: viudo, 4: divorciado): ", "No es estado válido")
        val estudio = obtenerRango(
            1..4,
            "Estudios (1: primaria, 2: secundaria, 3: universitario, 4: posgrado): ",
            "No es un nivel válido"
        )
        val vivienda =
            obtenerRango(1..4, "Vivienda (1: alquilada, 2: propia, 3: prestada): ", "No es un número")

        when (sexo) {
            "m" -> m++
            "f" -> f++
        }
        estudios[estudio - 1] ++
        viviendas[vivienda - 1] ++
    }

    println("Sexo:")
    printPorcentaje("- Masculino", m, encuestas)
    printPorcentaje("- Femenino", f, encuestas)
    printPorcentaje("- Otros", encuestas - f - m, encuestas)
    println("Estudios:")
    printPorcentaje("- Primario", estudios[0], encuestas)
    printPorcentaje("- Secundario", estudios[1], encuestas)
    printPorcentaje("- Universitario", estudios[2], encuestas)
    printPorcentaje("- Posgrado", estudios[3], encuestas)
    println("Vivienda:")
    printPorcentaje("- Alquilado", viviendas[0], encuestas)
    printPorcentaje("- Propia", viviendas[1], encuestas)
    printPorcentaje("- Prestada", viviendas[2], encuestas)
}
    }

}
