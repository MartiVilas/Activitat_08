package org.example

open class Electrodomestics(preuBase: Int, color: Int, colors: Array<Int>, consum: Char, pes: Int) {


        var preuBase: Int=0
        var color: Int = 0
        private var colorString: Array<String> = arrayOf("Blanc","Verd","Vermell","Groc")
        var consum: Char = ' '
        var pes: Int=0


        // Métodos para acceder y modificar atributos

        // PreuBase
        fun setPreuBase(carrega: Int) {
            preuBase = carrega
        }

        fun getPreuBase(): Int {
            return this.preuBase
        }

        // Color
        fun setColor(nouColor: Int) {
            color = nouColor
        }

        fun getColor(): Int {
            return this.color
        }

        // Colors (Array)
        fun setColors(nousColors: Array<String>) {
            colorString = nousColors
        }

        fun getColors(): Array<String> {
            return this.colorString
        }

        // Consum
        fun setConsum(nouConsum: Char) {
            consum = nouConsum
        }

        fun getConsum(): Char {
            return this.consum
        }

        // Pes
        fun setPes(nouPes: Int) {
            pes = nouPes
        }

        fun getPes(): Int {
            return this.pes
        }


    fun preuFinal(): Int {
        var preuFinal = preuBase

        // Incremento en función del consumo
        when (consum) {
            'A' -> preuFinal += 35
            'B' -> preuFinal += 30
            'C' -> preuFinal += 25
            'D' -> preuFinal += 20
            'E' -> preuFinal += 15
            'F' -> preuFinal += 10
            'G' -> preuFinal += 0
        }

        // Incremento en función del peso
        preuFinal += when {
            pes in 6..20 -> 20
            pes <= 50 -> 50
            pes <= 80 -> 80
            else -> 100
        }
        return preuFinal
    }




}