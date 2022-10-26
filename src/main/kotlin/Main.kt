import kotlin.random.Random

class TP4 {
    companion object {
        fun ej1() {
            val arr = Array(5) {
                print("Ingrese el número ${it + 1}: ")
                readLine()!!.toFloat()
            }

            println("El primero fue el ${arr[0]}")
            println("Y el úlitmo el ${arr[4]}")
        }

        fun ej2() {
            val arr = Array(10) {
                print("Ingrese el sueldo del empleado N°${it + 1}: ")
                readLine()!!.toFloat()
            }

            arr.forEachIndexed { i, sueldo ->
                println("El empleado N°${i + 1} cobra $sueldo")
            }
        }

        fun ej3() {
            val arr = Array(5) {
                print("Ingrese la altura de la persona N°${it + 1}: ")
                readLine()!!.toFloat()
            }

            val prom = arr.sum() / arr.size
            var bajo = 0
            var alto = 0

            arr.forEach {
                if (it > prom) alto++
                else bajo++
            }

            println("$bajo personas están por debajo del promedio")
            println("y $alto por encima del promedio")
        }

        fun ej4() {
            val ar1 = Array(4) {
                print("Ingrese el N°${it + 1} del arreglo 1: ")
                readLine()!!.toInt()
            }
            val ar2 = Array(4) {
                print("Ingrese el N°${it + 1} del arreglo 2: ")
                readLine()!!.toInt()
            }
            val arr = Array(4) {
                ar1[it] + ar2[it]
            }
            arr.forEach {
                println("$it")
            }
        }

        fun ej5() {
            val arr = Array(4) {
                print("Ingrese el N°${it + 1}: ")
                readLine()!!.toInt()
            }

            print("Ingrese el número a buscar: ")
            val busc = readLine()!!.toInt()

            var pos = -1

            arr.forEachIndexed { i, it ->
                if (it == busc) pos = i
            }

            if (pos >= 0) {
                println("$busc está en la posición $pos")
            } else {
                println("$busc no existe en el arreglo")
            }
        }


        fun ej6() {
            val arr = Array(10) {
                print("Ingrese el N°${it + 1}: ")
                readLine()!!.toInt()
            }

            val power = arr.map {
                it * it
            }
            arr.forEach {
                print("$it ")
            }
            println()
            power.forEach {
                print("$it ")
            }
            println()
        }

        fun ej7() {
            val temps = Array(31) {
                Random.nextInt(-20, 20)
            }

            val total = temps.sum()

            temps.forEachIndexed { i, temp ->
                if ((total > 0 && i % 2 == 0) || (total <= 0 && i % 2 == 1)) {
                    println("$i => $temp°C")
                }
            }
        }

        fun ej8() {
            val nums = Array(10) {
                Random.nextInt(10)
            }

            var inc = 0
            var dec = 0
            var prev = nums[0]
            nums.forEach {
                if (it < prev) {
                    dec++
                } else if (it > prev) {
                    inc++
                }
                prev = it
            }

            println("Creció $inc veces")
            println("Dereció $dec veces")
        }

        fun ej9() {
            val nums = Array(10) {
                Random.nextInt(10)
            }
            nums.forEachIndexed { i, it ->
                if (i == 0) {
                    print("[$it")
                } else {
                    print(", $it")
                }
            }
            println("]")

            for (i in 1 until nums.size) {
                for (j in 0 until nums.size - i) {
                    if (nums[j] > nums[j + 1]) {
                        val tmp = nums[j]
                        nums[j] = nums[j + 1]
                        nums[j + 1] = tmp
                    }
                }
            }

            nums.forEachIndexed { i, it ->
                if (i == 0) {
                    print("[$it")
                } else {
                    print(", $it")
                }
            }
            println("]")
        }


        fun ej10() {
            var n = 0

            do {
                print("ingrese cuantos elementos tiene el vector: ")
                n = readLine()!!.toInt()
            } while (n >= 25)

            val nums = Array(n) {
                Random.nextInt(n)
            }

            nums.forEachIndexed { i, it ->
                if (i == 0) {
                    print("[$it")
                } else {
                    print(", $it")
                }
            }
            println("]")

            for (i in 1 until nums.size) {
                for (j in 0 until nums.size - i) {
                    if (nums[j] > nums[j + 1]) {
                        val tmp = nums[j]
                        nums[j] = nums[j + 1]
                        nums[j + 1] = tmp
                    }
                }
            }

            nums.forEachIndexed { i, it ->
                if (i == 0) {
                    print("[$it")
                } else {
                    print(", $it")
                }
            }
            println("]")
        }

        fun <T> printArray(arr: Array<T>) = printArraySize(arr,arr.size)

        fun <T> printArraySize(arr: Array<T>, size: Int) {
            for (i in 0 until size) {
                if (i == 0) {
                    print("[${arr[i]}")
                } else {
                    print(", ${arr[i]}")
                }
            }
            println("]")
        }

        fun ej11() {
            val nums = Array(10) {
                print("Ingrese el N°${it + 1}: ")
                readLine()!!.toInt()
            }

            var prev = nums[0]
            for (n in nums) {
                if (n < prev) {
                    println("no está ordenado...")
                    return
                }
                prev = n
            }
            println("esta ordenado!")
        }

        fun ej12() {
            var n: Int

            do {
                print("ingrese cuantos elementos tiene el vector: ")
                n = readLine()!!.toInt()
            } while (n >= 25)

            val nums = Array(n) {
                Random.nextInt(n)
            }
            printArray(nums)

            val ordFun: (Int, Int) -> Boolean
            while (true) {
                print("como quiere ordenar el vector? > (mayor a menor) ó < (menor a mayor): ")
                ordFun = when (readLine()!!) {
                    ">" -> { a, b -> a < b }
                    "<" -> { a, b -> a > b }
                    else -> continue
                }
                break
            }

            for (i in 1 until nums.size) {
                for (j in 0 until nums.size - i) {
                    if (ordFun(nums[j], nums[j + 1])) {
                        val tmp = nums[j]
                        nums[j] = nums[j + 1]
                        nums[j + 1] = tmp
                    }
                }
            }

            printArray(nums)
        }

        fun ordenar(arr: Array<Int>, size: Int, ord: (Int, Int) -> Boolean): Array<Int> {
            for (i in 1 until size) {
                for (j in 0 until size - i) {
                    if (ord(arr[j], arr[j + 1])) {
                        val tmp = arr[j]
                        arr[j] = arr[j + 1]
                        arr[j + 1] = tmp
                    }
                }
            }
            return arr
        }

        fun obtenerOrdenamiento(msg: String): (Int, Int) -> Boolean {
            while (true) {
                print("$msg > (mayor a menor) ó < (menor a mayor): ")
                when (readLine()!!) {
                    ">" -> return { a, b -> a < b }
                    "<" -> return { a, b -> a > b }
                }
            }
        }

        fun ej13() {
            val arr = Array(30) {
                Random.nextInt(1, 35)
            }

            var calor = Array(30) {0}
            var frio = Array(30) {0}
            var calorPos = 0
            var frioPos = 0

            var total = 0

            for (temp in arr) {
                total += temp
                if (temp > 20) {
                    calor[calorPos++] = temp
                } else{
                    frio[frioPos++] = temp
                }
            }

            val calorOrd = obtenerOrdenamiento("Como ordenar las temperaturas mayores a 20")
            val frioOrd = obtenerOrdenamiento("Como ordenar las temperaturas menores a 20")

            calor = ordenar(calor, calorPos, calorOrd)
            frio = ordenar(frio, frioPos, frioOrd)

            println("Promedio de las temperaturas ${total.toFloat() / arr.size}")

            print("Mayores a 20: ")
            printArraySize(calor, calorPos)
            print("Menores a 20: ")
            printArraySize(frio, frioPos)
        }

        fun ej14() {
            print("ingrese cuantos elementos tiene el vector: ")
            val n = readLine()!!.toInt()

            val pri = Array(n) {
                Random.nextInt(n*2)
            }
            val sec = Array(n) {
                Random.nextInt(n*2)
            }
            val tri = Array(n) {
                0
            }
            var triPos = 0

            for (n1 in pri) {
                var ta = false
                for (n2 in sec) {
                    if (n1 == n2) {
                        ta = true
                        break
                    }
                }
                if (!ta) {
                    tri[triPos++] = n1
                }
            }

            printArray(pri)
            printArray(sec)
            printArraySize(tri, triPos)
        }
    }
}

fun main() {
    TP4.ej14()
}
