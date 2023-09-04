package com.example.myapp.hafta2.odev2


class Oyuncu(){
    //oyuncu adlı üst class'ı nasıl kullanacağımı bilemedim, ayrıca koddan tasarruf oldu :)
}

open class Futbolcu(){
    open fun oyna(){
        var oyuncu1 = "Can Sılacı "
        println(oyuncu1 + "oynuyor")
    }
}

open class Basketbolcu(){
    open fun oyna(){
        var oyuncu2 = "Samet Korkmaz "
        println(oyuncu2 + "oynuyor")
    }
}


fun main() {
    var oync1 = Futbolcu()
    var oync2 = Basketbolcu()
    oync1.oyna()
    oync2.oyna()
}