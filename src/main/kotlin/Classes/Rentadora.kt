package org.example.Classes

class Rentadora(preuBase: Int, color: Int, colorString: Array<String>, consum: Char, pes: Int,
                private var carrega: Int) : Electrodomestics(preuBase, color, colorString, consum, pes) {

    fun setCarrega(novaCarrega: Int) {
        carrega = novaCarrega
    }

    fun getCarrega(): Int {
        return carrega
    }

    override fun toString(): String {
        return "Rentadora \n" +
                "PreuBase: $preuBaseElectrodomestics\n" +
                "Color: $colorElectrodomestics\n" +
                "Consum: $consumElectrodomestics\n" +
                "Pes: $pesElectrodomestics\n" +
                "Carrega: $carrega"
    }
}
