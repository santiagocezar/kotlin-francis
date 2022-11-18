class Persona(
    val nombre: String = "",
    val apellido: String = "",
    val dni: Int = 0,
    val edad: Int = 0,
) {
    fun mostrar() {
        println("${this.nombre} ${this.apellido} (${this.dni}): ${this.edad} años")
    }

    fun esMayorDeEdad(): Boolean = this.edad >= 18
}