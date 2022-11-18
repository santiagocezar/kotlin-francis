
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
            val lauti = Triangulo(60, 90, 50)
            val sami = Triangulo(45, 45, 45)
            val juani = Triangulo(99, 99, 99)
            val santi = Triangulo(80, 60, 80)

            val ladoMayorLauti = lauti.ladoMayor()
            println("lado mayor del bauti $ladoMayorLauti")
            val samiEqui = sami.esEquilatero()
            println(    "el cami es equilatero? $samiEqui")
        }
    }
}

fun main() {
    TP5.ej2()
}
