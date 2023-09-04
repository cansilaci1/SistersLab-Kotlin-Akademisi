package com.example.myapp.hafta1.odev1

import java.util.Scanner

fun main() {

    var kullaniciAdi1 = "cansilaci"
    var sifre1 = "silacican"

    var scanner = Scanner(System.`in`)

    println("kullanici adinizi giriniz: ")
    var kullaniciAdi2 = scanner.next()

    println("sifrenizi giriniz: ")
    var sifre2 = scanner.next()

    if (kullaniciAdi2.equals(kullaniciAdi1, ignoreCase = true) && sifre2.equals(sifre1, ignoreCase = false)){
        println("HOSGELDINIZ!")
    }else{
        println("KULLANICI ADI VEYA SIFRE HATALI")
    }
    return main()
}



