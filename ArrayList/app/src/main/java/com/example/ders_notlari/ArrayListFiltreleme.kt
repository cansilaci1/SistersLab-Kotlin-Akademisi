package com.example.arraylist

fun main() {
    val ogrenci1 = Ogrenci(1,"can","4d")
    val ogrenci2 = Ogrenci(2,"ilayda","3b")
    val ogrenci3 = Ogrenci(3,"aras","1a")
    val ogrenci4 = Ogrenci(4,"belinay","5f")

    val ogrenciArrayList = ArrayList<Ogrenci>()
    ogrenciArrayList.add(ogrenci1)
    ogrenciArrayList.add(ogrenci2)
    ogrenciArrayList.add(ogrenci3)
    ogrenciArrayList.add(ogrenci4)

    //val sonucListe = ogrenciArrayList.filter { it.ogrenciNo > 2 }

    val sonucListe = ogrenciArrayList.filter { it.ogrenciAd.contains("y") }

    for (ogrenciListeleme in sonucListe){
        println("${ogrenciListeleme.ogrenciNo} - ${ogrenciListeleme.ogrenciAd} - ${ogrenciListeleme.ogrenciSinif}")
    }
}