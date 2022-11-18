
class TP5 {
    companion object {
        fun ej1() {

            val milton = Persona(
                "Milton", "Echenique", 45093381, 19
            )
            val joa = Persona(
                "Joaquín", "Granados", 45698466, 18
            )

            joa.mostrar()
            if (milton.esMayorDeEdad()) {
                println("a tragar")
            }
        }

        fun ej2() {
            val triangulos = Array(3) {
                Triangulo()
            }

            for (i in triangulos.indices) {
                val tri = triangulos[i]
                val mayor = tri.ladoMayor()
                val equi = if (tri.esEquilatero()) "si" else "no"
                println("lado mayor del triangulo ${i+1}: $mayor")
                println("es equilatero? $equi")
            }
        }

        fun ej3() {
            val alumnos = Array(4) {
                Alumno()
            }

            for (alumno in alumnos) {
                print("${alumno.nombre} está ")

                if (alumno.aprobado()) {
                    println("aprobado \uD83E\uDD73")
                } else {
                    println("desaprobado \uD83D\uDE2D")
                }
            }
        }
    }
}

fun main() {
    TP5.ej2()
}
