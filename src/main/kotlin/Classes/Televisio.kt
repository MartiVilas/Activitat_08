package org.example.Classes

class Televisio( preuBase: Int, color: Int, colorString: Array<String>,consum: Char, pes: Int,
                 private var mida: Int) : Electrodomestics(preuBase, color, colorString, consum, pes) {

    fun setMida(novaMida: Int) {
        mida = novaMida
    }

    fun getMida(): Int {
        return mida
    }

    override fun toString(): String {
        return "Televisio \n" +
                "PreuBase: $preuBaseElectrodomestics\n" +
                "Color: $colorElectrodomestics\n" +
                "Consum: $consumElectrodomestics\n" +
                "Pes: $pesElectrodomestics\n" +
                "Mida: $mida"
    }
}
