package com.example.arraylist
// Set(HashSet)
// arraylist ile aynı özelliklere sahiptir
//bazı farklılıklar vardır
//eklenen veriler düzensiz yerleşir
//aynı isimle iki veriyi kaydedemiyoruz
//

//setOf sadece verileri okuyabildiğimiz yapı
//mutableSetOf ve HashSet aynı anlama geliyor sadece isimleri üzerinde farklı değişiklik yapabildiğimiz ve veri okuyabildiğimiz yapılar
//HashSet
fun main() {
    val meyveler = setOf<String>("çilek","muz","karpuz","armut","elma","kiraz","erik","vişne")
    val iller = mutableSetOf<String>("ankara","artvin","bursa","mugla","izmir","istanbul")
    val sayilar = HashSet<Int>()
    sayilar.add(1)
    sayilar.add(7)
    sayilar.add(3029)
    sayilar.add(21)
    sayilar.add(21) // 21 elemanından iki tane var fakat ekrana yazdırmak istediğimizde sadece bir tanesini yazdırır
    sayilar.add(25)
    println(sayilar.toString())
    println(sayilar.elementAt(1))

    for((i,s) in sayilar.withIndex()){
        println("$i -> $s")
    }
}