
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

        fun ej4() {
            val chichi = Mascota(
                "perro",
                "golden",
                "Chichi",
                4,
                "masculino"
            )
            val pochita = Mascota(
                "demonio",
                "sierra eléctrica",
                "Pochita",
                99,
                "indefinido"
            )
            val twitter = Mascota(
                "pájaro",
                "venteveo",
                "Twitter",
                5,
                "femenino"
            )

            chichi.mostrar()
            pochita.mostrar()
            if (twitter.esDomestico())
                println("Twitter es un animal doméstico!")
        }

        fun ej5(){
            val a = Punto(2, 4)
            val b = Punto(-3, 5)
            val c = Punto(7, -2)
            val d = Punto(-6, -1)
            val e = Punto(0, 3)

            a.printCuadrante()
            b.printCuadrante()
            c.printCuadrante()
            d.printCuadrante()
            e.printCuadrante()
        }

        fun ej6() {
            val hijos = Array(4) {
                Hijo()
            }

            println()
            for (hijo in hijos) {
                hijo.printMe()
                hijo.printCeluPar()
                hijo.printMayorDeEdad()
                println()
            }
        }
        
        fun ej7() {
            val hijos = Hijos()
            hijos.readEdades()

            hijos.mayorIndex()
            hijos.promedio()
        }
    }
}
