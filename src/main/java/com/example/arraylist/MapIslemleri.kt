package com.example.arraylist
/*
* Map(HashMap)
* key ve value yapısıyla çalışır.
* key ile verilere erişiriz
* key ve value farklı türlerde olabilir.
* mutable olmazsa map üzerinde değişiklikler yapılamaz
* mapOf sadece üzerinde veri okuma yapılır
* mutableMapOf ve HashMap ikisi aynı özelliklere sahiptir sadece isimleri farklı(hem veri okuma hem de verilerde düzenleme yapılabilir)
* */
fun main() {
    val sayilar = mapOf<Int,String>(1 to "bir" , 2 to "iki")
    val oranlar = mutableMapOf(0.5 to "oran1", 1.4 to "oran2")
    val iller = HashMap<Int,String>()
    iller.put(16,"bursa")
    iller.put(6,"ankara")
    iller.put(8,"artvin")
    println(iller.toString())
    //VERİ GÜNCELLEME

    iller.put(16,"ankara")
    println(iller.toString())

    //VERİ OKUMA

    println(iller.get(8))

    for ((anahtar,deger) in iller){
        println("$anahtar -> $deger")
    }
    iller.remove(16)
    println(iller.toString())
}