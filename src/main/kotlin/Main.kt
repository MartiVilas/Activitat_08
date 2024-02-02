package org.example

import org.example.Classes.Rentadora
import org.example.Classes.Televisio

fun main() {

    var rentadora:Rentadora=Rentadora(800,3, colorString =  arrayOf("Blanc","Verd","Vermell","Groc"),'A',200,0)
    rentadora.setPreuBase(900)
    rentadora.setColor(2)
    rentadora.setColors(arrayOf("Blanc","Verd","Vermell","Groc"))
    rentadora.setConsum('B')
    rentadora.setPes(25)
    rentadora.setCarrega(10)
    println(rentadora.toString())
    println()

    val televisio :Televisio= Televisio(1200, 2, arrayOf("Blanc","Verd","Vermell","Groc"), 'C', 15, 55)
    televisio.setPreuBase(1500)
    televisio.setColor(1)
    televisio.setColors(arrayOf("Blanc","Verd","Vermell","Groc"))
    televisio.setConsum('A')
    televisio.setPes(20)
    televisio.setMida(65)
    println(televisio.toString())

}