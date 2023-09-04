package com.example.arraylist

fun main() {
    val u1 = Urun(1,"saat",150.0)
    val u2 = Urun(2,"tv",175.0)
    val u3 = Urun(3,"bilgisayar",960.0)

    val urunler = ArrayList<Urun>()

    urunler.add(u1)
    urunler.add(u2)
    urunler.add(u3)

    for (urun in urunler){
        println("************")
        println("Urun no: ${urun.urunNo}")
        println("Urun adi: ${urun.urunAd}")
        println("Urunun fiyati: ${urun.urunFiyat}")
    }
}