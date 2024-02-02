package org.example.Classes

open class Electrodomestics {
    var preuBaseElectrodomestics: Int = 0
    var colorElectrodomestics: Int = 0
    private var colorString: Array<String> = arrayOf("Blanc", "Verd", "Vermell", "Groc")
    var consumElectrodomestics: Char = ' '
    var pesElectrodomestics: Int = 0

    constructor(preuBase: Int, color: Int, colorString: Array<String>, consum: Char, pes: Int) {
        this.preuBaseElectrodomestics = preuBase
        this.colorElectrodomestics = color
        this.colorString = colorString
        this.consumElectrodomestics = consum
        this.pesElectrodomestics = pes
    }

    fun setPreuBase(carrega: Int) {
        preuBaseElectrodomestics = carrega
    }

    fun getPreuBase(): Int {
        return this.preuBaseElectrodomestics
    }

    fun setColor(nouColor: Int) {
        colorElectrodomestics = nouColor
    }

    fun getColor(): Int {
        return this.colorElectrodomestics
    }

    fun setColors(nousColors: Array<String>) {
        colorString = nousColors
    }

    fun getColors(): Array<String> {
        return this.colorString
    }

    fun setConsum(nouConsum: Char) {
        consumElectrodomestics = nouConsum
    }

    fun getConsum(): Char {
        return this.consumElectrodomestics
    }

    fun setPes(nouPes: Int) {
        pesElectrodomestics = nouPes
    }

    fun getPes(): Int {
        return this.pesElectrodomestics
    }

    fun preuFinal(): Int {
        var preuFinal = preuBaseElectrodomestics

        // Incremento en función del consumo
        when (consumElectrodomestics) {
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
            pesElectrodomestics in 6..20 -> 20
            pesElectrodomestics <= 50 -> 50
            pesElectrodomestics <= 80 -> 80
            else -> 100
        }
        return preuFinal
    }
}


