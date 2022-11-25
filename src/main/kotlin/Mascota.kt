class Mascota constructor(
    val animal: String,
    val raza: String,
    val nombre: String,
    val edad: Int,
    val sexo: String
) {
    fun mostrar() {
        println("$nombre es un $animal de raza $raza de $edad años con sexo $sexo")
        if (this.esDomestico())
            println("es domestico!")
        else
            println("no es domestico.")
    }

    fun esDomestico(): Boolean {
        return when (this.animal) {
            "perro" -> true
            "gato" -> true
            "pájaro" -> true
            else -> false
        }
    }
}