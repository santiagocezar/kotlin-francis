class Hijo constructor(
    val nombre: String = "",
    val apellido: String = "",
    val dni: Int = 0,
    val edad: Int = 0,
    val sexo: String = "X",
    val celular: Int = 0
) {
    constructor() : this(
        obtenerString("Nombre: "),
        obtenerString("Apellido: "),
        obtenerNum("DNI: "),
        obtenerNum("Edad: "),
        obtenerString("Sexo: "),
        obtenerNum("N° Celular: "),
    )

    fun printMe() {
        println("Nombre y apellido: $nombre $apellido")
        println("DNI: $dni")
        println("Sexo: $sexo")
    }

    fun printMayorDeEdad() {
        print("$nombre ")
        if (this.esMayorDeEdad())
            println("es mayor de edad")
        else
            println("es menor de edad")
    }

    fun printCeluPar() {
        print("$nombre tiene un número de celular ")
        if (this.celuPar())
            println("par")
        else
            println("impar")
    }

    fun esMayorDeEdad(): Boolean = this.edad >= 18
    fun celuPar(): Boolean = this.celular and 1 == 0
}