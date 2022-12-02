class Hijos constructor(
    val edades: Array<Int>,
) {
    constructor() : this(Array(5){0})

    fun readEdades() {
        for (i in this.edades.indices) {
            this.edades[i] = obtenerNum("Edad ${i+1}: ")
        }
    }

    fun mayorIndex() {
        var max = 0
        var maxPos = 0
        for (i in this.edades.indices) {
            val e = this.edades[i]
            if (e >= max) {
                max = e
                maxPos = i
            }
        }
        println("La edad más grande ($max) se encuentra en la posición $maxPos")
    }

    fun promedio() {
        var sum = 0
        this.edades.forEach {
            sum += it
        }
        val prom = sum / this.edades.size.toFloat()
        println("El promedio de las edades es $prom")
    }
}
