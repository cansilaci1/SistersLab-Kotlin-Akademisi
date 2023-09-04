package com.example.myapp.hafta2.odev1



import java.util.Scanner


 class Dikdortgen {
    open fun hesapla(){
        var scanner = Scanner(System.`in`)
        println("dikdortgenin kisa kenar uzunlugunu giriniz: ")
        var kisaKenar = scanner.nextInt()
        println("dikdortgenin uzun kenar uzunlugunu giriniz: ")
        var uzunKenar = scanner.nextInt()
        var dikdortgenAlan = kisaKenar * uzunKenar
        var dikdortgenCevre = 2 * (kisaKenar + uzunKenar)
        println("dikdortgenin alanı = $dikdortgenAlan")
        println("dikdortgenin cevresi = $dikdortgenCevre")
    }

}

class Daire {
    open fun hesapla(){
        var scanner = Scanner(System.`in`)
        println("dairenin yaricap uzunlugunu giriniz: ")
        var yaricap = scanner.nextDouble()
        var daireAlan = 3.14 * yaricap * yaricap
        var daireCevre = 2 * 3.14 * yaricap
        println("dairenin alani = $daireAlan")
        println("dairenin cevresi = $daireCevre")
    }

}

fun main() {
    val dikdortgen = Dikdortgen()
    dikdortgen.hesapla()

    val daire = Daire()
    daire.hesapla()

}