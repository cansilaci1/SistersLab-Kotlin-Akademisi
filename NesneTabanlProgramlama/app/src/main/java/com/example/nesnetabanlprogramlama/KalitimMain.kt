package com.example.nesnetabanlprogramlama
//Kalıtım bir sınıfın özelliklerini başka sınıfa aktarabilir.
//kalıtım sınıflar arası geçerlidir
//Eğer ben bir özelliğimi başka bir sınıfa aktaracaksam classın başına open getirmeliyim.
//Özelliğini aldığım sınıfım superclass'ım olur
//diğer alt sınıflar subclass şeklinde tanımlanır.
//alt sınıftan üst sınıfa erişim sağlanır fakat üst sınıftan alt sınıfa erişim sağlanamaz

fun main() {
    var topkapiSarayi = Saray(10,5)
    var bogazVilla = Villa(4,true)
    println(topkapiSarayi.pencereSayisi)
    println(topkapiSarayi.kuleSayisi)

    println(bogazVilla.garajVarMi)
    println(bogazVilla.pencereSayisi)
}
