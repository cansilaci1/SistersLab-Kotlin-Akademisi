package com.example.arraylist
//arraylist boyutları dinamik dizilerdir
// add() fonksiyonu diziye veri eklemek için kullanılır
fun main() {
    val liste = ArrayList<String>() // 1. arraylist tanımlama yöntemi
    val liste2: ArrayList<Int> = ArrayList<Int>() // 2. arraylist tanımlama yöntemi


    val meyveler = ArrayList<String>()
    meyveler.add("armut")//0
    meyveler.add("muz")//1
    meyveler.add("kivi")//2
    meyveler.add("kiraz")//3
    meyveler.add("vişne")//4
    println(meyveler)

    val str = meyveler.get(2)
    println(str)
    val str1 = meyveler.get(4)
    println(str1)
}