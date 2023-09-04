package com.example.myapp.hafta2.odev3

class Personel(var ad:String,var soyad:String,var pozisyon:String,var maas:Int) {
    open fun maasArttir() {
        println("maasa zam yapildi!")
    }
}


fun main() {
    val prs1 = Personel("ilayda","karkus","genel mudur",30000)
    val prs2 = Personel("can","silaci","mudur yardimcisi",27500)
    val prs3 = Personel("ali","kuscu","komi",17900)
    println(prs1.ad +"," + prs1.soyad +","+  prs1.pozisyon +"," + prs1.maas)
    prs1.maasArttir()

    println(prs2.ad +", " + prs2.soyad +","+  prs2.pozisyon +","+ prs2.maas)
    prs2.maasArttir()

    println(prs3.ad + "," + prs3.soyad + "," + prs3.pozisyon + "," + prs3.maas)
    prs3.maasArttir()

}