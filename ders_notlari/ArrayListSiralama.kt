package com.example.arraylist

fun main() {
    val kisi1 = Kisiler(1,"can")
    val kisi2 = Kisiler(2,"ilayda")
    val kisi3 = Kisiler(3,"belinay")
    val kisi4 = Kisiler(4,"aras")
    val kisi5 = Kisiler(8,"mehmet")
    val kisi6 = Kisiler(14,"ela")
    val kisilerArraylist =ArrayList<Kisiler>()
    kisilerArraylist.add(kisi1)
    kisilerArraylist.add(kisi2)
    kisilerArraylist.add(kisi3)
    kisilerArraylist.add(kisi4)
    kisilerArraylist.add(kisi5)
    kisilerArraylist.add(kisi6)


    for (kisi in kisilerArraylist){
        println("${kisi.kisiNo} - ${kisi.kisiAd}")

    }
    //sıralama işlemi
    println("sayısal olarak küçükten büyüğe sıralama")
    val siralamaArrayList1 = kisilerArraylist.sortedWith(compareBy{ it.kisiNo })
    for (siralama in siralamaArrayList1){
        println("${siralama.kisiNo} - ${siralama.kisiAd}")
    }
    println("büyükten küçüğe sıralama")

    val siralamaArrayList2 = kisilerArraylist.sortedWith(compareByDescending{ it.kisiNo })
    for (siralama in siralamaArrayList2){
        println("${siralama.kisiNo} - ${siralama.kisiAd}")
    }
    println("alfabetik sondan başa sıralama")
    val siralamaArrayList3 = kisilerArraylist.sortedWith(compareByDescending { it.kisiAd })
    for (siralama in siralamaArrayList3){
        println("${siralama.kisiNo} - ${siralama.kisiAd}")

    }
}