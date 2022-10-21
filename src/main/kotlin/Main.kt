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
                println("El empleado N°${i+1} cobra $sueldo")
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
                if (it > prom) alto ++
                else bajo ++
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

            arr.forEachIndexed {i, it ->
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
                it*it
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
                if ((total > 0 && i % 2 == 0) || (total <= 0 && i %2 == 1)) {
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
                    dec ++
                } else if (it > prev) {
                    inc ++
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
            nums.forEachIndexed { i, it -> if (i == 0) {
                print("[$it")
            } else {
                print(", $it")
            }}
            println("]")

            for (i in 1 until nums.size) {
                for (j in 0 until nums.size-i) {
                    if (nums[j] > nums[j+1]) {
                        val tmp = nums[j]
                        nums[j] = nums[j+1]
                        nums[j+1] = tmp
                    }
                }
            }

            nums.forEachIndexed { i, it -> if (i == 0) {
                print("[$it")
            } else {
                print(", $it")
            }}
            println("]")
        }


        fun ej10() {
            var n = 0

            do {
                print("ingrese cuantos elementos tiene el vector: ")
                n= readLine()!!.toInt()
            } while (n >= 25)

            val nums = Array(n) {
                Random.nextInt(n)
            }

            nums.forEachIndexed { i, it -> if (i == 0) {
                print("[$it")
            } else {
                print(", $it")
            }}
            println("]")

            for (i in 1 until nums.size) {
                for (j in 0 until nums.size-i) {
                    if (nums[j] > nums[j+1]) {
                        val tmp = nums[j]
                        nums[j] = nums[j+1]
                        nums[j+1] = tmp
                    }
                }
            }

            nums.forEachIndexed { i, it -> if (i == 0) {
                print("[$it")
            } else {
                print(", $it")
            }}
            println("]")
        }
    }
}

fun main() {
    TP4.ej10()
}
