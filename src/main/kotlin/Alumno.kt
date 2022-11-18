class Alumno(
    val nombre: String = "",
    val apellido: String = "",
    val legajo: Int = 0,
    val nota: Int = 0,
) {
    constructor() : this(
        obtenerString("Nombre del alumno: "),
        obtenerString("Apellido: "),
        obtenerNum("N° de legajo: "),
        obtenerNum("Nota en Ap. de Nuevas Tecnologías: ")
    )

    fun aprobado() = this.nota >= 7
}