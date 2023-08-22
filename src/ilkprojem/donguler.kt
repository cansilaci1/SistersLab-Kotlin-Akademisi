package com.example.ilkprojem

import java.util.Scanner

// döngüler belirli bir işlemi bir veya daha fazla kez tekrarlanmasını istediğimiz durumlar için kullanılır
//döngü çeşitleri ---------- for, while
fun main() {
    /* var i = 1
    while (i<=5){
        println("sayi = $i")
        i++
    }*/
    /*val scanner = Scanner(System.`in`)
    println("çarpım tablosunu görmek istediğiniz sayı değerini giriniz")
    val sayi = scanner.nextInt()

    var i = 1
    while (i <= 10) {

        val carpim = sayi * i
        println("$sayi * $i = $carpim")
        i++

    }
    scanner.close()*/
/*
    val baslangic = 1
    val bitis = 10

    for (i in baslangic..bitis){
        println("sayı: $i")
    }
*/
    val scanner = Scanner(System.`in`)
    println("faktoriyelini hesaplamak istediginiz degeri giriniz:")
    val sayi = scanner.nextInt()

    var faktoriyel = 1
    for (i in 1..sayi){
        faktoriyel *= i
    }
    println(faktoriyel)
}
