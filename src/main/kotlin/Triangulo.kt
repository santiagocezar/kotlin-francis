class Triangulo(
    val a: Int,
    val b: Int,
    val c: Int,
) {
    fun ladoMayor(): Int = maxOf(this.a, this.b, this.c)
    fun esEquilatero(): Boolean = this.a == this.b && this.b == this.c
}