package com.example.arraylist

fun main() {
    val meyveler = ArrayList<String>()

    meyveler.add("kavun")
    meyveler.add("armut")
    meyveler.add("kiraz")
    meyveler.add("visne")
    for (meyve in meyveler){
        println("sonuc: $meyve")
    }

}