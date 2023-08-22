package com.example.ilkprojem

import java.util.Scanner

fun main() {
    /*val scanner = Scanner(System.`in`)
    println("bir sayi giriniz")
    val deger = scanner.nextInt()
    sayiDegerlendir(deger) */

    val scanner = Scanner(System.`in`)
    println("bir karakter giriniz")
    val karakter = scanner.next().first()
    karakterDegerlendir(karakter)
    scanner.close()

}
fun sayiDegerlendir(deger: Int){
    when(deger){
        1 -> println("sayi 1'e esittir")
        2,3 -> println("sayi 2'ye veya 3'e esittir")
        in 4..10 -> println("sayi 4le 10 arasindadir")
        else -> println("sayi hic bir kosulu saglamiyor")
    }
}
fun karakterDegerlendir(karakter: Char){
    when(karakter){
        'A','E','I','D','U' -> println("vokal harf")
        in 'a'..'z' -> println("kucuk harf")
        in '0'..'9' -> println("sayi")
        else -> println("ozel harf veya buyuk harf")
    }
}














