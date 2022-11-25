data class Punto constructor(val x: Int, val y: Int) {
    fun cuadrante(): Int {
        return when {
            this.x > 0 && this.y > 0 -> 1
            this.x < 0 && this.y > 0 -> 2
            this.x < 0 && this.y < 0 -> 3
            this.x > 0 && this.y < 0 -> 4
            else -> 0
        }
    }

    fun printCuadrante() {
        val c = this.cuadrante()

        print("El punto ($x; $y) ")
        when (c) {
            0 -> println("se encuentra sobre un eje")
            else -> println("se encuentra en el cuadrante $c")
        }
    }
}