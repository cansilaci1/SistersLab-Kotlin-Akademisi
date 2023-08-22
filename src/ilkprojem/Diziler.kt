package com.example.ilkprojem
//Aynı veri tipine sahip birden çok elemanı tutmak için kullanılır
//Aynı tipte elemanlar tutulur.(Örn. Integer deger tutacaksak tüm elemanlarımız int olmalı)
//val diziAdi: Array<Tipi> = arrayOf(eleman1,eleman2,eleman3.....) 1. elemanın indexi 0'dır
//joinToString() fonskiyonu ile dizideki elemanları virgülle ayırarak birleştirme işlemi yapar
fun main() {
   /* val isimler: Array<String> = arrayOf("can","ilayda","samet","erhan")
    //println("isimler: ${isimler.joinToString ()}")
   // println("isimler: $isimler")
    print("isimler:")
    for (i in isimler.indices){
        print(isimler[i])
        if (i<isimler.size-1){
            print(",")
        }
    }*/
  /*  val notlar: Array<Double> = arrayOf(98.9,56.8,56.98,46.6,98.7,76.7)
    println("notlar: ${notlar.joinToString()}")
    val yaslar: Array<Int> = arrayOf(23,56,12,91,45)
    println("yaşlar = ${yaslar.joinToString()}")
    val sayilar: Array<Int> = arrayOf(5,26,12,23,54,15)
    for (sayi in sayilar){
        println(sayi)*/
    /*val sayilar : Array<Int> = arrayOf(23,15,21,42,5)
    for (index in sayilar.indices){
        val deger = sayilar[index]
        println("$index. Indexteki değer: $deger")
    }
    val toplama: Array<Int> = arrayOf(23,21,56,54,52,41,53,61,49,82)
    var toplam = 0
    for (sayi in toplama){
        toplam += sayi

    }*/
    //println("dizi elemanlarının toplamı :" + toplam)
    val sayilar: Array<Int> = arrayOf(0,-55,2,3,4,5565,6,7,89)
    // dizideki elemanları buyukten kucuge sıralayan komut: .sortedArrayDescendimg
    val azalan = sayilar.sortedArrayDescending()
    println("buyukten kucuge: " + azalan.joinToString())
}
