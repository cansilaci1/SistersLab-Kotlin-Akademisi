package com.example.hafta3uygulama.ui.theme
//Sor: En büyük ortak böleni (EBOB) bulan bir Kotlin fonksiyonu nasıl yazılır?
fun ebobBul(sayi1: Int, sayi2: Int): Int {
    var ebob = 1 //
    var minSayi = if (sayi1 < sayi2) sayi1 else sayi2 //

    for (i in 1..minSayi) {
        if (sayi1 % i == 0 && sayi2 % i == 0) {
            ebob = i
        }
    }

    return ebob // geri dönüş tipi istediğimiz için return kullandık..
}

fun main() {
    val sayi1 = 12
    val sayi2 = 18
    val sonuc = ebobBul(sayi1, sayi2)

    println("EBOB($sayi1, $sayi2) = $sonuc")
}
