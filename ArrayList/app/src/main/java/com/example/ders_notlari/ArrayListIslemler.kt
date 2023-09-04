package com.example.arraylist

fun main() {
    val meyveler = ArrayList<String>()

    meyveler.add("cilek")
    meyveler.add("kivi")
    meyveler.add("muz")
    meyveler.add("karpuz")
    meyveler.add("mango")

    println(meyveler.isEmpty()) //Dizinin bos mu dolu mu oldugunu ekrana yazdırır

    println(meyveler.count()) //Dizinin kaç elemanlı olduğunu ekrana yazdırır

    println(meyveler.first()) //dizinin ilk elemanını ekrana yazdırır

    println(meyveler.last()) //dizinin son elemanını ekrana yazdırır

    println(meyveler.contains("elma")) //dizinin içinde bu elemanın olup olmadıgını ekrana yazdırır

    println(meyveler.max()) // dizinin elemanlarının arasında alfabetik sırada en son olan harfli elemanı yazdırır

    println(meyveler.min()) //dizinin elemanlarının arasında alfabetik sırada birinci olan harfli elemanı yazdırır

    meyveler.sort() // sıralama işlemi
    println(meyveler.toString())

    meyveler.reverse()// elemanları ters cevirdik
    println(meyveler.toString())

    meyveler.removeAt(3) //3. indexli elemanı diziden siler
    println(meyveler.toString())

    meyveler.remove("cilek")
    println(meyveler.toString())

    meyveler.clear()//listenin içindeki tüm elemanları siler
    println(meyveler.toString())
}